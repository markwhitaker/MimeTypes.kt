package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert
import org.junit.Test

class MimeTypesFontTest {
    @Test
    fun testFontCollection() = Assert.assertEquals("font/collection", MimeTypes.Font.COLLECTION)

    @Test
    fun testFontOtf() = Assert.assertEquals("font/otf", MimeTypes.Font.OTF)

    @Test
    fun testFontSfnt() = Assert.assertEquals("font/sfnt", MimeTypes.Font.SFNT)

    @Test
    fun testFontTtf() = Assert.assertEquals("font/ttf", MimeTypes.Font.TTF)

    @Test
    fun testFontWoff() = Assert.assertEquals("font/woff", MimeTypes.Font.WOFF)

    @Test
    fun testFontWoff2() = Assert.assertEquals("font/woff2", MimeTypes.Font.WOFF_2)
}