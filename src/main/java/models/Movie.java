package models;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
}
