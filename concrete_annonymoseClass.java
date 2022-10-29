import java.util.*;

abstract class  Prithivi {
    abstract public void shows();
}

class Outer {

    public void display() {
        Prithivi pp = new Prithivi()  {
            public void shows() {
                System.out.println("\nIm the annonymouse class:");
            }
        };
        pp.shows();
    }
}
public class concrete_annonymoseClass {
    public static void main(String[] args) {

        System.out.println("\nJava program for Concrete class in Annonymose class::");
        System.out.println("=======================================================");

        Outer oo = new Outer();

        oo.display();

       


        
    }
}