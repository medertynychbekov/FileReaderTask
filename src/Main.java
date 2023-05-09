import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Song song = new Song();
        song.setTitle("Without me");
        song.setAuthor("Halsey");
        song.setText("" +
                "Found you when your heart was broke\n" +
                "I filled your cup until it overflowed\n" +
                "Took it so far to keep you close (Keep you close)\n" +
                "I was afraid to leave you on your own (Ooh)");

        try (FileWriter fileWriter = new FileWriter("song.txt")) {
            fileWriter.write(song.getTitle());
            fileWriter.write("\n" + song.getAuthor());
            fileWriter.write("\n" + song.getText());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Song song1 = new Song();
        try (FileReader fileReader = new FileReader("song.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            Scanner scanner = new Scanner(fileReader);
            int counter = 0;
            while (scanner.hasNext()) {
                if (counter == 0) {
                    song1.setTitle(scanner.nextLine());
                } else if (counter == 1) {
                    song1.setAuthor(scanner.nextLine());
                } else {
                    stringBuilder.append("\n").append(scanner.nextLine());
                }
                song1.setText(String.valueOf(stringBuilder));
                counter++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(song1);
    }
}