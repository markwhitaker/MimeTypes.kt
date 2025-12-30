package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class MimeTypesApplicationTest {
    @Test
    fun testApplicationAtomXml() = assertEquals("application/atom+xml", MimeTypes.Application.ATOM_XML)

    @Test
    fun testApplicationAtomCatXml() = assertEquals("application/atomcat+xml", MimeTypes.Application.ATOMCAT_XML)

    @Test
    fun testApplicationEcmascript() = assertEquals("application/ecmascript", MimeTypes.Application.ECMASCRIPT)

    @Test
    fun testApplicationEpubZip() = assertEquals("application/epub+zip", MimeTypes.Application.EPUB_ZIP)

    @Test
    fun testApplicationGzip() = assertEquals("application/gzip", MimeTypes.Application.GZIP)

    @Test
    fun testApplicationJavaArchive() = assertEquals("application/java-archive", MimeTypes.Application.JAVA_ARCHIVE)

    @Test
    fun testApplicationJavascript() = assertEquals("application/javascript", MimeTypes.Application.JAVASCRIPT)

    @Test
    fun testApplicationJson() = assertEquals("application/json", MimeTypes.Application.JSON)

    @Test
    fun testApplicationLdJson() = assertEquals("application/ld+json", MimeTypes.Application.LD_JSON)

    @Test
    fun testApplicationManifestJson() = assertEquals("application/manifest+json", MimeTypes.Application.MANIFEST_JSON)

    @Test
    fun testApplicationMp4() = assertEquals("application/mp4", MimeTypes.Application.MP4)

    @Test
    fun testApplicationMsword() = assertEquals("application/msword", MimeTypes.Application.MSWORD)

    @Test
    fun testApplicationOctetStream() = assertEquals("application/octet-stream", MimeTypes.Application.OCTET_STREAM)

    @Test
    fun testApplicationOgg() = assertEquals("application/ogg", MimeTypes.Application.OGG)

    @Test
    fun testApplicationPdf() = assertEquals("application/pdf", MimeTypes.Application.PDF)

    @Test
    fun testApplicationPkcs10() = assertEquals("application/pkcs10", MimeTypes.Application.PKCS_10)

    @Test
    fun testApplicationPkcs7Mime() = assertEquals("application/pkcs7-mime", MimeTypes.Application.PKCS_7_MIME)

    @Test
    fun testApplicationPkcs7Signature() =
        assertEquals("application/pkcs7-signature", MimeTypes.Application.PkKCS_7_SIGNATURE)

    @Test
    fun testApplicationPkcs8() = assertEquals("application/pkcs8", MimeTypes.Application.PKCS_8)

    @Test
    fun testApplicationPostscript() = assertEquals("application/postscript", MimeTypes.Application.POSTSCRIPT)

    @Test
    fun testApplicationRdfXml() = assertEquals("application/rdf+xml", MimeTypes.Application.RDF_XML)

    @Test
    fun testApplicationRssXml() = assertEquals("application/rss+xml", MimeTypes.Application.RSS_XML)

    @Test
    fun testApplicationRtf() = assertEquals("application/rtf", MimeTypes.Application.RTF)

    @Test
    fun testApplicationSmilXml() = assertEquals("application/smil+xml", MimeTypes.Application.SMIL_XML)

    @Test
    fun textVndAmazonEbook() = assertEquals("application/vnd.amazon.ebook", MimeTypes.Application.VND_AMAZON_EBOOK)

    @Test
    fun textVndAppleInstallerXml() = assertEquals("application/vnd.apple.installer+xml", MimeTypes.Application.VND_APPLE_INSTALLER_XML)

    @Test
    fun textVndMozillaXulXml() = assertEquals("application/vnd.mozilla.xul+xml", MimeTypes.Application.VND_MOZILLA_XUL_XML)

    @Test
    fun textVndMsExcel() = assertEquals("application/vnd.ms-excel", MimeTypes.Application.VND_MS_EXCEL)

    @Test
    fun textVndMsFontobject() = assertEquals("application/vnd.ms-fontobject", MimeTypes.Application.VND_MS_FONTOBJECT)

    @Test
    fun textVndMsPowerpoint() = assertEquals("application/vnd.ms-powerpoint", MimeTypes.Application.VND_MS_POWERPOINT)

    @Test
    fun textVndOasisOpendocumentPresentation() =
        assertEquals("application/vnd.oasis.opendocument.presentation",
            MimeTypes.Application.VND_OASIS_OPENDOCUMENT_PRESENTATION)

    @Test
    fun textVndOasisOpendocumentSpreadsheet() =
        assertEquals("application/vnd.oasis.opendocument.spreadsheet",
            MimeTypes.Application.VND_OASIS_OPENDOCUMENT_SPREADSHEET)

    @Test
    fun textVndOasisOpendocumentText() =
        assertEquals("application/vnd.oasis.opendocument.text",
            MimeTypes.Application.VND_OASIS_OPENDOCUMENT_TEXT)

    @Test
    fun textVndOpenxmlformatsOfficedocumentPresentationmlPresentation() =
        assertEquals("application/vnd.openxmlformats-officedocument.presentationml.presentation",
            MimeTypes.Application.VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION)

    @Test
    fun textVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet() =
        assertEquals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
            MimeTypes.Application.VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET)

    @Test
    fun textVndOpenxmlformatsOfficedocumentWordprocessingmlDocument() =
        assertEquals("application/vnd.openxmlformats-officedocument.wordprocessingml.document",
            MimeTypes.Application.VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT)

    @Test
    fun textVndRar() = assertEquals("application/vnd.rar", MimeTypes.Application.VND_RAR)

    @Test
    fun textVndVisio() = assertEquals("application/vnd.visio", MimeTypes.Application.VND_VISIO)

    @Test
    fun textX7zCompressed() = assertEquals("application/x-7z-compressed", MimeTypes.Application.X_7Z_COMPRESSED)

    @Test
    fun textXAbiword() = assertEquals("application/x-abiword", MimeTypes.Application.X_ABIWORD)

    @Test
    fun textXBzip() = assertEquals("application/x-bzip", MimeTypes.Application.X_BZIP)

    @Test
    fun textXBzip2() = assertEquals("application/x-bzip2", MimeTypes.Application.X_BZIP2)

    @Test
    fun textXCdf() = assertEquals("application/x-cdf", MimeTypes.Application.X_CDF)

    @Test
    fun textXCsh() = assertEquals("application/x-csh", MimeTypes.Application.X_CSH)

    @Test
    fun testApplicationXFontOtf() = assertEquals("application/x-font-otf", MimeTypes.Application.X_FONT_OTF)

    @Test
    fun testApplicationXFontTtf() = assertEquals("application/x-font-ttf", MimeTypes.Application.X_FONT_TTF)

    @Test
    fun testApplicationXFontWoff() = assertEquals("application/x-font-woff", MimeTypes.Application.X_FONT_WOFF)

    @Test
    fun textXFreearc() = assertEquals("application/x-freearc", MimeTypes.Application.X_FREEARC)

    @Test
    fun textXHttpdPhp() = assertEquals("application/x-httpd-php", MimeTypes.Application.X_HTTPD_PHP)

    @Test
    fun testApplicationXPkcs12() = assertEquals("application/x-pkcs12", MimeTypes.Application.X_PKCS_12)

    @Test
    fun textXSh() = assertEquals("application/x-sh", MimeTypes.Application.X_SH)

    @Test
    fun testApplicationXShockwaveFlash() =
        assertEquals("application/x-shockwave-flash", MimeTypes.Application.X_SHOCKWAVE_FLASH)

    @Test
    fun testApplicationXSilverlightApp() =
        assertEquals("application/x-silverlight-app", MimeTypes.Application.X_SILVERLIGHT_APP)

    @Test
    fun textXTar() = assertEquals("application/x-tar", MimeTypes.Application.X_TAR)

    @Test
    fun testApplicationXhtmlXml() = assertEquals("application/xhtml+xml", MimeTypes.Application.XHTML_XML)

    @Test
    fun testApplicationXml() = assertEquals("application/xml", MimeTypes.Application.XML)

    @Test
    fun testApplicationXmlDtd() = assertEquals("application/xml-dtd", MimeTypes.Application.XML_DTD)

    @Test
    fun testApplicationXsltXml() = assertEquals("application/xslt+xml", MimeTypes.Application.XSLT_XML)

    @Test
    fun testApplicationXWwwFormUrlencoded() =
        assertEquals("application/x-www-form-urlencoded", MimeTypes.Application.X_WWW_FORM_URLENCODED)

    @Test
    fun testApplicationZip() = assertEquals("application/zip", MimeTypes.Application.ZIP)
}