package javabasics;

public class ThisExample extends OverRide1 {

    int a = 56;
   final double b = 3.14;
    public static void main(String[] args) {
        ThisExample t = new ThisExample();
        t.m1();
    }

    public void m1(){
        int a = 23;   //local variable
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}


