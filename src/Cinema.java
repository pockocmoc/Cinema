import java.util.Locale;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        System.out.println("Как вас зовут: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Фильм какого жанра " + name + ", вы бы хотели посмотреть?");
        String genre = sc.next();

        if (genre.equalsIgnoreCase("комедия") || genre.equalsIgnoreCase("драмеди")) {
            System.out.println("Горько.");
        } else if (genre.equalsIgnoreCase("боевик")) {
            System.out.println("Крекий орешек.");

        }

    }
}
