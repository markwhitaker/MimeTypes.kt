package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert
import org.junit.Test

class MimeTypesImageTest {
    @Test
    fun testImageAvif() = Assert.assertEquals("image/avif", MimeTypes.Image.AVIF)

    @Test
    fun testImageBmp() = Assert.assertEquals("image/bmp", MimeTypes.Image.BMP)

    @Test
    fun testImageGif() = Assert.assertEquals("image/gif", MimeTypes.Image.GIF)

    @Test
    fun testImageJpeg() = Assert.assertEquals("image/jpeg", MimeTypes.Image.JPEG)

    @Test
    fun testImagePng() = Assert.assertEquals("image/png", MimeTypes.Image.PNG)

    @Test
    fun testImageSvgXml() = Assert.assertEquals("image/svg+xml", MimeTypes.Image.SVG_XML)

    @Test
    fun testImageTiff() = Assert.assertEquals("image/tiff", MimeTypes.Image.TIFF)

    @Test
    fun testImageVndMicrosoftIcon() = Assert.assertEquals("image/vnd.microsoft.icon", MimeTypes.Image.VND_MICROSOFT_ICON)

    @Test
    fun testImageWebp() = Assert.assertEquals("image/webp", MimeTypes.Image.WEBP)
}