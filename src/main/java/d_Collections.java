
import java.util.*;

public class d_Collections {
    public static void run(){
        System.out.print("\n======= Collections ======================\n");

        String desc = """
                * Make your objects Comparable and Sortable.
                * Collections Framework uses types that are all in java.util package.
                * Important interfaces: Collections, Iterator, Comparator, Set, List, Queue, Map, SortedMap.
                * Collection has methods such as: add, addAll, clear size, isEmpty, toArray.
                * List: ArrayList, LinkedList, Vector
                * Queue: PriorityQueue, ArrayDeque
                * Set: HashSet, LinkedHashSet, TreeSet
                * Map: HashMap, LinkedHashMap, TreeMap
                """;
        System.out.println(desc);



        System.out.print("\n======= ArrayList ========================\n");
        System.out.println("*** List is a sub-interface of Collection, ArrayList is an implementation of List.\n");
        // All ArrayList methods
        // https://www.w3schools.com/java/java_ref_arraylist.asp


        ArrayList<String> var1 = new ArrayList<>();
        var1.add("Audi");
        var1.addAll(Arrays.asList("Jeep", "Ford", "Chevy", "BMW"));
        var1.add("Mazda");
        // if index is out of range throws IndexOutOfBoundsException
        //var1.add(9, "Tesla");
        String carMake1 = var1.get(0);
        var1.remove("Mazda"); // removes the first occurrence
        var1.set(2, "Volvo"); // set replaces item at index i
        var1.indexOf("Audi");



        int len = var1.size();
        boolean contains1 = var1.contains("Mazda");
        Collections.sort(var1);

        System.out.println(var1); // [Audi, BMW, Chevy, Jeep, Volvo]

        for(String car : var1){
            System.out.print(car + " ");
        }
        System.out.println();



        System.out.print("\n======= LinkedList =======================\n");

        // All LinkedListMethods
        // https://www.w3schools.com/java/java_ref_linkedlist.asp


        LinkedList<String> var2 = new LinkedList<>();
        var2.addAll(Arrays.asList("BMW", "Jeep", "Volvo", "Tesla"));

        // LinkedList has the same methods as ArrayList
        var2.add("Ford");
        var2.remove("Mazda");
        String carMake3 = var2.get(2);
        boolean var4 = var2.contains("BMW");

        // LinkedList provides methods to do some operations more efficiently
        var2.addFirst("Chevy");
        var2.addLast("Toyota");
        var2.removeFirst();
        var2.removeLast();
        String carMake4 = var2.getFirst();
        String carMake5 = var2.getLast();





        System.out.print("\n======= HashMap ==========================\n");

        // All HashMap methods
        // https://www.w3schools.com/java/java_ref_hashmap.asp


        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Italy", "Rome");

        int len2 = capitalCities.size();

        String var7 = capitalCities.get("Italy");
        String var8 = capitalCities.remove("USA");


        // Print
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }



        System.out.print("\n======= HashSet ==========================\n");

        HashSet<String> var20 = new HashSet<String>();
        var20.add("Volvo");
        var20.add("BMW");
        var20.add("Ford");

        var20.remove("Volvo");
        boolean contains3 = var20.contains("Ford");

        String[] var21 = var20.toArray(new String[]{});
        System.out.println(Arrays.toString(var21));

        var20.add("Mazda");
        System.out.println(var20);


    }

}

