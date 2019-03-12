package apps.abhibhardwaj.com.retrofitdemo;

import com.google.gson.annotations.SerializedName;

// A POJO: This is a data model class that ensures the server’s response gets mapped automatically, so you don’t have to perform any manual parsing.

public class Photo {

  @SerializedName("albumid")
  private Integer albumID;

  @SerializedName("id")
  private Integer ID;

  @SerializedName("title")
  private String albumTitle;

  @SerializedName("url")
  private String albumUrl;

  @SerializedName("thumbnailUrl")
  private String thumbNailUrl;



  public Photo() {
  }

  public Photo(Integer albumID, Integer ID, String albumTitle, String albumUrl,
      String thumbNailUrl) {
    this.albumID = albumID;
    this.ID = ID;
    this.albumTitle = albumTitle;
    this.albumUrl = albumUrl;
    this.thumbNailUrl = thumbNailUrl;
  }

  public Integer getAlbumID() {
    return albumID;
  }

  public void setAlbumID(Integer albumID) {
    this.albumID = albumID;
  }

  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public String getAlbumTitle() {
    return albumTitle;
  }

  public void setAlbumTitle(String albumTitle) {
    this.albumTitle = albumTitle;
  }

  public String getAlbumUrl() {
    return albumUrl;
  }

  public void setAlbumUrl(String albumUrl) {
    this.albumUrl = albumUrl;
  }

  public String getThumbNailUrl() {
    return thumbNailUrl;
  }

  public void setThumbNailUrl(String thumbNailUrl) {
    this.thumbNailUrl = thumbNailUrl;
  }
}
