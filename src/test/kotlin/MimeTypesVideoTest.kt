package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert
import org.junit.Test

class MimeTypesVideoTest {
    @Test
    fun testVideo3gpp() {
        Assert.assertEquals("video/3gpp", MimeTypes.Video.THREE_GPP)
    }

    @Test
    fun testVideoH264() {
        Assert.assertEquals("video/h264", MimeTypes.Video.H264)
    }

    @Test
    fun testVideoMp4() {
        Assert.assertEquals("video/mp4", MimeTypes.Video.MP4)
    }

    @Test
    fun testVideoMpeg() {
        Assert.assertEquals("video/mpeg", MimeTypes.Video.MPEG)
    }

    @Test
    fun testVideoOgg() {
        Assert.assertEquals("video/ogg", MimeTypes.Video.OGG)
    }

    @Test
    fun testVideoQuicktime() {
        Assert.assertEquals("video/quicktime", MimeTypes.Video.QUICKTIME)
    }

    @Test
    fun testVideoWebm() {
        Assert.assertEquals("video/webm", MimeTypes.Video.WEBM)
    }
}