import java.util.HashMap;
import java.util.Set;

// Instructions:
// Create a trackList of type HashMap
// Add in 4 songs stored by title
// Pull out one of the songs by title
// Print out all the track names and lyrics in the format Track: Lyrics

public class Hashmatique {
    public static void main(String[] args) {
        // Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();
        // Add in 4 songs stored by title
        trackList.put("Sound of Silence", "Hello darkness my old friend");
        trackList.put("Pour Some Sugar On Me", "Break the bubble, break it up");
        trackList.put("Paint It, Black", "I see a red door and I want it painted black");
        trackList.put("Hotel California", "Welcome to the Hotel California, Such a lovely place");
        // Pull out one of the songs by title
        System.out.println("Hotel Califonia: " + trackList.get("Hotel California"));
        System.out.println("----------------");
        Set<String> keys = trackList.keySet();
        // Print out all the track names and lyrics in the format Track: Lyrics
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}