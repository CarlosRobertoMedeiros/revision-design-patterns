package br.com.roberto.refactoring.to;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PerformanceTo {

    @SerializedName("playID")
    @Expose
    private String playID;

    @SerializedName("audience")
    @Expose
    private String audience;

    public String getPlayID() {
        return playID;
    }

    public void setPlayID(String playID) {
        this.playID = playID;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return "PerformanceTo{" +
                "playID='" + playID + '\'' +
                ", audience='" + audience + '\'' +
                '}';
    }
}
