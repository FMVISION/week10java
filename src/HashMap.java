public class HashMap{
    /*
    Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.

     */

   public static void main(String[] args) {
       java.util.HashMap<String,Integer> people = new java.util.HashMap<>();


       people.put("Bains", 40);   // add keys and value (Name, Age)
        people.put("James",13);

        for (String i : people.keySet()) {
          System.out.println("key: " + i + "  value: " + people.getClass());

       }


    }
}


