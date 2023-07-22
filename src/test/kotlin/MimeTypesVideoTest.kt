package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert
import org.junit.Test

class MimeTypesVideoTest {
    @Test
    fun testVideoH264() = Assert.assertEquals("video/h264", MimeTypes.Video.H264)

    @Test
    fun testVideoMp2t() = Assert.assertEquals("video/mp2t", MimeTypes.Video.MP2T)

    @Test
    fun testVideoMp4() = Assert.assertEquals("video/mp4", MimeTypes.Video.MP4)

    @Test
    fun testVideoMpeg() = Assert.assertEquals("video/mpeg", MimeTypes.Video.MPEG)

    @Test
    fun testVideoOgg() = Assert.assertEquals("video/ogg", MimeTypes.Video.OGG)

    @Test
    fun testVideoQuicktime() = Assert.assertEquals("video/quicktime", MimeTypes.Video.QUICKTIME)

    @Test
    fun testVideoThreegpp() = Assert.assertEquals("video/3gpp", MimeTypes.Video.THREEGPP)

    @Test
    fun testVideoThreegpp2() = Assert.assertEquals("video/3gpp2", MimeTypes.Video.THREEGPP2)

    @Test
    fun testVideoWebm() = Assert.assertEquals("video/webm", MimeTypes.Video.WEBM)

    @Test
    fun testVideoXMsvideo() = Assert.assertEquals("video/x-msvideo", MimeTypes.Video.X_MSVIDEO)
}