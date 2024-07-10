package d10.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // receive music info from customer
        Scanner scanner = new Scanner(System.in);
        // make a list of Music
        List<Music> musicList = new ArrayList<>();
        while (true) {
            // input title
            System.out.print("title: ");
            String title = scanner.nextLine();
            // input album
            System.out.print("album: ");
            String album = scanner.nextLine();
            // input artist
            System.out.print("artist: ");
            String artist = scanner.nextLine();
            //input release date:
            System.out.print("release: ");
            String release = scanner.nextLine();
            // create music

            Music music = new Music(title, album, artist, release);
            //add to Music list
            musicList.add(music);
            System.out.println("Saved!!!");
            // ask customer if input additional info
            System.out.println("add more? [y/n]: ");
            String hasNext = scanner.nextLine();
            if (hasNext.equals("n")) {
                break;
            }
        }
        String filename = "MusicInfo.txt";
        Music.saveToFile(musicList, filename);

        // Read file "MusicInfo.txt"
        List<Music> musicList1 = Music.bufferedReader(filename);

        for (int i = 0; i < musicList1.size(); i++) {
            System.out.println("Music " + (i+1));
            System.out.println(musicList1.get(i));

            System.out.println();
        }
        scanner.close();

    }
}
