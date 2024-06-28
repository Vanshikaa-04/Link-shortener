import java.util.Scanner;


public class LinkShortenerCLI {
    public static void main(String[] args) {
        LinkShortener linkShortener = new LinkShortener();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (shorten/expand/quit):");
            String command = scanner.nextLine();

            if (command.equals("shorten")) {
                System.out.println("Enter a long URL:");
                String longURL = scanner.nextLine();
                String shortURL = linkShortener.shortenURL(longURL);
                if (shortURL != null) {
                    System.out.println("Short URL: " + shortURL);
                }
            } else if (command.equals("expand")) {
                System.out.println("Enter a short URL:");
                String shortURL = scanner.nextLine();
                String longURL = linkShortener.expandURL(shortURL);
                if (longURL != null) {
                    System.out.println("Long URL: " + longURL);
                }
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
    }
}