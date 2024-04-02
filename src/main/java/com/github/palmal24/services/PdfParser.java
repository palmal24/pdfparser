package com.github.palmal24.services;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;

import org.xml.sax.SAXException;

import java.io.FileInputStream;
import java.io.File;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PdfParser {
    public static void takeInput(String cmd) {
        throw new UnsupportedOperationException();
    }
    BodyContentHandler handler = new BodyContentHandler();
    Metadata metadata = new Metadata();
    ParseContext parseContext = new ParseContext();
    FileInputStream inputStream;
    PDFParser pdfParser = new PDFParser();
}


