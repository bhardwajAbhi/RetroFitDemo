package apps.abhibhardwaj.com.retrofitdemo;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

  @GET("photos")
  Call<List<Photo>> getPhotos();

}



/*
*
* Retrofit supports the following built-in annotations for each of the standard request types:

    @GET: A method that’s annotated with @GET is responsible for processing a HTTP GET request, where data is retrieved from a server. This is the annotation we’ll be using to retrieve the list of names.

    @POST: A method that’s annotated with @POST is responsible for processing a HTTP POST request, where you send data to a server.

    @PUT: This method will process a HTTP PUT request, where we provide some data and ask the server to store it under a specific URL.

    @DELETE: This method will process a HTTP DELETE request, which specifies a resource that should be deleted.

    @HEAD: This method will process a HTTP HEAD request. HEAD is similar to GET, except that a @HEAD method retrieves information without the corresponding response body. By using @HEAD annotations, you can obtain data that’s written in a response header, without having to retrieve the rest of that content.



    @Path – variable substitution for the API endpoint. For example movie id will be swapped for{id} in the URL endpoint.

    @Query – specifies the query key name with the value of the annotated parameter.

    @Body – payload for the POST call

    @Header – specifies the header with the value of the annotated parameter

*
*
*
* */