import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sandbox {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        //HashMap doesn't keep our keys and values in a particular order
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        //Linked is list that connect the entries so the keys and value stay in the same order that we add them to the Map
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        //Tree sorts the values in the Natural order. Which basically means alphabetically and numerical

        mapCheck(hashMap); //We can pass in different maps to verify the way they sort.  mapCheck(linkedMap); mapCheck(treeMap);


    }

    public static void mapCheck(Map<Integer, String> map) {
        map.put(4, "Linner");
        map.put(1, "Breakfast");
        map.put(3, "Lunch");
        map.put(5, "Dinner");
        map.put(2, "Brunch");

        //Using a forreach loop to iterate through the map.
        //Using map.keySet to returns a set collection
        for (Integer key : map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }


    }
}





