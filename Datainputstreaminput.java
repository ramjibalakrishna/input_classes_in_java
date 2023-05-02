import java.io.*;
public class Datainputstreaminput {
    public static void main(String[] args)throws Exception {

        DataInputStream dis= new DataInputStream(System.in);
        System.out.println("enter the name:");
        String name =dis.readLine();
        System.out.println("enter the rollno:");
        int rollno=Integer.parseInt(dis.readLine());
        System.out.println("enter the marks:");
        float marks=Float.parseFloat(dis.readLine());
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(marks);

    }
}
/* output:
enter the name:
ram
enter the rollno:
1
enter the marks:
100
ram
1
100.0

 */