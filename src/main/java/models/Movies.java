package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Result;
import java.util.List;

public class Movies {
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    public List<Result> getResults() {
        return results;
    }
    public void setResults(List<Result> results) {
        this.results = results;
    }

}
