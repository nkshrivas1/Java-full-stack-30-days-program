public class Day4 {

//    Q. print your name 5 times ?
    public static void welcome(String name){// first function/method
        System.out.println("Welcome "+name);
    }
    //q. write a function to add two numbers.
    //a and b
    static int sum(int a , int b){
        return a+b;
    }
    // q .how we can calculate factorial of n numbers
    static int fact(int n){
        int ans = 1;//local variable for fact function
        for(int i=1;i<=n;i++) {
            int k=9;//local variable for this for loop
            ans *= i;
        }
//        System.out.println(k);
        // 1*1*2*3*4*5
        return ans;
    }
   //q. write a program to return the square of a number
   static int sqr(int num){
        return num*num;
   }
   static int x =10;

    //q. wap to sum of n digit
    static int sumN(int n){
        int sum =0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    //q. wap to check given no iseven or not;
    static boolean isEven(int n){
        return n%2==0;
    }
//    q.wap to calculate area of rectangle
    static double area(double length,double breadth){
        return length*breadth;
    }
// q. to convert temp from celcius to fahrenheit
//    cenlciusTofarenhite
//  farenhiteToCelcius
static void main() {
    System.out.println(area(7.6,6.8));
//        float ans = fact(5);
//    System.out.println(sqr(10));
//    int y = 20;
//    System.out.println(x);
//    System.out.println(y);
        // aman
//    welcome("Aman");
//    welcome("Nikhil");
//    welcome("Tarun");
//    welcome("Sakshi");
//    sayHello,sayBye,showCollege
    //    Q. print your name 5 times ?
    // start -> initialization -> condition -> code -> update -> condition
    // syntax -. for(initialization; condition; increment/decrement){
    //              body;
                //}
//    for(int i=1; i<=5; i+=1){//i =2
//        System.out.println(i);//1
//        // i==1
//    }
//    q. print number from 10 -1
//    for(int i=10; i>0; i--){
//        System.out.println(i);
//    }
//    q. print the sum of 1 to 100
//    int sum =0;
//    for(int i=1;i<=10;i++){
//        System.out.println("i = "+ i + "sum = "+sum );
//        sum+=i;
//    }
/*    while loop
    syntax->
    int i=1;
    while(condition // i<=5){
        body print
        increment/decrement i++

     }
 */
   /*  boolean i=true;
    int j=1;
    while(i==true){
        System.out.println(j);
        if(j++==5) i=false;
    }
    */
//    boolean i = false;
//    while(i){
//        System.out.println("printed once");
//    }
    /*
        do while
        syntax-
        do{
            body-it should execute atleast once
         }while(condition);
     */
//    do{
//        System.out.println("printed once");
//    }while(i);
    /*
      nested loops
        i = row =3
        j = column =3
     */

//    for(int i=1; i<=5 ;i++){
//      for(int j=1;j<=3;j++){
//          System.out.print("* ");
//      }
//        System.out.println();
//    }

    // Break and continue
//    int i =1;
//    int sum =0;
//    while(i<=10){
//        sum+=i;
////        System.out.println(sum);
////        i == 5
//        i++;
//        if(i==5) continue;
//        System.out.println(i);
//     //   i++;
    //q .  write a program to print first 20 even odd numbers
//    for(int i=1;i<=20;i++){
//        if(i%2==0){
//            System.out.println("even "+i);
//        }else{
//            System.out.println("odd "+i);
//        }
//    }
    /*
        print this pattern
        1
        1 2
        1 2 3
        1 2 3 4
     */
//    for(int i=1; i <=4; i++){ // row
//        for(int j = 1; j<=i; j++){ // columns
//            System.out.print(j+" ");
//        }
//        System.out.println();
//    }
    /*
        1
        22
        333
        4444
        55555
     */
//    for(int i=1; i <=5; i++){ // row
//        for(int j = 1; j<=i; j++){ // columns
//            System.out.print(i+" ");
//        }
//        System.out.println();
//    }
    /* Q. PRINT THIS PATTERN
        A
        AB
        ABC
        ABCD
        ABCDE
     */
//     for(char i= 'A'; i<='E';i++){
//         for(char j='A'; j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }


}
}
