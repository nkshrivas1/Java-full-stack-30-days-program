package day9;
//final class - it cannot be inherited - no child class
//why we use final - security , constants, prevent modification , protect logic
final class Vault{

}
public class Bank {
    //final keyword - it will become constant value
    private static final int branchCode=100097;
    // final method - child classes can not overide this function
    final void rules(){

    }



    //static keyword - shared data
    private static int noOfAccounts=0;
    private static void increaseNoOfAcc(){
        noOfAccounts++;
    }
    static{
        System.out.println("Static Block");
    }
    private int accountNo;
    private float balance = 0.0f;
    private String name = "";
    private int age = 0;

    public Bank(float balance, String name, int age) {
        accountNo = noOfAccounts+1;
        this.balance = balance;
        this.name = name;
        this.age = age;
        increaseNoOfAcc();

    }

    public float getBalance() {
        return balance;
    }

    public void deposite(float balance) {
        this.balance += balance;
    }
    public String withdrawal(float balance){
        if(this.balance<balance) {
            return "Insufficient balance";
        }
        this.balance -= balance;
        return "Remaining balance = "+this.balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "noOfAccounts=" + noOfAccounts +
                ", accountNo=" + accountNo +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //Assignment
    // isMinimumBalanceMaintained() - minbal = 1000;
    //deposit --> if amount <= 0
    // withdraw -->  if amount <= 0
    //calculate interest - bank set their interest rates
    // close account -> status

}
