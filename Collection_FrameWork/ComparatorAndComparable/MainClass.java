package Java.Collection_FrameWork.ComparatorAndComparable;

import java.util.*;


class SortByNameThenMark implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        if(o1.Name.equals(o2.Name)){
            return o1.Mark - o2.Mark;
        }
        else return o1.Name.compareTo(o2.Name);
    }
}
public class MainClass {

    public static void main(String[] args) {

         List<Student> students = new ArrayList<>();
         students.add(new Student(860,"Shivam"));
         students.add(new Student(257,"Kumar"));
         students.add(new Student(737,"Sharma"));
         students.add(new Student(827,"Kumar"));

        // Collections.sort(students, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2){
        //     if(o1.Name.equals(o2.Name)){
        //         return o2.Mark -o1.Mark ;
        //     }
        //     else return o1.Name.compareTo(o2.Name);
        // }
        //  });
        Collections.sort(students, new SortByNameThenMark());

        students.forEach(System.out::println);
    }
}
