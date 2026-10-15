import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        String game_genre_selection;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the TryHardNinja Song Archive!");
        System.out.println("Explore songs created by TryHardNinja, organized");
        System.out.println("by the games athey are based on.");
        System.out.println("Find your favorite songs and enjoy the lyrics!");
        System.out.println("1. FNAF 2. Minecraft 3. Poppy Playtime 4. Bendy and the Ink Machine 5. Others");
        game_genre_selection = input.nextLine().trim();
        if (game_genre_selection.equals("1")) {
            System.out.println("The FNAF genre has been selected. Outputting all TryHardNinja's Five Nights at Freddy's songs in the archive.");
        } else if (game_genre_selection.equals("2")) {
            System.out.println(("The Minecraft genre has been selected. Outputting all TryHardNinja's Minecraft songs in the archive "));
        } else if (game_genre_selection.equals("3")) {
            System.out.println("The Poppy Playtime genre has been selected. Outputting all TryHardNinja's Poppy Playtime songs in the archive");
        } else if (game_genre_selection.equals("4")) {
            System.out.println("The Bendy and the Ink Machine genre has been selected. Outputting all TryHardNinja's Bendy and the Ink Machine songs in the archive");
        } else  if (game_genre_selection.equals("5")) {
            System.out.println("Others has been seleno lcted. Outputting all of TryHardNinja's  songs in the archive");
        }
        FNAF song1 = new FNAF("It's Me", "src/ITSME.txt", "2015");
        FNAF song2 = new FNAF("Dream your Dream", "src/DreamYourDream.txt", "2015");
        FNAF song3 = new FNAF("Nightmare By Design", "src/NightmareByDesign.txt", "2017");
        String lyrics = LyricsReader.loadLyrics(song1.getLyricsFile());
        System.out.println("Here are songs you can select.");
        System.out.println("1: " + song1.getSongName() + "\n2: " + song2.getSongName() + "\n3: " + song3.getSongName());
    }
}
