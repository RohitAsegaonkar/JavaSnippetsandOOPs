public class main{ 
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("My result is " + result);
        int newresult = result * 8 ;
        System.out.println("My new result is " + newresult);
        int newresult1 = result % 3 ;
        System.out.println("My new result1 is " + newresult1);
        result++;
        System.out.println("After using ++ " + result);
        result--;
        System.out.println("After using -- " + result);
        result += 10;
        System.out.println("After using += " + result);
        result *= 10;
        System.out.println("After using *= " + result);
        boolean isAlien = true;
        if (isAlien == false){
            System.out.println("I am not an alien!");
            System.out.println("so what!!!!!");
        }
        else{
            System.out.println("Bhaaad me ja!");
            System.out.println("toh mai kya karu be!!!");
        }
        int paisa = 1000;
        boolean amir = paisa == 1000 ? true: false;// Ternary operator
        if(amir)
            System.out.println("Bohot paisa!!!!");
        
        double rakesh = 20.00d;
        double naresh = 90.00d;
        double kisan = (rakesh + naresh) * 10.00d;// operator precedence link: http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        double andolan = kisan % 40.00d;
        boolean hinsa = andolan == 0.00d ? true : false;
        if(!hinsa)
            System.out.println("Barbaadi on Republic day!!");       

}}