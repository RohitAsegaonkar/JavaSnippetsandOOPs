public class maze_methods {
    
    public static void main(String[] args){
        boolean status = calculate_paap(20.00d,100.00d);
        System.out.println("Status kya hai - " + status);
        boolean status2 = calculate_paap(20.00d,90.00d);
        System.out.println("Status kya hai - " + status2);
    }

    public static boolean calculate_paap(double rakesh, double naresh){
        //double rakesh = 20.00d;
        //double naresh = 90.00d;
        double kisan = (rakesh + naresh) * 10.00d;// operator precedence link: http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        double andolan = kisan % 40.00d;
        boolean hinsa = andolan == 0.00d ? true : false; // Ternary operator
        if(!hinsa){
            System.out.println("Barbaadi on Republic day!!");
            return hinsa;
        }
        else
            System.out.println("Saab Thik hai!!");
            return hinsa;
        
    }
}
