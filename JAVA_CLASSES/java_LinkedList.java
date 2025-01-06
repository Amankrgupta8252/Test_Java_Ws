import java.util.LinkedList;

public class java_LinkedList {
    public static void main(String[] args){
        LinkedList<String> Cars = new LinkedList<String>();
        Cars.add("Volvo");
        Cars.add("BMW");
        Cars.add("Ford");
        Cars.addFirst("Toyota");

        System.out.println(Cars);

        Cars.addLast("Mazda");
        System.out.println(Cars);
        
        Cars.removeFirst();
        System.out.println(Cars);

        Cars.removeLast();
        System.out.println(Cars);

        Cars.remove(1);
        System.out.println(Cars);

        Cars.set(1, "Mercedes");
        System.out.println(Cars);

        Cars.getFirst();
        System.out.println(Cars);

        Cars.getLast();
        System.out.println(Cars);

        Cars.clear();
        System.out.println(Cars);
    }
}
