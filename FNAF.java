public class FNAF extends Genres {
    private String song_name;
    private String lyrics_file;
    private String release_year;
    public FNAF() {
        super("FNAF");
    }
    public FNAF(String sn, String l, String rl) {
        super("FNAF");
        this.song_name = sn;
        this.lyrics_file= l;
        this.release_year = rl;
    }
    public String getSongName() {
        return song_name;
    }
    public String getLyricsFile() {
        return lyrics_file;
    }
    public String getReleaseYear() {
        return  release_year;
    }
}
