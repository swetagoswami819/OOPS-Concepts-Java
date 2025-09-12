class Teacher{
    //properties/attributes
    String name;
    String dept;
    String subject;
    private String salary;
    
    //methods
    void changedept(String newdept){
        dept=newdept;
    }

    //setter
    void setSalary(String s){
        salary=s;
    }

    //getter
    String getSalary(){
        return salary;
    }
}

class ClassesandProjects{
    public static void main(String[] args) {
        Teacher t1= new Teacher();
        t1.name="sweta";
        t1.dept="CSE";
        t1.subject ="coa";
        t1.changedept("DS");
        System.out.println(t1.name+" "+t1.dept+" "+t1.subject);
        t1.setSalary("25000");
        System.out.println(t1.getSalary());
        
    }

}