package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert
import org.junit.Test

class MimeTypesAudioTest {
    @Test
    fun testAudioMidi() {
        Assert.assertEquals("audio/midi", MimeTypes.Audio.MIDI)
    }

    @Test
    fun testAudioMp4() {
        Assert.assertEquals("audio/mp4", MimeTypes.Audio.MP4)
    }

    @Test
    fun testAudioMpeg() {
        Assert.assertEquals("audio/mpeg", MimeTypes.Audio.MPEG)
    }

    @Test
    fun testAudioOgg() {
        Assert.assertEquals("audio/ogg", MimeTypes.Audio.OGG)
    }

    @Test
    fun testAudioWav() {
        Assert.assertEquals("audio/wav", MimeTypes.Audio.WAV)
    }

    @Test
    fun testAudioWebm() {
        Assert.assertEquals("audio/webm", MimeTypes.Audio.WEBM)
    }

    @Test
    fun testAudioXAcc() {
        Assert.assertEquals("audio/x-acc", MimeTypes.Audio.X_AAC)
    }

    @Test
    fun testAudioXAiff() {
        Assert.assertEquals("audio/x-aiff", MimeTypes.Audio.X_AIFF)
    }

    @Test
    fun testAudioXMpegurl() {
        Assert.assertEquals("audio/x-mpegurl", MimeTypes.Audio.X_MPEGURL)
    }

    @Test
    fun testAudioXMsWma() {
        Assert.assertEquals("audio/x-ms-wma", MimeTypes.Audio.X_MS_WMA)
    }

    @Test
    fun testAudioXWav() {
        Assert.assertEquals("audio/x-wav", MimeTypes.Audio.X_WAV)
    }
}