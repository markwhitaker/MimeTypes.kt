package uk.co.mainwave.mimetypeskotlin

import org.junit.Assert
import org.junit.Test

class MimeTypesAudioTest {
    @Test
    fun testAudioMidi() {
        Assert.assertEquals("audio/midi", MimeTypes.Audio.MIDI)
    }

    // TODO: finish off tests
}