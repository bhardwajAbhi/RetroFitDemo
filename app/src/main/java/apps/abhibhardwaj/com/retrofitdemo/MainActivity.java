package apps.abhibhardwaj.com.retrofitdemo;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.Log;
import android.widget.Toast;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/*
*A synchronous or asynchronous network request: Once you’ve crafted your network request, you’ll need to execute it, and specify how your application should handle the response — whether that’s a success or a failure.
* */

public class MainActivity extends AppCompatActivity {

  ProgressDialog progressDialog;
  RecyclerView recyclerView;
  RecyclerViewAdapter adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    progressDialog = new ProgressDialog(this);
    progressDialog.setMessage("Loading...");
    progressDialog.show();

    recyclerView = findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));




    //Create a handler for the RetrofitInstance interface//
    RetrofitInterface service = RetrofitClient.getRetrofitInstance().create(RetrofitInterface.class);
    Call<List<Photo>> call = service.getPhotos();

    //Execute the request asynchronously//
    call.enqueue(new Callback<List<Photo>>() {

      @Override
      //Handle a successful response//
      public void onResponse(Call<List<Photo>> call, Response<List<Photo>> response) {
        progressDialog.dismiss();
        adapter = new RecyclerViewAdapter(MainActivity.this, response.body());
        recyclerView.setAdapter(adapter);
      }

      @Override
      //Handle execution failures//
      public void onFailure(Call<List<Photo>> call, Throwable t) {
        progressDialog.dismiss();
        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
        Log.d("haha", "Error"  + t.getMessage());
      }
    });





  }
}
