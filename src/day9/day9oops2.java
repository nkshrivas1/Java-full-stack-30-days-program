package day9;

public class day9oops2 {
    static void main() {
        //Encapsulation
        //benifits
        // data protection & security
        // flexibility & read only - write only capability
        // maintainbility
        // modularity
        Bank acc1 = new Bank(1000.0f,"Nikhil",25);
        System.out.println("Acc1: "+ acc1.toString());
        Bank acc2 = new Bank(1000.0f,"Jikesh",22);
        System.out.println("Acc2: "+ acc2.toString());
//        acc1.increaseNoOfAcc();

        // q. how we can deposit money (1000 inr) to acc1
        // getter and setters functions
        acc1.deposite(500);
        System.out.println(acc1.getBalance());
        System.out.println(acc1.withdrawal(1300));
        System.out.println(acc1.withdrawal(500));
        System.out.println(acc1.getBalance());

        // 1000 - 1500
        // bank.balance -= 1500;

        //Encapsulation = data + method together - controlled access
        // 1. deposit = adding some balance
        // 2. withdrawl = removing some balance
    }
}
