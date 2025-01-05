public class java_Constructors {
    // create a class Attribute
    int BirthYear;
    String YourName;

    //create a class constructor
    public java_Constructors(int Year, String Name) {
        BirthYear = Year;
        YourName = Name;
    }

    public static void main(String[] args) {
        //create a class constructor object it is used to call the constructor method
        java_Constructors myObj = new java_Constructors(2003,"Aman Gupta");
        System.out.println("Your Name: " + myObj.YourName + "\nBirth Year: " + myObj.BirthYear);
    }
}
