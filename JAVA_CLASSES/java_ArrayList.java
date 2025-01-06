import java.util.ArrayList;

public class java_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // System.out.println(cars);

        ArrayList<Integer> MyNum = new ArrayList<Integer>();
        MyNum.add(5);
        MyNum.add(15);
        MyNum.add(20);
        MyNum.add(30);
        MyNum.add(40);
        MyNum.add(50);

        System.out.println("get mothed "+MyNum.get(2)); // get mothed 
        System.out.println("set mothed "+MyNum.set(2, 25)); // set mothed
        System.out.println("remove mothed "+MyNum.remove(2)); // remove mothed
        System.out.println("size mothed "+MyNum.size()); // size mothed
        // System.out.println("clear mothed"+MyNum.clear()); // clear mothed

        for (int  i : MyNum) {
            System.out.println(i);
        }
        
        // System.out.println();
        // Searching in ArrayList
        // Collection.sort(MyNum);
        // for (int i : MyNum) {
        //     System.out.println(i);
        // }

    }
}





