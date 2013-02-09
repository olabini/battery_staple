package com.olabini.battery_staple;

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileReader;

public class Main {
    private final static int DEFAULT_WORD_COUNT = 5;
    private final static String DICTIONARY_NAME = "/diceware.wordlist";

    public static void main(String[] args) throws Exception {
        int wordCount = DEFAULT_WORD_COUNT;
        String dictionaryFile = null;
        if(args.length > 0) {
            wordCount = Integer.parseInt(args[0]);
            if(args.length > 1) {
                dictionaryFile = args[1];
            }
        }
        final Reader dictFile = dictionaryFile == null ? new InputStreamReader(Main.class.getResourceAsStream(DICTIONARY_NAME)) : new FileReader(dictionaryFile);
        try {
            Dictionary d = new Dictionary(dictFile);
            Generator g = new Generator(d, wordCount);
            String[] result = g.generate();
            String sep = "";
            for(String s : result) {
                System.out.print(sep);
                System.out.print(s);
                sep = " ";
            }
            System.out.println();
        } finally {
            dictFile.close();
        }
    }
}
