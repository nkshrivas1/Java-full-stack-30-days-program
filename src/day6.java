import java.util.Scanner;

public class day6 {
    static void main() {
        int student1 = 10;
        int student2 = 30;
        // array - to store multiple values of same data type
        // 1. it should have same data type
        // 2. it stores one value per index
        // 3. it stores data in a contigous manner
        // flat 101 ,102,103..
        // array has indexes - 101,102,103
        // datatype[] name= new datatype[size];
        // default : 0
        int[] marks = new int[5];
        //0,1,2,3,6
        // default : null
        String[] names = new String[5];
        // default : false
        boolean[] istrue = new boolean[5];
        //assign values
        names[0]="Nikhil";
        names[1] = "Shishir";
        names[2] = "Deepak";
        names[3] = "ansh";
        names[4] = "Swayam";
        marks[3]=9;

//        System.out.println(names.length);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
        //q. take  size and value input from user for int array
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int num[] = new int[size];
//        for (int i=0;i<size;i++){
//            num[i] = sc.nextInt();
//        }
//
//        //q. calculate sum of num array
//        int sum =0;
//        for(int i=0;i<num.length;i++){
//           sum += num[i];
//        }
//        System.out.println("Sum: "+ sum);
//        // q. wap to calculate average of num array
//        //average = sum/size;
//        int avg = sum/size;
//        System.out.println("Avg: "+ sum/size);
//        //q. wap to get the maximum number in our num array
//        int maxx= Integer.MIN_VALUE;
//        for(int i=0;i<size;i++){
//            if(maxx<num[i]){
//                maxx = num[i];
//            }
//        }
//        System.out.println("Maximum: "+ maxx);
        //q. wap to get the index of number inside our array -- linear search
        int values[] = {32,32,3,5,7,9,0};
        System.out.println(values[0]);
//        let suppose - 104,108,112,116...
        // values[] - size of 7 memory it take =>32 * 7 bits || 4*7 bytes 28 bytes
//        int -32 bites or 4 bytes

//        long[] - 8 bytes it will store 8 byte data at each and every index

// printf("%p",&arr[0]); 1004 inside c
//        System.out.println(values.length);
    }
}
