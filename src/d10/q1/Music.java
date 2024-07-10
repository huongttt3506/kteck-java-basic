package d10.q1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Music {
    private String title;
    private String album;
    private String artist;
    private String release;


    public Music(String title, String album, String artist, String release) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.release = release;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return  "Title: " + title + "\n" +
                "Album: " + album + "\n" +
                "Artist: " + artist + "\n" +
                "Release: " + release + "\n";
    }
    public static void saveToFile(List<Music> musicList, String filename) {
        try
//        FileWriter fileWriter = new FileWriter(filename);
//        BufferedWriter writer = new BufferedWriter(fileWriter)
//          (   BufferedWriter writer = new BufferedWriter(new FileWriter(filename)))
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            for (Music music : musicList) {
                StringBuilder lineBuilder = new StringBuilder();
                lineBuilder.append(music.getTitle()).append(',');
                lineBuilder.append(music.getAlbum()).append(',');
                lineBuilder.append(music.getArtist()).append(',');
                lineBuilder.append(music.getRelease());
                String line = lineBuilder.toString();
                writer.write(line);
                writer.newLine();
//                writer.write(music.title + "," + music.album + "," + music.artist + "," + music.release);
//                writer.newLine();

            writer.close();
            }
        }
        catch (IOException e) {
            System.out.println("데이터 작성을 위한 파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }

    }
    public static List<Music> bufferedReader(String filename) {
        List<Music> music = new ArrayList<>();
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                music.add(new Music(
                        elements[0],
                        elements[1],
                        elements[2],
                        elements[3]
                        ));
            }

        } catch (IOException e) {
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
        return music;


    }

}
