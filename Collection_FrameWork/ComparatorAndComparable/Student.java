package Java.Collection_FrameWork.ComparatorAndComparable;

public class Student  {
    int Mark;
    String Name;

    public Student(int Mark, String Name) {
        // super();
        this.Mark = Mark;
        this.Name = Name;
    }
    
    @Override
    public String  toString() {
        return "Student [Marks -> " + Mark + "\s Name -> " + Name +"]" ;
    }

    public int getMark() {
        return Mark;
    }

    public void putMark(int Mark){
        this.Mark = Mark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    // public int compareTo(Student obj){
    //     return this.Mark - obj.Mark;
    // }
}
