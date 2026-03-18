plugins {
    `java-library`
    `maven-publish`
    signing
    kotlin("jvm") version "2.3.10"
    id("org.jetbrains.dokka") version "2.0.0"
}

val junitVersion = "4.13.2"

repositories {
    mavenCentral()
}

group = "uk.co.mainwave.mimetypes"
version = getGitVersion()

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("junit:junit:$junitVersion")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

java {
    withSourcesJar()
}

val dokkaJavadocJar by tasks.registering(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles a JAR containing the Javadoc"
    from(tasks.dokkaJavadoc.flatMap { it.outputDirectory })
    archiveClassifier.set("javadoc")
    dependsOn(tasks.dokkaJavadoc)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifact(dokkaJavadocJar)
            pom {
                name.set("MimeTypes.kt")
                description.set("A structured collection of MIME type constants for Kotlin")
                url.set("https://github.com/markwhitaker/MimeTypes.kt")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("markwhitaker")
                        name.set("Mark Whitaker")
                        url.set("https://github.com/markwhitaker")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/markwhitaker/MimeTypes.kt.git")
                    developerConnection.set("scm:git:ssh://github.com/markwhitaker/MimeTypes.kt.git")
                    url.set("https://github.com/markwhitaker/MimeTypes.kt")
                }
            }
        }
    }
    repositories {
        maven {
            name = "ossrh"
            val releasesRepoUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            val snapshotsRepoUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            credentials {
                username = System.getenv("OSSRH_USERNAME")
                password = System.getenv("OSSRH_PASSWORD")
            }
        }
    }
}

signing {
    val signingKey = System.getenv("GPG_SIGNING_KEY")
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")
    if (!signingKey.isNullOrEmpty() && !signingPassword.isNullOrEmpty()) {
        useInMemoryPgpKeys(signingKey, signingPassword)
        sign(publishing.publications["maven"])
    }
}

fun getGitVersion() = try {
    val process = ProcessBuilder("git", "describe", "--tags", "--always").start()
    val output = process.inputStream.bufferedReader().readLine()
    process.waitFor()
    output
} catch (_: Exception) {
    "1.0.0"
}
