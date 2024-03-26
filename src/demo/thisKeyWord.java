package demo;

public class thisKeyWord {
    public static void main(String[] args) {
        MusicAlbum var = new MusicAlbum("ROdnye", "Ulukmanapo", 2015, false);
        System.out.println(var.isForKids);

    }
}

class MusicAlbum{
    public String title;
    public String artist;
    public int yearReleased;
    public boolean isForKids;
//    public MusicAlbum(String albumTitle, String albumArtist,
//                      int albumYearReleased, boolean albumIsForKids){
//        title = albumTitle;
//        artist = albumArtist;
//        yearReleased = albumYearReleased;
//        isForKids = albumIsForKids;
//    }
public MusicAlbum(String title, String artist,
                     int yearReleased, boolean isForKids){
    this.title = title;
    this.artist = artist;
    this.yearReleased = yearReleased;
    this.isForKids = isForKids;
}
}