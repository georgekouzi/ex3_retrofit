package neworking;

import exception.MovieServiceException;
import models.Movies;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MovieMenger {
   Retrofit rtf =new Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/")
           .addConverterFactory(GsonConverterFactory.create()).build();;
    JsonMovieHolderApi api=rtf.create(JsonMovieHolderApi.class);;




    public void getTheNewMovie (ResultApi<String, Exception> callback){
        Call<Movies> mMovie =api.getTheNewMovie();
        mMovie.enqueue(new Callback<Movies>() {
            @Override
            public void onResponse(Call<Movies> call, Response<Movies> response) {

                if(response.body()!=null) {

                    callback.result(response.body().toString(), null);
                }
                else{
                    callback.result(null, new MovieServiceException());

                }
            }

            @Override
            public void onFailure(Call<Movies> call, Throwable t) {
                callback.result(null, new MovieServiceException());

            }
        });
    }
    public void getTheTrendingMovie (ResultApi<String, Throwable> callback) {
        Call<Movies> mMovie = api.getTheTrendingMovie();
        mMovie.enqueue(new Callback<Movies>() {
            @Override
            public void onResponse(Call<Movies> call, Response<Movies> response) {

                if(response.body()!=null) {

                    callback.result(response.body().toString(), null);
                }
                else{
                    callback.result(null, new MovieServiceException());

                }
            }

            @Override
            public void onFailure(Call<Movies> call, Throwable t) {
                callback.result(null, new MovieServiceException());

            }
        });
    }
        public void getTheTopRatedMovie(ResultApi<String, Throwable> callback) {
            Call<Movies> mMovie = api.getTheTopRatedMovie();
            mMovie.enqueue(new Callback<Movies>() {
                @Override
                public void onResponse(Call<Movies> call, Response<Movies> response) {

                    if(response.body()!=null) {

                        callback.result(response.body().toString(), null);
                    }
                    else{
                        callback.result(null, new MovieServiceException());

                    }
                }

                @Override
                public void onFailure(Call<Movies> call, Throwable t) {
                    callback.result(null, new MovieServiceException());

                }
            });
        }
            public void getTheTopMovie(ResultApi<String, Throwable> callback){
                Call<Movies> mMovie = api.getTheTopMovie();
                mMovie.enqueue(new Callback<Movies>() {
                    @Override
                    public void onResponse(Call<Movies> call, Response<Movies> response) {

                        if(response.body()!=null) {

                            callback.result(response.body().toString(), null);
                        }
                        else{
                            callback.result(null, new MovieServiceException());

                        }
                    }

                    @Override
                    public void onFailure(Call<Movies> call, Throwable t) {
                        callback.result(null, new MovieServiceException());

                    }
                });
            }
    public void getMovieSortByPopularity(ResultApi<String, Throwable> callback){
        Call<Movies> mMovie = api.getMovieSortByPopularity();
        mMovie.enqueue(new Callback<Movies>() {
            @Override
            public void onResponse(Call<Movies> call, Response<Movies> response) {

                if(response.body()!=null) {

                    callback.result(response.body().toString(), null);
                }
                else{
                    callback.result(null, new MovieServiceException());

                }
            }

            @Override
            public void onFailure(Call<Movies> call, Throwable t) {
                callback.result(null, new MovieServiceException());

            }
        });
    }




}
