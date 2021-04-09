public class Method_overloading {
    
    private static final String INVALID_VALUE_MESSAGE = "Invalid Input";
    public static void main(String[] args){
     int newscore = Gate("Rohit", 1000);
     System.out.println(newscore);
     int newscore1 = Gate(1000);
     System.out.println(newscore1);
     int newscore2 = Gate();
     System.out.println(newscore2);

    }
    public static int Gate(String student, int score){
        System.out.println("Student name is " + student + " and he scored " + score + " in Gate Exam");
        return score * 100;
    }
    public static int Gate(int score){
        System.out.println(" and he scored " + score + " in Gate Exam");
        return score * 100;
    }
    public static String Gate(boolean student){
        System.out.println(" and he scored " + student + " in Gate Exam");
        return INVALID_VALUE_MESSAGE;
    }
}
