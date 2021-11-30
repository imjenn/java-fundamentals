// To loop over a hashmap, use keySet() to produce a set of the map's keys
// A set is similar to a hashmap but instead of key-value pairs, it has only values 
// Set values are unique values just as the keys are unique in a hashmap 
// Sets can be iterated over with an enhanced for loop so you can access the values 
// in your map using each key as you iterate

// A Set is an interface (a blueprint of a class - java classes must implement all methods declared in the interfaces)

import java.util.Set;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println("--------------");
            System.out.println(userMap.get(key));    
        }
    }
}

