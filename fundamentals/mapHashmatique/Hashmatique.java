

import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("song1", "song1 is cool");
        trackList.put("song2", "song2 kinda sucks");
        trackList.put("song3", "song3 is okay");

        Set<String> keys = trackList.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
    
}
