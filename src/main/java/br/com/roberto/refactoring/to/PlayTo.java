package br.com.roberto.refactoring.to;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayTo {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("type")
    @Expose
    private String type;
}
