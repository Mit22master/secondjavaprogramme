public class Studentsmarksheets {
    static  int total ;
    static double percentage ;
    public static  void studentsmarksheet(String name, int maths, int sci, int eng){
        total = maths + sci + eng;
        percentage = total/3;
        System.out.println( name +" Total Marks " + total + " & Percentage =" + percentage );

    }public static  void main (String[] args){
        studentsmarksheet(  "Vijay", 40,60,  50 );

        studentsmarksheet(  "raj ",   66, 55, 88);
        studentsmarksheet( "sameer", 55,88,95);
    }
}
