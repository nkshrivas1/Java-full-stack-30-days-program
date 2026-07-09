import java.util.Scanner;

public class Operators {
    static void main() {
        int a = 32;
        int b = 30;
        // !. Airthmetic operators
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//        if 'a' value is greater than b then it will return remainder
//            otherwise it will return a
//     2. Unary Operators
//        increment (++)
//        Decrement (--) a--; --a;
//        Logical not (!) !true -> false
//        Unary minus (-) 20 -> -20
//        System.out.println(a--);
//        System.out.println(++a);
//     3.Assignment operators
//        = : Basic assignment
//        += : adds and assign
//        a += 2; a= a+2;
//         -=
//        *=
//        /=
//        %=
//        4. Relational operator
// it compares two values and return boolean value
//        ==
//        System.out.println(a==b);
////        !=
//        System.out.println(a!=b);
////        >
//        System.out.println(a>b);
////        <
//        System.out.println(a<b);
////        >=
//        System.out.println(a>=b);
////        <=
//        System.out.println(a<=b);
//        5. Logical operators
//        && - AND
//        System.out.println(a==b && a<b);
//        || - OR a= 32 b= 30
//        System.out.println(a==b || a>b);
//        ! - NOT
//        System.out.println(!(a==b));

        Scanner input =  new Scanner(System.in);
//        System.out.println("ENter some integer value");
//        int num1 = input.nextInt();
//        float num2 = input.nextFloat();
//        System.out.println(num1+num2);
        //Decision making in java
        // if -else ,if ,else-if, nested if,switch case
//        System.out.println(input.nextLine());

        System.out.println("Welcome to our calculator");
        System.out.println("Enter value of a: ");
        a=input.nextInt();
        System.out.println("Enter value of b: ");
        b=input.nextInt();
        System.out.println("Choose the operator: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. %");
        int operator = input.nextInt();
        if(operator == 1) System.out.println(a+b);
        else if (operator == 2) {
            System.out.println(a-b);
        }
        else if (operator == 3) {
            System.out.println(a*b);
        }
        else if (operator == 4) {
            System.out.println(a/b);
        }
        else if (operator == 5) {
            System.out.println(a%b);
        } else System.out.println("Invalid operator");


    }
}
