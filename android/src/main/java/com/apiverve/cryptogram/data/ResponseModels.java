// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     CryptogramGeneratorData data = Converter.fromJsonString(jsonString);

package com.apiverve.cryptogram.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static CryptogramGeneratorData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(CryptogramGeneratorData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(CryptogramGeneratorData.class);
        writer = mapper.writerFor(CryptogramGeneratorData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// CryptogramGeneratorData.java

package com.apiverve.cryptogram.data;

import com.fasterxml.jackson.annotation.*;

public class CryptogramGeneratorData {
    private String encoded;
    private String original;
    private Cipher cipher;
    private long letterCount;
    private long wordCount;
    private String html;
    private Image image;
    private Image solutionImage;

    @JsonProperty("encoded")
    public String getEncoded() { return encoded; }
    @JsonProperty("encoded")
    public void setEncoded(String value) { this.encoded = value; }

    @JsonProperty("original")
    public String getOriginal() { return original; }
    @JsonProperty("original")
    public void setOriginal(String value) { this.original = value; }

    @JsonProperty("cipher")
    public Cipher getCipher() { return cipher; }
    @JsonProperty("cipher")
    public void setCipher(Cipher value) { this.cipher = value; }

    @JsonProperty("letterCount")
    public long getLetterCount() { return letterCount; }
    @JsonProperty("letterCount")
    public void setLetterCount(long value) { this.letterCount = value; }

    @JsonProperty("wordCount")
    public long getWordCount() { return wordCount; }
    @JsonProperty("wordCount")
    public void setWordCount(long value) { this.wordCount = value; }

    @JsonProperty("html")
    public String getHTML() { return html; }
    @JsonProperty("html")
    public void setHTML(String value) { this.html = value; }

    @JsonProperty("image")
    public Image getImage() { return image; }
    @JsonProperty("image")
    public void setImage(Image value) { this.image = value; }

    @JsonProperty("solutionImage")
    public Image getSolutionImage() { return solutionImage; }
    @JsonProperty("solutionImage")
    public void setSolutionImage(Image value) { this.solutionImage = value; }
}

// Cipher.java

package com.apiverve.cryptogram.data;

import com.fasterxml.jackson.annotation.*;

public class Cipher {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    @JsonProperty("A")
    public String getA() { return a; }
    @JsonProperty("A")
    public void setA(String value) { this.a = value; }

    @JsonProperty("B")
    public String getB() { return b; }
    @JsonProperty("B")
    public void setB(String value) { this.b = value; }

    @JsonProperty("C")
    public String getC() { return c; }
    @JsonProperty("C")
    public void setC(String value) { this.c = value; }

    @JsonProperty("D")
    public String getD() { return d; }
    @JsonProperty("D")
    public void setD(String value) { this.d = value; }

    @JsonProperty("E")
    public String getE() { return e; }
    @JsonProperty("E")
    public void setE(String value) { this.e = value; }

    @JsonProperty("F")
    public String getF() { return f; }
    @JsonProperty("F")
    public void setF(String value) { this.f = value; }

    @JsonProperty("G")
    public String getG() { return g; }
    @JsonProperty("G")
    public void setG(String value) { this.g = value; }

    @JsonProperty("H")
    public String getH() { return h; }
    @JsonProperty("H")
    public void setH(String value) { this.h = value; }

    @JsonProperty("I")
    public String getI() { return i; }
    @JsonProperty("I")
    public void setI(String value) { this.i = value; }

    @JsonProperty("J")
    public String getJ() { return j; }
    @JsonProperty("J")
    public void setJ(String value) { this.j = value; }

    @JsonProperty("K")
    public String getK() { return k; }
    @JsonProperty("K")
    public void setK(String value) { this.k = value; }

    @JsonProperty("L")
    public String getL() { return l; }
    @JsonProperty("L")
    public void setL(String value) { this.l = value; }

    @JsonProperty("M")
    public String getM() { return m; }
    @JsonProperty("M")
    public void setM(String value) { this.m = value; }

    @JsonProperty("N")
    public String getN() { return n; }
    @JsonProperty("N")
    public void setN(String value) { this.n = value; }

    @JsonProperty("O")
    public String getO() { return o; }
    @JsonProperty("O")
    public void setO(String value) { this.o = value; }

    @JsonProperty("P")
    public String getP() { return p; }
    @JsonProperty("P")
    public void setP(String value) { this.p = value; }

    @JsonProperty("Q")
    public String getQ() { return q; }
    @JsonProperty("Q")
    public void setQ(String value) { this.q = value; }

    @JsonProperty("R")
    public String getR() { return r; }
    @JsonProperty("R")
    public void setR(String value) { this.r = value; }

    @JsonProperty("S")
    public String getS() { return s; }
    @JsonProperty("S")
    public void setS(String value) { this.s = value; }

    @JsonProperty("T")
    public String getT() { return t; }
    @JsonProperty("T")
    public void setT(String value) { this.t = value; }

    @JsonProperty("U")
    public String getU() { return u; }
    @JsonProperty("U")
    public void setU(String value) { this.u = value; }

    @JsonProperty("V")
    public String getV() { return v; }
    @JsonProperty("V")
    public void setV(String value) { this.v = value; }

    @JsonProperty("W")
    public String getW() { return w; }
    @JsonProperty("W")
    public void setW(String value) { this.w = value; }

    @JsonProperty("X")
    public String getX() { return x; }
    @JsonProperty("X")
    public void setX(String value) { this.x = value; }

    @JsonProperty("Y")
    public String getY() { return y; }
    @JsonProperty("Y")
    public void setY(String value) { this.y = value; }

    @JsonProperty("Z")
    public String getZ() { return z; }
    @JsonProperty("Z")
    public void setZ(String value) { this.z = value; }
}

// Image.java

package com.apiverve.cryptogram.data;

import com.fasterxml.jackson.annotation.*;

public class Image {
    private String imageName;
    private String format;
    private String downloadURL;
    private long expires;

    @JsonProperty("imageName")
    public String getImageName() { return imageName; }
    @JsonProperty("imageName")
    public void setImageName(String value) { this.imageName = value; }

    @JsonProperty("format")
    public String getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(String value) { this.format = value; }

    @JsonProperty("downloadURL")
    public String getDownloadURL() { return downloadURL; }
    @JsonProperty("downloadURL")
    public void setDownloadURL(String value) { this.downloadURL = value; }

    @JsonProperty("expires")
    public long getExpires() { return expires; }
    @JsonProperty("expires")
    public void setExpires(long value) { this.expires = value; }
}