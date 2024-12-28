public class java_Constructors {
    int BirthYear;
    String YourName;

    public java_Constructors(int Year, String Name) {
        BirthYear = Year;
        YourName = Name;
    }

    public static void main(String[] args) {
        java_Constructors myObj = new java_Constructors(2003,"Aman Gupta");
        System.out.println("Your Name: " + myObj.YourName + "\nBirth Year: " + myObj.BirthYear);
    }
}
