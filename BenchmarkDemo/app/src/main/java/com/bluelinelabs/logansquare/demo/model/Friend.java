package com.bluelinelabs.logansquare.demo.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.github.gfx.static_gson.annotation.JsonSerializable;

@JsonSerializable
@JsonObject
public class Friend {

    @JsonField
    public int id;

    @JsonField
    public String name;
}
