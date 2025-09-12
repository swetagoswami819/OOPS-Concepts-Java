class Person{
    String name;
    int age;
    
    //Compile-time polymorphism
    Person(){
        System.out.println("Hello , I am a non-parameterized constructor");
    }

    Person(String name , int age){
        this.name=name;
        this.age=age;
    }

    //Run-time polymorphism
    void getInfo(){
        System.out.println("Hello, I am from Base class");
    }


}


class Student extends Person{
    void getInfo(){
        System.out.println("Hello, I am from Derived class");
    }
    
}
public class Polymorphism {
    public static void main(String[] args) {
        Person person= new Person();
        person.getInfo();
        Student student = new Student();
        student.getInfo();
    }
    
}
