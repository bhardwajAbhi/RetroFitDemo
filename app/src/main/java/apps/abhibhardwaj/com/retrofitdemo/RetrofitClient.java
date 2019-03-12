package apps.abhibhardwaj.com.retrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
*   A Retrofit class: This is where you’ll create a Retrofit instance and define the base URL that your app will use for all of its HTTP requests.
*   In our application, the base URL will be https://jsonplaceholder.typicode.com
*
*   / */


public class RetrofitClient {

  private static Retrofit retrofit;
  private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";



  // create the Retrofit Instance
  public static Retrofit getRetrofitInstance()
  {
    if (retrofit == null)
    {
      retrofit = new Retrofit.Builder()
                  .baseUrl(BASE_URL)
          //Add the Converter
                  .addConverterFactory(GsonConverterFactory.create())
          //Build the Instance
                  .build();
    }
    return retrofit;
  }

}
