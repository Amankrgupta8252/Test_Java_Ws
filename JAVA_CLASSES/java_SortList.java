import java.util.ArrayList;
// import java.util.Collections;

public class java_SortList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Aman");
        list.add("Ankit");
        list.add("atul");
        list.add("abhinash");
        list.add("Abhay");

        // Collections.sort(list); // sort 

        // Collections.sort(list, Collections.reverseOrder());

        for (String i : list) {
            System.out.println(i);
        }
    }
}
