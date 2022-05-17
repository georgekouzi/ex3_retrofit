package neworking;

import models.Movies;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonMovieHolderApi {


    @GET("discover/movie?api_key=96624ea86553cd7a4caed4ecbdc35ec1")
    Call<Movies> getTheNewMovie();
    @GET("trending/all/week?api_key=96624ea86553cd7a4caed4ecbdc35ec1")
    Call<Movies> getTheTrendingMovie();
    @GET("discover/movie?sort_by=popularity.desc?api_key=96624ea86553cd7a4caed4ecbdc35ec1")
    Call<Movies> getMovieSortByPopularity();
    @GET("movie/top_rated?api_key=96624ea86553cd7a4caed4ecbdc35ec1")
    Call<Movies> getTheTopMovie();
    @GET("tv/top_rated?api_key=96624ea86553cd7a4caed4ecbdc35ec1")
    Call<Movies> getTheTopRatedMovie();


}
