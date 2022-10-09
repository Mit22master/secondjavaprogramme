public class calculater2 {
    static int total ;

    public  static void add( int a, int b){
        total = a+b;
        System.out.println("addition of " +a+ "and " +b+ " = " +total);


    }
    public void subtraction (int a,int b){
        total =a-b;
        System.out.println("subtraction  of " +a+ "and" +b+ "=" +total);

    }
    public static void  main(String[] args){
        calculater2 calculater2 = new calculater2();
        add( 10,20);
        calculater2.subtraction(50,60);
        add(60,20);
        calculater2.subtraction(90,60);
         System.out.println("mitesh");
    }
}





