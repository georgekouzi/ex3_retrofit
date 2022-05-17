import models.Movie;
import neworking.ResultApi;

public class Main {


    public static void main(String [] args) {
         MovieMenger manager1= new MovieMenger();
        manager1.getMovieSortByPopularity(new ResultApi<String, Throwable>() {
            @Override
            public void result(String getData, Throwable getException) {
              System.out.println(getData);
            }
        });



    }
}
