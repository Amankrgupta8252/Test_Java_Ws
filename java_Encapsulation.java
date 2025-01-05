public class java_Encapsulation {
    private String name;
    private int age;
    private int idNum;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public static void main(String[] args) {
        java_Encapsulation myObj = new java_Encapsulation();
        myObj.setName("John");
        myObj.setAge(25);
        myObj.setIdNum(12345);

        System.out.println("Name: " + myObj.getName() + " Age: " + myObj.getAge() + " ID: " + myObj.getIdNum());
    }
}