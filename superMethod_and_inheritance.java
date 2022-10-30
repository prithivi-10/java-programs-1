import java.util.*;

class A {
   int length;
   int bredth;

   public A(int length,int bredth) {
      this.length=length;
      this.bredth=bredth;
   }
   
   public int area() {
      return length*bredth;
   }
}

class B  extends A{
  
   int height;

   public B(int length,int bredth,int heigth) {
      super(length,heigth);
      this.height=heigth;
   }

   public int volume() {
      return length*bredth*height;
   }
  
       
}
public class superMethod_and_inheritance {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Java program for the super() and inheritance ");
      System.out.println("=============================================\n");

      System.out.print("Enter the value of length:");
      int length=sc.nextInt();

      System.out.print("\nEnter the value of breadth:");
      int bredth=sc.nextInt();

      System.out.print("\nEnter the value of the heigth:");
      int heigth=sc.nextInt();

      A a=new A(length, bredth);
      System.out.println("\nThe area is = "+a.area());

      B b=new B(length,bredth,heigth);
      System.out.println("\nThe volume is = "+b.volume()+"\n");
      

   }
}