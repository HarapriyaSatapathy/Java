package src.Collections;
import java.util.Map;


//Map stores as Key value pair
//HashMap stores random values.
//LinkedHashMap stores the way user inputs
//TreeMap  stores sorting
public class TreeMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new java.util.TreeMap<>();
        map.put("id3",1);
        map.put("id2",34);
        map.put("id1",89);

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.containsKey("id1"));
        System.out.println(map.values());

        for(Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey()+"-->"+item.getValue());


        }


    }
}
