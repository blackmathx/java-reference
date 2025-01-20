public class z_QuickReference {

    public static void run(){
        String str1 = "0123543";
        char c = str1.charAt(4); // '5'


        /* Convert a char to an integer */

        String str2 = String.valueOf(c); // char to string, "5"
        Integer int1 = Integer.parseInt(str2); // string to integer, 5
        System.out.println(int1);

        // one line
        System.out.println(Integer.parseInt(String.valueOf(str1.charAt(4)))); // 5


        /* StringBuilder to collect chars */
        StringBuilder sb = new StringBuilder();
        sb.append(str1.charAt(2));

        int len = sb.length(); // get sb length

        int cmp = sb.indexOf(String.valueOf(str1.charAt(3))); // -1 if not exists, otherwise returns the index
        if(cmp > -1) {
            System.out.println(str1.charAt(cmp));
        } else {
            System.out.println("dne");
        }


        /* Convert integer to string */
        Integer val = 43287;
        String str3 = String.valueOf(val); // "43287"
        System.out.println(str3);
        System.out.println(str3.charAt(2)); // 2

        /* Get nth digit */
        Integer val3 = 2362349;
        System.out.println(String.valueOf(val3).charAt(2)); // "6"

        /* Get last digit */
        String str = "234321";
        String s = str.substring(str.length() -1);
        System.out.println(Integer.parseInt(s)); // 1 integer








    }

}
