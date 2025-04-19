import java.util.Arrays;

public class z_QuickReference {

    public static void convertStringCharsNums(){
        String str1 = "0123543";
        char c = str1.charAt(4); // '5'

        // Convert a char to an integer
        String str2 = String.valueOf(c); // char to string, "5"
        Integer int1 = Integer.parseInt(str2); // string to integer, 5
        System.out.println(int1);
        // one line
        System.out.println(Integer.parseInt(String.valueOf(str1.charAt(4)))); // 5


        // StringBuilder to collect chars
        StringBuilder sb = new StringBuilder();
        sb.append(str1.charAt(2));

        int len = sb.length(); // get sb length

        int cmp = sb.indexOf(String.valueOf(str1.charAt(3))); // -1 if not exists, otherwise returns the index
        if(cmp > -1) {
            System.out.println(str1.charAt(cmp));
        } else {
            System.out.println("dne");
        }


        // Convert integer to string
        Integer val = 43287;
        String str3 = String.valueOf(val); // "43287"
        System.out.println(str3);
        System.out.println(str3.charAt(2)); // '2'

        // Get nth digit
        Integer val3 = 2362349;
        System.out.println(String.valueOf(val3).charAt(2)); // "6"


        // Get last digit
        String str = "234321";
        String s = str.substring(str.length() -1);
        System.out.println(Integer.parseInt(s)); // 1 integer

        // words to string array
        String words = "the cat is in the house ";
        String[] strArray = words.split(" ");
        System.out.println(strArray[strArray.length - 1]); // "house"  ignores trailing space
        System.out.println(strArray[strArray.length - 1].length()); // 5









    }


    public static void comparing() {
        System.out.println("\n======= Sandbox ================\n");

        /*
            equals() vs ==
                    a. Calling == on String objects will check whether they point to the same object in the pool
                    b. Calling equals() on String objects will check the sequence of characters are the same
                    c. Calling == on StringBuilder objects will check whether they point to the same StringBuilder object
                    d. Calling equals() on StringBuilder objects will check whether they point to the same object (StringBuilder inherits equals from java.lang.Object)
                    e. StringBuilder sb1 and sb2, compare values using sb1.toString().equals(sb2.toString())
                    f. Calling String str = "string"; will check if it's in the pool already, calling String str = new String("string"); will add it to the heap
                    g. Calling String str = " string".strip(); will add it to the heap. str1 += "other" returns a new string since strings immutable, like calling new String()
                    h. Calling String str = new String("string").intern(); will tell java to use the string pool
         */




        /*
                Comparable and Sortable (java.lang).
                Compare Strings with equals(), and compare objects if it supports it.
                A Class can support comparison by implementing equals and hashCode inherited from java.lang.Object.
                A Class can also be comparable by implementing Comparable (int compareTo(O o)) and Comparator (int compare(T t, S s)).
                Implement Comparable to sort with Arrays.sort or Collections.sort.
                Write a class that takes Objects and implements Comparator.
                > Person class implements Comparable (compareTo())
                > public class LastNameComparator implements Comparator{ // public int compare(T t, S s){ // whatever you want } }
                Use this like this
                // Arrays.sort(people);  // uses the compareTo method the Person class
                // Arrays.sort(people, new LastNameComparator());
                // Collections.sort(people);
                // Collections.sort(people, new LastNameComparator());
         */



        // ================================================================
        /*
         * == vs .equals();
         *
         *
         * .equals() is not defined for primitives. with any two primitives, use ==
         * //int x = 5, y = 5;
         * //System.out.println(x.equals(y)); // DOES NOT COMPILE
         *
         *
         */

        Integer a = 10, b = 10;
        System.out.println(a == b); // true
        System.out.println(a.equals(b)); // true
        // This fails after 127

        int p = 2;
        Integer q = 2;
        System.out.println("sdf");
        System.out.println(p == q); // true
        // System.out.println(p.equals(q)); //DNC

        Integer aprime = 127, bprime = 127;
        System.out.println(aprime == bprime); // true. true for 127 but not 128. pg?

        Integer c = 333, d = 333;
        System.out.println(c == d); // false
        System.out.println(c.equals(d)); // true

        // Strings are == when declaring as String a = "hello"; String b = "hello";
        // They are not == when declaring as String a = new String("hello"); String b =
        // ....
        // All String methods that return a value return by creating 'new String()'
        // unless
        // the method isn't needed, such as "hello".trim(); That returns "hello" w/o new
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        // Compare two arrays
        Integer[] arr1 = { 1, 2, 3 };
        Integer[] arr2 = { 1, 2, 3 };
        boolean arrEqual = Arrays.equals(arr1, arr2);
        System.out.println("Are arrays equal? " + arrEqual); // also true for int[] arrays


        // ================================================================

        int j = 0;

        for (;;j++) {
            if (j > 5)
                break;
            System.out.print(j);
        }

        j = 0;
        for (float k = 3.3f; j < 5;) {
            j++;
            System.out.print(j);
        }

        for (int i = 0;;) {
            i++;
            System.out.print(i);
            if (i > 5)
                break;
        }
    }

    public static void generics(){
        /*

                Generics
                ===================

                // Without Generics. Supports legacy code
                List list1 = new ArrayList();  // must now downcast when retrieving
                list1.add("str");
                String s = (String) list1.get(0);

                // With Generics
                List<String> list2 = new ArrayList<>();
                list2.add("string");
                String s = list2.get(0);


                // A method taking lists holding any type
                public static void doPrint(List<?> l){
                    for(Object o : l)
                        System.out.println(o);
                }


                // Create a List that can accept any type
                List<Object> l = new ArrayList<>();

                // Another way to pass lists of any type (upperBound): GenericType<? extends OtherType>
                public static void doSth(List<? extends Number> l){   // takes Integer, Double,...
                    ...
                }


                // Another way to pass lists of any type (lowerBound)
                public static void doSthElse(List<? super Integer> l){  /// any super class of Integer
                    ...
                }


                // Generic Methods
                public static <T> void print(T[] t){ // adds type parameter before the return value
                    ...
                }
                // Constrain the Type parameters example
                public static <E extends Comparable> E min(E[] arr){   // extends is same as implements when used in type parameters
                    ...
                }



                // Writing Generic Types
                public class Point<T> {
                    T x, y;
                    public Point(T x, T y){	this.x = x; this.y = y;	}

                    public T getX(){ return x; }
                    ...
                }
                Point<Integer> in = new Point<>();
                Point<Double> do = new Point<>();
         */
    }

}
