package uk.co.mainwave.mimetypeskotlin

/**
 * MIME type constants
 */
object MimeTypes {

    /**
     * MIME type constants for application types
     */
    object Application {
        private const val PREFIX = "application/"

        /**
         * application/atom+xml
         */
        const val ATOM_XML = PREFIX + "atom+xml"

        /**
         * application/atomcat+xml
         */
        const val ATOMCAT_XML = PREFIX + "atomcat+xml"

        /**
         * application/ecmascript
         */
        const val ECMASCRIPT = PREFIX + "ecmascript"

        /**
         * application/java-archive
         */
        const val JAVA_ARCHIVE = PREFIX + "java-archive"

        /**
         * application/javascript
         */
        const val JAVASCRIPT = PREFIX + "javascript"

        /**
         * application/json
         */
        const val JSON = PREFIX + "json"

        /**
         * application/mp4
         */
        const val MP4 = PREFIX + "mp4"

        /**
         * application/octet-stream
         */
        const val OCTET_STREAM = PREFIX + "octet-stream"

        /**
         * application/pdf
         */
        const val PDF = PREFIX + "pdf"

        /**
         * application/pkcs10
         */
        const val PKCS_10 = PREFIX + "pkcs10"

        /**
         * application/pkcs7-mime
         */
        const val PKCS_7_MIME = PREFIX + "pkcs7-mime"

        /**
         * application/pkcs7-signature
         */
        const val PkKCS_7_SIGNATURE = PREFIX + "pkcs7-signature"

        /**
         * application/pkcs8
         */
        const val PKCS_8 = PREFIX + "pkcs8"

        /**
         * application/postscript
         */
        const val POSTSCRIPT = PREFIX + "postscript"

        /**
         * application/rdf+xml
         */
        const val RDF_XML = PREFIX + "rdf+xml"

        /**
         * application/rss+xml
         */
        const val RSS_XML = PREFIX + "rss+xml"

        /**
         * application/rtf
         */
        const val RTF = PREFIX + "rtf"

        /**
         * application/smil+xml
         */
        const val SMIL_XML = PREFIX + "smil+xml"

        /**
         * application/x-font-otf
         */
        const val X_FONT_OTF = PREFIX + "x-font-otf"

        /**
         * application/x-font-ttf
         */
        const val X_FONT_TTF = PREFIX + "x-font-ttf"

        /**
         * application/x-font-woff
         */
        const val X_FONT_WOFF = PREFIX + "x-font-woff"

        /**
         * application/x-pkcs12
         */
        const val X_PKCS_12 = PREFIX + "x-pkcs12"

        /**
         * application/x-shockwave-flash
         */
        const val X_SHOCKWAVE_FLASH = PREFIX + "x-shockwave-flash"

        /**
         * application/x-silverlight-app
         */
        const val X_SILVERLIGHT_APP = PREFIX + "x-silverlight-app"

        /**
         * application/xhtml+xml
         */
        const val XHTML_XML = PREFIX + "xhtml+xml"

        /**
         * application/xml
         */
        const val XML = PREFIX + "xml"

        /**
         * application/xml-dtd
         */
        const val XML_DTD = PREFIX + "xml-dtd"

        /**
         * application/xslt+xml
         */
        const val XSLT_XML = PREFIX + "xslt+xml"

        /**
         * application/x-www-form-urlencoded
         */
        const val X_WWW_FORM_URLENCODED = PREFIX + "x-www-form-urlencoded"

        /**
         * application/zip
         */
        const val ZIP = PREFIX + "zip"
    }

    /**
     * MIME type constants for audio types
     */
    object Audio {
        private const val PREFIX = "audio/"

        /**
         * audio/midi
         */
        const val MIDI = PREFIX + "midi"

        /**
         * audio/mp4
         */
        const val MP4 = PREFIX + "mp4"

        /**
         * audio/mpeg
         */
        const val MPEG = PREFIX + "mpeg"

        /**
         * audio/ogg
         */
        const val OGG = PREFIX + "ogg"

        /**
         * audio/wav
         */
        const val WAV = PREFIX + "wav"

        /**
         * audio/webm
         */
        const val WEBM = PREFIX + "webm"

        /**
         * audio/x-aac
         */
        const val X_AAC = PREFIX + "x-aac"

        /**
         * audio/x-aiff
         */
        const val X_AIFF = PREFIX + "x-aiff"

        /**
         * audio/x-mpegurl
         */
        const val X_MPEGURL = PREFIX + "x-mpegurl"

        /**
         * audio/x-ms-wma
         */
        const val X_MS_WMA = PREFIX + "x-ms-wma"

        /**
         * audio/x-wav
         */
        const val X_WAV = PREFIX + "x-wav"
    }

    /**
     * MIME type constants for font types
     */
    object Font {
        private const val PREFIX = "font/"

        /**
         * font/collection
         */
        const val COLLECTION = PREFIX + "collection"

        /**
         * font/otf
         */
        const val OTF = PREFIX + "otf"

        /**
         * font/sfnt
         */
        const val SFNT = PREFIX + "sfnt"

        /**
         * font/ttf
         */
        const val TTF = PREFIX + "ttf"

        /**
         * font/woff
         */
        const val WOFF = PREFIX + "woff"

        /**
         * font/woff2
         */
        const val WOFF_2 = PREFIX + "woff2"
    }

    /**
     * MIME type constants for image types
     */
    object Image {
        private const val PREFIX = "image/"

        /**
         * image/bmp
         */
        const val BMP = PREFIX + "bmp"

        /**
         * image/gif
         */
        const val GIF = PREFIX + "gif"

        /**
         * image/jpeg
         */
        const val JPEG = PREFIX + "jpeg"

        /**
         * image/png
         */
        const val PNG = PREFIX + "png"

        /**
         * image/svg+xml
         */
        const val SVG_XML = PREFIX + "svg+xml"

        /**
         * image/tiff
         */
        const val TIFF = PREFIX + "tiff"

        /**
         * image/webp
         */
        const val WEBP = PREFIX + "webp"
    }

    /**
     * MIME type constants for multipart types
     */
    object Multipart {
        private const val PREFIX = "multipart/"

        /**
         * multipart/byteranges
         */
        const val BYTERANGES = PREFIX + "byteranges"

        /**
         * multipart/encrypted
         */
        const val ENCRYPTED = PREFIX + "encrypted"

        /**
         * multipart/form-data
         */
        const val FORM_DATA = PREFIX + "form-data"

        /**
         * multipart/related
         */
        const val RELATED = PREFIX + "related"
    }

    /**
     * MIME type constants for text types
     */
    object Text {
        private const val PREFIX = "text/"

        /**
         * text/css
         */
        const val CSS = PREFIX + "css"

        /**
         * text/csv
         */
        const val CSV = PREFIX + "csv"

        /**
         * text/html
         */
        const val HTML = PREFIX + "html"

        /**
         * text/javascript
         */
        const val JAVASCRIPT = PREFIX + "javascript"

        /**
         * text/plain
         */
        const val PLAIN = PREFIX + "plain"

        /**
         * text/richtext
         */
        const val RICHTEXT = PREFIX + "richtext"

        /**
         * text/sgml
         */
        const val SGML = PREFIX + "sgml"

        /**
         * text/xml
         */
        const val XML = PREFIX + "xml"

        /**
         * text/yaml
         */
        const val YAML = PREFIX + "yaml"
    }

    /**
     * MIME type constants for video types
     */
    object Video {
        private const val PREFIX = "video/"

        /**
         * video/3gpp
         */
        const val THREE_GPP = PREFIX + "3gpp"

        /**
         * video/h264
         */
        const val H264 = PREFIX + "h264"

        /**
         * video/mp4
         */
        const val MP4 = PREFIX + "mp4"

        /**
         * video/mpeg
         */
        const val MPEG = PREFIX + "mpeg"

        /**
         * video/ogg
         */
        const val OGG = PREFIX + "ogg"

        /**
         * video/quicktime
         */
        const val QUICKTIME = PREFIX + "quicktime"

        /**
         * video/webm
         */
        const val WEBM = PREFIX + "webm"
    }
}
