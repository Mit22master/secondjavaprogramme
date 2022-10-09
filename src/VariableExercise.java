public class VariableExercise {
// Globle static/class variable - declared outside mahthod inside calss - so alll methods can access
    static String name = "raj";

    public static void  printMyLastname() {
        String myLastName = "master"; // local variable for printMyLastname() method

        System.out.println(myLastName);

    }

    public static void printMyAge() {
        String age = "21";

        System.out.println(age);

    }

        public static void main (String[] args){

            int a=10;
            System.out.println(name);
            System.out.println(a);

            printMyLastname();
            printMyAge();

        }



    }


