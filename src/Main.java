class Main {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    //entry point
   public static void main() {
        System.out.println("Hello! world");
        //write
       //Identifiers
       // computer will also need names
       //studentName-camelcase
       // student_name -snake case
       //collegeName
       //age
       //wrong
       //123name
       //student-name
       //public ,class

       // Keywords
       //public , class ,void ,int,static developer can not create them

       //single line comment
      // int class = 10; wrong

       /*
       Multi line comment
       * we can wri
       * ashd
       * adhsdi
       * */

       /**
        * documentation
        */
//       variables
          String name  = "anil";
          int age = 20;
       System.out.println(name);
       System.out.print(age);
       System.out.println("- i am this old");

       //Datatypes
       // small box 1l
       // medium box 2l
       // large box 5l
       // byte , short , int , long ,float,double,char,boolean,String
       //examples
       //age int
       //name String
       //salary double
       //grade char
       // isPassed boolean
       //type promotion
       //done automatically by the compiler
       //implicit conversion
       // it converts to larger data types
       int a = 250;
       float b = 5.5f;
       float sum = a+b;
       System.out.println(sum);

       System.out.println(a);
       //type casting (explicit conversion)
//       is done manually by the programmer
       //may cause data loss
       int num = (int)(67.67f);
       System.out.println(num);



   }
}