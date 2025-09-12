class Employee{
    String name;
    int age;

    Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    //Destructor (only in C++) 
    //In java Garbage collector do its automatically
    /*~Employee(){
        System.out.println("Hello, I am a Destructor");
    }*/
}
public class Destructor {
    public static void main(String[] args) {
        Employee e1= new Employee("sweta", 19);
        
    }
    
}
