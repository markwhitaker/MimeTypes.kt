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
    fun testApplicationJavaArchive() = assertEquals("application/java-archive", MimeTypes.Application.JAVA_ARCHIVE)

    @Test
    fun testApplicationJavascript() = assertEquals("application/javascript", MimeTypes.Application.JAVASCRIPT)

    @Test
    fun testApplicationJson() = assertEquals("application/json", MimeTypes.Application.JSON)

    @Test
    fun testApplicationMp4() = assertEquals("application/mp4", MimeTypes.Application.MP4)

    @Test
    fun testApplicationOctetStream() = assertEquals("application/octet-stream", MimeTypes.Application.OCTET_STREAM)

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
    fun testApplicationXFontOtf() = assertEquals("application/x-font-otf", MimeTypes.Application.X_FONT_OTF)

    @Test
    fun testApplicationXFontTtf() = assertEquals("application/x-font-ttf", MimeTypes.Application.X_FONT_TTF)

    @Test
    fun testApplicationXFontWoff() = assertEquals("application/x-font-woff", MimeTypes.Application.X_FONT_WOFF)

    @Test
    fun testApplicationXPkcs12() = assertEquals("application/x-pkcs12", MimeTypes.Application.X_PKCS_12)

    @Test
    fun testApplicationXShockwaveFlash() =
        assertEquals("application/x-shockwave-flash", MimeTypes.Application.X_SHOCKWAVE_FLASH)

    @Test
    fun testApplicationXSilverlightApp() =
        assertEquals("application/x-silverlight-app", MimeTypes.Application.X_SILVERLIGHT_APP)

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
