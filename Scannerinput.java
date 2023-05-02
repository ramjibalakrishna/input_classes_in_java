import java.util.Scanner;

public class Scannerinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name:");
        String name=sc.next();
        System.out.println("enter the rollno:");
        int rollno=sc.nextInt();
        System.out.println("enter the marks");
        float marks=sc.nextFloat();
        System.out.println(name+"\n"+rollno+"\n"+marks);
    }
}
/*
        enter the name:
        RAM
        enter the rollno:
        1
        enter the marks
        100
        RAM
        1
        100.0
*/

