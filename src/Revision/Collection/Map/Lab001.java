package src.Revision.Collection.Map;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Lab001 {
    public static void main(String[] args) {

        Map<String,Integer> map= new HashMap<>();

        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",3);
        map.put("id4",4);

        System.out.println(map);

        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() +"-->"+ item.getValue());
        }




    }
}
