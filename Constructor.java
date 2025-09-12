class Student{
    String name;
    int age;

    //Non-Parametrized Constructor
    Student(){
        System.out.println("Hello, I am Constructor");
    }
    //Parametrized Constructor
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    //Copy Constructor
    Student(Student orgObj){
        System.out.println("I am a Copy Constructor");
        this.name=orgObj.name;
        this.age= orgObj.age;

    }

  
    void getDetails(){
        System.out.println(name+" "+age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student= new Student("Sweta", 19);
        //student.getDetails(); 
        Student student2 = new Student(student); //copy constructor->invoke
        student2.getDetails();

    }   
}
