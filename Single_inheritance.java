import java.util.*;

class Cat{
    public int method1(int a,int b){
        return a+b;
    }
}

class Dog extends Cat {
    public int method2(int a, int b) {
        return a*b;
    }
}

public class Single_inheritance {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a:");
        int a=sc.nextInt();

        System.out.println("Enter the b:");
        int b=sc.nextInt();

        Dog obj = new Dog();

        int r=obj.method1(a,b);
        int R=obj.method2(a,b);

        System.out.println("Value of r: "+r);
        System.out.println("Value of R: "+R);
        

    }
}