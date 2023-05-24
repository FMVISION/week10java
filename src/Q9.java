import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q9 {
    /*
    Write program and add all group names in to array and iterates through for
each loop.
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Falguni");
        names.add("Punam");
        names.add("Maulik");
        names.add("Jignesh");
        names.add("Madhavi");
        names.add("Hemi");
        names.add("Mahesh");

        int arrayEachLoop = 0;
        for (int i = 0; i<arrayEachLoop; i++){
            System.out.println(" All the groups names  ");
        }


        Iterator<String> element = names.iterator();
        System.out.println(names);
    }
}



    