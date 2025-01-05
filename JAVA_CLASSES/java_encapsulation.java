public class java_encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    
    public static void main(String[] args) {
        java_encapsulation myObj = new java_encapsulation();
        myObj.setName("Aman Gupta");
        System.out.println(myObj.getName());
    }
}

