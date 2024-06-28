import java.util.HashMap;
import java.util.Map;

public class LinkShortener {
    private Map<String, String> urlMap;
    private static final int SHORT_URL_LENGTH = 6;

    public LinkShortener() {
        urlMap = new HashMap<>();
    }

    public String shortenURL(String longURL) {
        if (urlMap.containsValue(longURL)) {
            // Handle duplicate long URL
            System.out.println("Error: Duplicate long URL");
            return null;
        }

        String shortURL = generateShortURL();
        urlMap.put(shortURL, longURL);
        return shortURL;
    }

    public String expandURL(String shortURL) {
        if (!urlMap.containsKey(shortURL)) {
            // Handle invalid short URL
            System.out.println("Error: Invalid short URL");
            return null;
        }

        return urlMap.get(shortURL);
    }

    private String generateShortURL() {
        // Simple hash function to generate short URL
        String shortURL = "";
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            shortURL += (char) ('a' + (int) (Math.random() * 26));
        }
        return shortURL;
    }
}