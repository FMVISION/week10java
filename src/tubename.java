import java.util.ArrayList;

public class tubename {
    /*
    Write a Java program to test an array list is empty or not. Define array list with
underground tube names

     */
    public static void main(String[] args) {
        ArrayList<String> list_String = new ArrayList<>();
        list_String.add("jubille line");
        list_String.add("northern line");
        list_String.add("picadalliy line");
        list_String.add("victoria line");
        System.out.println("Original list : " + list_String);
        System.out.println("checking above list empty or not! " + list_String.isEmpty());
        list_String.removeAll(list_String);
        System.out.println("Array list after remove all elements " +list_String);
        System.out.println("checking the above list empty or not ! " +list_String.isEmpty());



    }
}
