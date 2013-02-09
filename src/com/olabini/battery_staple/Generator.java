package com.olabini.battery_staple;

import java.security.SecureRandom;

public class Generator {
    private final Dictionary d;
    private final int wordCount;
    private final SecureRandom rng;

    public Generator(Dictionary d, int wordCount) {
        this.d = d;
        this.wordCount = wordCount;
        this.rng = new SecureRandom();
    }

    public String[] generate() {
        String[] result = new String[wordCount];
        for(int i=0;i<wordCount;i++) {
            result[i] = generateOne();
        }
        return result;
    }

    private String generateOne() {
        return d.at(rng.nextInt(d.count()));
    }
}
