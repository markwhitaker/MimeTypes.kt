package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert
import org.junit.Test

class MimeTypesMultipartTest {
    @Test
    fun testMultipartByteranges() = Assert.assertEquals("multipart/byteranges", MimeTypes.Multipart.BYTERANGES)

    @Test
    fun testMultipartEncrypted() = Assert.assertEquals("multipart/encrypted", MimeTypes.Multipart.ENCRYPTED)

    @Test
    fun testMultipartFormData() = Assert.assertEquals("multipart/form-data", MimeTypes.Multipart.FORM_DATA)

    @Test
    fun testMultipartRelated() = Assert.assertEquals("multipart/related", MimeTypes.Multipart.RELATED)
}