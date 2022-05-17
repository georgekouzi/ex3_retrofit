import neworking.MovieMenger;
import neworking.ResultApi;

public class Main {


    public static void main(String [] args) {
         MovieMenger manager1= new MovieMenger();
        manager1.getTheNewMovie(new ResultApi<String, Exception>() {
            @Override
            public void result(String getData, Exception getException) {
                try {
                    System.out.println(getData);
                }catch (Exception e){
                    System.out.println(getException.toString());
                }

            }
        });



    }
}
