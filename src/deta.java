import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class deta{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your total marks = ");
        int Marks = scanner.nextInt();
        if(( Marks >=70) && (Marks<=100)){
            System.out.println("Dinsingtion");

        }else if (Marks>=60){
            System.out.println("First calss");
        }else if(( (Marks>=0) &&(Marks >= 35)){
            System.out.println("Pass");
        }else if ((Marks< 0 ) ||  (Marks>100)){

            System.out.println("Invalid Marks");
        }else {
            System.out.println("Fail");
        }

    }
    }

