package javabasics;

public class ConstructorExample {


    static int a ;
    public  ConstructorExample(){
        a= 1;
    }

    public static void main(String[] args) {
        ConstructorExample e = new ConstructorExample();
        System.out.println(a);
    }
}
