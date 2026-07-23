package day10.inheritance;

public class Student {
    private static int counter = 0;
    private int id;
    private String name;
    private int age;

//    public Student(){
//        System.out.println("Student created");
//    }
    //constructor
    public Student(String name,int age){
        System.out.println("Student created with name, age");
        this.name = name;
        this.age = age;
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}
