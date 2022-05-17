package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Result;
import java.util.List;

public class Movies {
    @SerializedName("results")
    @Expose
    private List<Movie> results;
    public List<Movie> getResults() {
        return results;
    }
    public void setResults(List<Movie> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        String s="";
        for(Movie m: results ){
            s += m.getOriginalTitle();
            s+="\n";

        }
        return s;
    }
}
