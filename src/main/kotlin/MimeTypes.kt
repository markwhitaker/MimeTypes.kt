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
         * application/epub+zip
         */
        const val EPUB_ZIP = PREFIX + "epub+zip"

        /**
         * application/gzip
         */
        const val GZIP = PREFIX + "gzip"

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
         * application/ld+json
         */
        const val LD_JSON = PREFIX + "ld+json"

        /**
         * application/mp4
         */
        const val MP4 = PREFIX + "mp4"

        /**
         * application/msword
         */
        const val MSWORD = PREFIX + "msword"

        /**
         * application/octet-stream
         */
        const val OCTET_STREAM = PREFIX + "octet-stream"

        /**
         * application/ogg
         */
        const val OGG = PREFIX + "ogg"

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
         * application/vnd.amazon.ebook
         */
        const val VND_AMAZON_EBOOK = PREFIX + "vnd.amazon.ebook"

        /**
         * application/vnd.apple.installer+xml
         */
        const val VND_APPLE_INSTALLER_XML = PREFIX + "vnd.apple.installer+xml"

        /**
         * application/vnd.mozilla.xul+xml
         */
        const val VND_MOZILLA_XUL_XML = PREFIX + "vnd.mozilla.xul+xml"

        /**
         * application/vnd.ms-excel
         */
        const val VND_MS_EXCEL = PREFIX + "vnd.ms-excel"

        /**
         * application/vnd.ms-fontobject
         */
        const val VND_MS_FONTOBJECT = PREFIX + "vnd.ms-fontobject"

        /**
         * application/vnd.ms-powerpoint
         */
        const val VND_MS_POWERPOINT = PREFIX + "vnd.ms-powerpoint"

        /**
         * application/vnd.oasis.opendocument.presentation
         */
        const val VND_OASIS_OPENDOCUMENT_PRESENTATION = PREFIX + "vnd.oasis.opendocument.presentation"

        /**
         * application/vnd.oasis.opendocument.spreadsheet
         */
        const val VND_OASIS_OPENDOCUMENT_SPREADSHEET = PREFIX + "vnd.oasis.opendocument.spreadsheet"

        /**
         * application/vnd.oasis.opendocument.text
         */
        const val VND_OASIS_OPENDOCUMENT_TEXT = PREFIX + "vnd.oasis.opendocument.text"

        /**
         * application/vnd.openxmlformats-officedocument.presentationml.presentation
         */
        const val VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION = PREFIX +
                "vnd.openxmlformats-officedocument.presentationml.presentation"

        /**
         * application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
         */
        const val VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET = PREFIX +
                "vnd.openxmlformats-officedocument.spreadsheetml.sheet"

        /**
         * application/vnd.openxmlformats-officedocument.wordprocessingml.document
         */
        const val VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT = PREFIX +
                "vnd.openxmlformats-officedocument.wordprocessingml.document"

        /**
         * application/vnd.rar
         */
        const val VND_RAR = PREFIX + "vnd.rar"

        /**
         * application/vnd.visio
         */
        const val VND_VISIO = PREFIX + "vnd.visio"

        /**
         * application/x-7z-compressed
         */
        const val X_7Z_COMPRESSED = PREFIX + "x-7z-compressed"

        /**
         * application/x-abiword
         */
        const val X_ABIWORD = PREFIX + "x-abiword"

        /**
         * application/x-bzip
         */
        const val X_BZIP = PREFIX + "x-bzip"

        /**
         * application/x-bzip2
         */
        const val X_BZIP2 = PREFIX + "x-bzip2"

        /**
         * application/x-cdf
         */
        const val X_CDF = PREFIX + "x-cdf"

        /**
         * application/x-csh
         */
        const val X_CSH = PREFIX + "x-csh"

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
         * application/x-freearc
         */
        const val X_FREEARC = PREFIX + "x-freearc"

        /**
         * application/x-httpd-php
         */
        const val X_HTTPD_PHP = PREFIX + "x-httpd-php"

        /**
         * application/x-pkcs12
         */
        const val X_PKCS_12 = PREFIX + "x-pkcs12"

        /**
         * application/x-sh
         */
        const val X_SH = PREFIX + "x-sh"

        /**
         * application/x-shockwave-flash
         */
        const val X_SHOCKWAVE_FLASH = PREFIX + "x-shockwave-flash"

        /**
         * application/x-silverlight-app
         */
        const val X_SILVERLIGHT_APP = PREFIX + "x-silverlight-app"

        /**
         * application/x-tar
         */
        const val X_TAR = PREFIX + "x-tar"

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
         * audio/opus
         */
        const val OPUS = PREFIX + "opus"

        /**
         * audio/3gpp
         */
        const val THREEGPP = PREFIX + "3gpp"

        /**
         * audio/3gpp2
         */
        const val THREEGPP2 = PREFIX + "3gpp2"

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
         * audio/x-midi
         */
        const val X_MIDI = PREFIX + "x-midi"

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
         * image/avif
         */
        const val AVIF = PREFIX + "avif"

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
         * image/vnd.microsoft.icon
         */
        const val VND_MICROSOFT_ICON = PREFIX + "vnd.microsoft.icon"

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
         * text/calendar
         */
        const val CALENDAR = PREFIX + "calendar"

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
         * video/h264
         */
        const val H264 = PREFIX + "h264"

        /**
         * video/mp2t
         */
        const val MP2T = PREFIX + "mp2t"

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
         * video/3gpp
         */
        const val THREEGPP = PREFIX + "3gpp"

        /**
         * video/3gpp2
         */
        const val THREEGPP2 = PREFIX + "3gpp2"

        /**
         * video/webm
         */
        const val WEBM = PREFIX + "webm"

        /**
         * video/x-msvideo
         */
        const val X_MSVIDEO = PREFIX + "x-msvideo"
    }
}