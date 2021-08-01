package Java.Collection_FrameWork.Map;
import java.util.*;

class Pen{
    int price;
    String colour;
    public Pen(int price, String colour){
        this.price = price;
        this.colour = colour;
    }
    public boolean equals(Object obj){
        Pen that = (Pen) obj;
        boolean isEqual =  this.price == that.price && this.colour.equals(that.colour);
        return isEqual;
    }
    public int hashCode() {
        return price + colour.hashCode();
    }
}

public class HashCodeANdEqual {

    public static void main(String[] args) {     
        Pen p = new Pen(10, "Red" );
        Pen p1 = new Pen(10, "Red" );
        System.out.println(p);
        System.out.println(p1);
        // System.out.println(p1.equals(p));
        Set<Pen> pens = new HashSet<>();
        pens.add(p1);
        pens.add(p);
        System.out.println(pens);
    }
}
