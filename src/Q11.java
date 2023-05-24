import java.util.ArrayList;
import java.util.List;

public class Q11 {
    /*
Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
*/
 static  String  f = "Falguni";
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Punam");  // 0
        names.add("Mahesh");  // 1
        names.add("Maulik");   //2
        names.add("Madhavi");  //3
        names.add("Jignesh");  //4
        names.add("Hemi");  // 5
        // names.add("Falguni");  //6


 String n = names.get(6);
      for (String name : names){
          System.out.println( " My name is "  +f);
      }
    }

}
