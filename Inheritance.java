class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Student extends Person{
    int rollno;
    Student(String name, int age, int rollno) {
        super(name, age);
        this.rollno =rollno; 
    }
    
    void getInfo(){
        System.out.println(name+" "+rollno+" "+age);
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("sweta", 19,2);
        student.getInfo();
        
    }
    
}
