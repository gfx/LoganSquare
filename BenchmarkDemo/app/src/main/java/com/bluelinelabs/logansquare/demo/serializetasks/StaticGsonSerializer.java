package com.bluelinelabs.logansquare.demo.serializetasks;

import com.google.gson.Gson;

import com.bluelinelabs.logansquare.demo.model.Response;

public class StaticGsonSerializer extends GsonSerializer {

    public StaticGsonSerializer(SerializeListener parseListener, Response response, Gson gson) {
        super(parseListener, response, gson);
    }
}
