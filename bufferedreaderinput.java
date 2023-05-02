import java.io.*;
public class bufferedreaderinput {
    public static void main(String[] args) throws IOException
    {
     BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter name:");
        String name= br.readLine();
        System.out.println("enter rollno:");
        int rollno = Integer.parseInt(br.readLine());
        System.out.println("enter marks:");
        float marks=Float.parseFloat(br.readLine());
        System.out.println("name="+name);
        System.out.println("rollno="+rollno);
        System.out.println("marks="+marks);
    }
}
/*
output:
enter name:
ramji
enter rollno:
1
enter marks:
121
name=ramji
rollno=1
marks=121.0

 */