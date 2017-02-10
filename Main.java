package com.company.SaiBtech;
        import java.util.*;
class operators{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the two number");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPILCATION\n4.DIVISION\n");
        c=scan.nextInt();
        switch (c) {
            case 1:
                System.out.println("Addition :: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction :: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication :: " + (a * b));
                break;
            case 4:
                System.out.println("Division :: " + (a / b));
                break;
            default:
                System.out.println("INVALID ENTRY");
                break;
        }
}

}