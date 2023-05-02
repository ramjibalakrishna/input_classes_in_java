public class cmdinput {
    public static void main(String[] args) {
        String student_name = args[0];
        int student_id=Integer.parseInt(args[1]);
        float student_mark=Float.parseFloat(args[2]);
        System.out.println(student_name);
        System.out.println(student_id);
        System.out.println(student_mark);
    }
}
//Input:
          // javac cmdinput.java
          // java cmdinput RAM 1 100
//output:
            // RAM
            //1
            //100