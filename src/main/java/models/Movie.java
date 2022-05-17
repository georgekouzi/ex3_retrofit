package models;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("original_title")
    private String originalTitle;

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
}
