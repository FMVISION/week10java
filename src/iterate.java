import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterate {
    /*
    4. Write a Java program to iterate through all elements in an array list using
Iterator.

     */
    public static void main(String[] args) {
        List<String> list_Strings  = new ArrayList<>();
        list_Strings.add("red");
        list_Strings.add("blue");
        list_Strings.add("black");
        Iterator<String> element = list_Strings.iterator();
            System.out.println(element.next());
        }

    }

