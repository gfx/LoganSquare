package com.bluelinelabs.logansquare.demo.parsetasks;

import com.google.gson.Gson;

public class StaticGsonParser extends GsonParser {

    public StaticGsonParser(ParseListener parseListener, String jsonString, Gson gson) {
        super(parseListener, jsonString, gson);
    }
}
