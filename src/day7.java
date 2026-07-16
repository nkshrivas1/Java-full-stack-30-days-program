import java.util.Scanner;

public class day7 {
    static void main() {
        //String - it is a sequence of characters
        String name = "I am a string";
        name = "Nikhil";//1002
        String name2 = new String("Nikhil");//1002
        System.out.println(name+" - "+name2);
        System.out.println(name==name2); // false

        System.out.println(name.equals(name2));// true

        //input methods
//        Scanner sc = new Scanner(System.in);
//        String data = sc.nextLine();
//        System.out.println(data);
//        //length()
//        System.out.println(data.length());
//        // remove extra spoces from beginning and end of string trim()
//        System.out.println(data.trim().length());
//        //to get the char from som index we can use charAt
//        // data.charAt(indexvalue) it also start indexing from 0
//        System.out.println(data.charAt(6));
        // toUpperCase toLowerCase
        String case1 = "java programming";
        String case2 = "java";
//        System.out.println(case1.equalsIgnoreCase(case2));
//        System.out.println(case1.toLowerCase());
//        System.out.println(case1.toUpperCase());
//    contains()
//        System.out.println("case 1 contains case 2: "+ case1.contains(case2));
//       startsWith endsWith
//        System.out.println(case1.startsWith(case2));
    // subString beginindex - inclusive , end index - exclusive
//        System.out.println(case1.substring(1,4));
    //replace()
//        System.out.println(case2.replace('a','@'));
        //isEmpty()
        String str = "";
//        System.out.println(str.isEmpty());
//        indexOf
//        System.out.println(case1.indexOf('a'));
        //lastIndexOf
//        System.out.println(case1.lastIndexOf('a'));
        //concat|
        String case3 = "java,Programming,is,good";
//        System.out.println(case2.concat(" ").concat(case3));
        //split
//        String[] words = case3.split("\\,");
//        for(String word: words){
//            System.out.println(word);
//        }
        // to print characters in reverse order

//        for(int i = case3.length()-1;i>=0;i--){
//            System.out.print(case3.charAt(i));
//        }
        // print every alternate characters
//        for(int i=0;i<case3.length()-1;i++){
////            0,2,4
//            if(i%2!=0) continue; //ignoring odd index character
//            System.out.print(case3.charAt(i));
//        }
        // find the first repeated character in a given string
        // ex - aabbccdeeff
        // check palindrom in a string -- abcba
        String str1 = "abcjhgba";
        // 1, reverse this string and store it
        // 2, match those string

//        2 approach
//        declare two pointers        i=0, j=len-1
        int i =0,j=str1.length()-1;
        boolean isPal = true;
        while(i++<j--){
            if(str1.charAt(i)!=str1.charAt(j)) {
                isPal = false;
                break;
            }
        }
        System.out.println("is palindrome: "+isPal);
    }
}
