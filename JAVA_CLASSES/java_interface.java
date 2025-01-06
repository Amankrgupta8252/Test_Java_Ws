interface Human{
    public void eat();
    public void sleep();
}

interface HumanState{
    public void study();
}

class Student implements Human, HumanState{
    @Override
    public void eat(){
        System.out.println("Student is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Student is sleeping");
    }
    @Override
    public void study(){
        System.out.println("Student is studying");
    }

}

public class java_interface {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.eat();
        myStudent.sleep();
        myStudent.study();
    }
}
