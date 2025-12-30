package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert
import org.junit.Test

class MimeTypesTextTest {
    @Test
    fun testTextCalendar() = Assert.assertEquals("text/calendar", MimeTypes.Text.CALENDAR)

    @Test
    fun testTextCss() = Assert.assertEquals("text/css", MimeTypes.Text.CSS)

    @Test
    fun testTextCsv() = Assert.assertEquals("text/csv", MimeTypes.Text.CSV)

    @Test
    fun testTextHtml() = Assert.assertEquals("text/html", MimeTypes.Text.HTML)

    @Test
    fun testTextJavascript() = Assert.assertEquals("text/javascript", MimeTypes.Text.JAVASCRIPT)

    @Test
    fun testTextMarkdown() = Assert.assertEquals("text/markdown", MimeTypes.Text.MARKDOWN)

    @Test
    fun testTextPlain() = Assert.assertEquals("text/plain", MimeTypes.Text.PLAIN)

    @Test
    fun testTextRichtext() = Assert.assertEquals("text/richtext", MimeTypes.Text.RICHTEXT)

    @Test
    fun testTextSgml() = Assert.assertEquals("text/sgml", MimeTypes.Text.SGML)

    @Test
    fun testTextXml() = Assert.assertEquals("text/xml", MimeTypes.Text.XML)

    @Test
    fun testTextYaml() = Assert.assertEquals("text/yaml", MimeTypes.Text.YAML)
}