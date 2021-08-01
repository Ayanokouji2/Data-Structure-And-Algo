package Java.Collection_FrameWork.Sets;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<Integer>();
        // Set<Integer> set = new LinkedHashSet<>(); 
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(39);
        set.add(2);
        Set<Integer> pet = new TreeSet<>();
        pet.add(12);
        pet.add(3);
        pet.add(02);
        pet.addAll(set);  
        set.retainAll(pet);
        System.out.println(pet.containsAll(set));
        System.out.println(set);
    }
}
