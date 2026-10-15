import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LyricsReader {
    public static String loadLyrics(String filename)
            throws IOException {
        return Files.readString(Path.of(filename));
    }
}
