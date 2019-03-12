package apps.abhibhardwaj.com.retrofitdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

  Context context;
  List<Photo> photoList;

  public RecyclerViewAdapter(Context context, List<Photo> photoList) {
    this.context = context;
    this.photoList = photoList;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_single_row_item, viewGroup, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    Photo photo = photoList.get(i);

    Picasso.get().load(photo.getThumbNailUrl()).into(viewHolder.thumbnail);
    viewHolder.albumTitle.setText(photo.getAlbumTitle());


  }

  @Override
  public int getItemCount() {
    return photoList.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder{

    ImageView thumbnail;
    TextView albumTitle;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);

      thumbnail = itemView.findViewById(R.id.iv_thumbnail);
      albumTitle = itemView.findViewById(R.id.tv_album_title);

    }
  }
}
