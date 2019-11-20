package com.example.javaday03;
import java.util.Scanner;

public class JavaDay03 {
    public static void main(String[] args) {
        //A1
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        System.out.println(hannah.indexOf("b"));

        //A2
        String string1= "Was it a car or a cat I saw?";
        String substring= string1.substring(9, 12);
        System.out.println(substring);

        //A3
        String myString="   Hy my Name is Jessica    ";
        String[] myString3= myString.split("m");
        String myString2="Hallo mein Name ist Jessica";
        System.out.println(myString.indexOf("N"));
        System.out.println(myString.startsWith("  "));
        System.out.println(myString.compareTo(myString2));
        System.out.println(myString.trim());
        System.out.println(myString.replace("Hy","Hello"));
        System.out.println(myString.replaceAll("y","i"));
        for(int i=0; i< myString3.length; i++){
            System.out.println(myString3[i]);
        }

        //A4
        String name="Jessica Triltsch";
        System.out.println(name.charAt(0)+""+name.charAt(8));


        //A5
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float C = in.nextFloat();
        float F = C * (9f / 5) + 32;
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");


        //A6
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);

        //A7
        int inp1;
        int inp2;
        int inp3;
        Scanner il= new Scanner(System.in);
        System.out.println("Enter first Number:");
        inp1= Integer.parseInt(il.nextLine());
        Scanner it= new Scanner(System.in);
        System.out.println("Enter second Number:");
        inp2 = Integer.parseInt(it.nextLine());
        Scanner is= new Scanner(System.in);
        System.out.println("Enter third Number:");
        inp3 = Integer.parseInt(is.nextLine());
        System.out.println("The average of number one: "+ inp1+ ", number two: " + inp2+" and number three: " + inp3+ " is "+(inp1+inp2+inp3)/3);

        //A8
        int points;
        Scanner n1= new Scanner(System.in);
        System.out.println("Enter the maximum points: ");
        points= Integer.parseInt(n1.nextLine());
        int maxgrade;
        Scanner n2= new Scanner(System.in);
        System.out.println("Enter your points: ");
        maxgrade= Integer.parseInt(n2.nextLine());

        if (points >= maxgrade*0.9){
            System.out.println("Grade: A"); }
        else if(points >= maxgrade*0.8){
            System.out.println("Grade: B"); }
        else if(points >= maxgrade*0.7){
            System.out.println("Grade: C"); }
        else if(points >= maxgrade*0.6){
            System.out.println("Grade: D"); }
        else if(points >= maxgrade*0.5){
            System.out.println("Grade: E"); }
        else if(points <= maxgrade*0.4){
            System.out.println("Grade: F"); }
    }
}
