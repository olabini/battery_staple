package com.olabini.battery_staple;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private final List<String> content;

    public Dictionary(Reader r) throws IOException {
        content = new ArrayList<String>();
        BufferedReader br = new BufferedReader(r);
        String s;
        while((s = br.readLine()) != null) {
            content.add(s);
        }
    }

    public int count() {
        return content.size();
    }

    public String at(int i) {
        return content.get(i);
    }
}
