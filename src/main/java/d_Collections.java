
import java.util.*;

public class d_Collections {
    public static void run(){
        System.out.print("\n======= Collections ===================================================================\n");
        // Make your objects Comparable and Sortable.
        //
        // Collections Framework uses types that are all in java.util package.
        //
        // Interfaces: Iterable <- Collection <- (List, Queue, Set)
        //
        // Collections have methods such as: add, addAll, contains, remove, size, toArray, clear, isEmpty
        //
        // List: ArrayList, LinkedList, Vector, Stack
        // Queue: PriorityQueue, LinkedList, ArrayDeque
        // Set: HashSet, LinkedHashSet, TreeSet
        // Map: HashMap, LinkedHashMap, TreeMap





        // List is a sub-interface of Collection, ArrayList is an implementation of List.
        // List list = new ArrayList();  // Note you don't have to downcast if you use generics: List<String> l = new ArrayList<>();
        // list.add("one");
        // list.clear();
        // List elts = Arrays.asList("a", "b", "c"); // returns fixed size array
        // Collections.sort(elts);   // sort with Collections static helper methods



        System.out.print("\n======= ArrayList =====================================================================\n");
        // List is a sub-interface of Collection, ArrayList is an implementation of List.
        // All ArrayList methods https://www.w3schools.com/java/java_ref_arraylist.asp


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // add to end of list
        arrayList.add(2); // add at end of list
        //arrayList.add(7, 99); // add at index 7. if out of range then IndexOutOfBoundsException
        arrayList.addAll(Arrays.asList(1, 99, 2, 98, 3, 97));
        arrayList.remove(1);
        arrayList.set(1, 100); // set index to item
        arrayList.get(0); // returns item at index
        arrayList.indexOf(2); // returns first index of item
        arrayList.size();
        arrayList.contains(1); // returns boolean if contains
        arrayList.clear();

        Collections.sort(arrayList);

        for(Integer val : arrayList){
            System.out.println(val);
        }



        System.out.print("\n======= LinkedList ====================================================================\n");
        // LinkedList implements List and Queue.
        // All LinkedListMethods https://www.w3schools.com/java/java_ref_linkedlist.asp


        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.addAll(Arrays.asList("Z", "Y", "x"));
        linkedList.remove("B");
        linkedList.get(0); // get at index
        linkedList.size();
        linkedList.contains("A");
        linkedList.indexOf("B");
        linkedList.clear();


        // Queue methods: add, peek, poll, offer
        linkedList.add("A");
        linkedList.add("B");
        linkedList.pop(); // pops element from front of stack
        linkedList.peek(); // retrieves but does not remove first
        linkedList.poll(); // retrieves and removes fist
        linkedList.push("V"); // pushes element on front of the stack

        // Deque methods: addFirst/Last, getFirst/Last, offerFirst/Last, pollFirst/Last, removeFirst/Last
        linkedList.addFirst("C");
        linkedList.addLast("D");
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.getFirst();
        linkedList.getLast();


        System.out.print("\n======= Stack =========================================================================\n");
        // Stack extends Vector, which implements List and Collection

        // Stack
        Stack<Character> stack = new Stack<>();
        stack.push('A'); // push element to the front/top of stack
        stack.push('B'); // push element to the front/top of stack
        stack.pop(); // pop element at the front/top of the stack
        stack.peek(); // peek element at the front/top
        stack.size();
        stack.isEmpty();
        stack.clear();



        System.out.print("\n======= HashMap =======================================================================\n");
        // Map holds key/value mappings. There cannot be duplicate keys in a Map, one key to one value.
        //
        // Map map = new HashMap();  // HashTable() is slower because it's the synced version
        // map.put(K key, V value);
        // getValue, getKey, entrySet, keySet, values...
        // map.putAll(Map map);
        // map.remove(K key);
        // map.get(K key);


        // HashMap implements Map
        // All HashMap methods https://www.w3schools.com/java/java_ref_hashmap.asp


        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.get("One");
        hashMap.containsKey("Two");
        hashMap.containsValue(2);
        hashMap.remove("Two");

        Set<String> keys = hashMap.keySet();

        for(String s : hashMap.keySet()){
            System.out.println(s); // Print the keys
            System.out.println(hashMap.get(s)); // Print the values
        }
        hashMap.size();
        hashMap.clear();





        System.out.print("\n======= HashSet =======================================================================\n");
        // Set: HashSet, LinkedHashSet, TreeSet
        //
        // Set does not allow duplicates.
        //
        // HashSet allows only one null but order is not guaranteed, and it's faster than TreeSet, LinkedHashSet
        //
        // Faster than TreeSet but provides no pre sort


        // Set set = new HashSet();
        // set.add("Hello");  // add() returns false if you try to add a duplicate

        // HashSet
        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(1.1);
        hashSet.add(2.2);
        hashSet.addAll(Arrays.asList(3.3, 4.4));
        hashSet.remove(1.1);
        hashSet.contains(2.2);
        hashSet.size();
        hashSet.isEmpty();
        hashSet.clear();



        System.out.print("\n======= TreeSet =======================================================================\n");
        // TreeSet implements SortedSet and Set
        // Uses tree for storage. Slower than HashSet but keeps data sorted and has additional methods

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.addAll(Arrays.asList(11, 21));
        treeSet.remove(20);
        treeSet.first();
        treeSet.last();
        treeSet.contains(15);
        treeSet.size();
        treeSet.isEmpty();
        treeSet.floor(22); // returns greatest element in the set less or equal to the given element, else null
        treeSet.ceiling(22); // returns the least element greater or equl to the given element, else null
        treeSet.clear();

        System.out.print("\n======= Queues =======================================================================\n");

        // Queue has methods that support ordering in a FIFO basis.
        // Appends elements to the tail of the queue, returns from head.
        //
        // Queue queue = new LinkedList();
        // queue.offer("a");  // offer() returns false if fails
        // queue.add("a");    // add() throws an exception if fails
        // queue.remove();    // remove() returns the element at the head or exception if empty
        // queue.poll()       // like remove, but returns null if empty
        // queue.element()    // returns but does not remove head, if empty throws exception
        // queue.peek()		  // peek() returns but does not remove, if empty returns null



    }

}

