import java.util.*;
//Maps can have duplicate values but not duplicate Keys
public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> scores=new HashMap<>();
        scores.put("mukunda",100);
        scores.put("priya",200);
        scores.put("basudora",300);
        System.out.println(scores);
        System.out.println(scores.get("basudora"));//get method takes a key and return the value
    }

}
