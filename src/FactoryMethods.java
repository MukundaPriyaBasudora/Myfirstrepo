import java.util.*;

public class FactoryMethods {
    public static void main(String[] args) {
        List<String> list=List.of("Mukunda","priya","Basudora");
        System.out.println(list);
        List<Practice> practices=List.of(new Practice("Java"),
                                         new Practice("python"),
                                         new Practice("Dsa"));
        System.out.println(practices);
        Set<Practice> sets=Set.of(new Practice("java"),
                                  new Practice("python"),
                                  new Practice("DSA"));
        System.out.println(sets);
        Map<String,Integer> maps=Map.of("Mukunda",10,"priya",20,"basudora",30);
        System.out.println(maps);
        Map<String,Integer> maps1=Map.ofEntries(Map.entry("Mukunda",10),Map.entry("priya",20),Map.entry("basudora",30));
        System.out.println(maps1);
    }
}
class Practice{
    String subject;
    Practice(String s){
        subject=s;
    }
    public String toString(){
        return subject;
    }


}
