import java.util.Arrays;

@SuppressWarnings("all")
public class b_Strings {

  public static void run() {
    System.out.println("\n======= Strings =================\n");

    String str = "Welcome to the jungle";

    int var1 = str.length();
    int var2 = str.indexOf('c'); // index of first occurance or -1. returns 3
    int var3 = str.indexOf("the"); // index of the first occurance or -1. returns 11
    int var4 = str.indexOf("e ", 7); // with a "from index" parameter. returns 13
    int var5 = str.indexOf(109); // first occurance of 'm' or -1, which the ascii 'm' is binary 01101101 = 109
    int var6 = str.lastIndexOf("he");
    int var7 = str.lastIndexOf("e", 6); // from index number
    int var8 = str.compareTo("Other"); // compares unicode, 0 if same

    boolean var9 = str.endsWith("gle");
    boolean var10 = str.startsWith("Welcome");
    boolean var11 = str.contains("the"); // returns boolean
    boolean var31 = str.equals("other string"); // compares objects if string is equal
    boolean var32 = str.equalsIgnoreCase("other string"); // compares ignore case
    boolean var33 = str.isEmpty(); // returns true if it has 0 length
    boolean var34 = str.isBlank(); // returns true if it only consists of blank spaces and non-printable, characters, \n \t

    char var12 = str.charAt(2); // returns 'l'
    char[] var13 = str.toCharArray(); // splits the string into a char array

    String[] var14 = str.split(" "); // splits string on spaces into String[], [Welcome, to, the, jungle]
    String[] var15 = str.split(" ", 3); // limit number of splits, returns [Welcome, to, the jungle]
    String[] var16 = str.split("\\s"); // split string on 'spaces', same as split(" "), [Welcome, to, the, jungle]
    String[] var17 = "ttestingtesttt".split("t"); // splits String into String[], [, , es, ing, es] // empty is ignored at the end

    /*
     * String methods that return a String create a new String at each modification and performance can become a factor
     */
    String var18 = str.substring(5); // begins with character at index to the end
    String var19 = str.substring(1, 4); // begins with character at index and ends at the 'exclusive' index, "elc". doesn't print index 4
    String var20 = str.substring(0, 0); // from 0 to 0 so nothing
    String var21 = str.replace("e", "i"); // replaces all occurances of e with i and returns a new String
    String var22 = str.replace("e", ""); // removes all occurances of e
    String var23 = str.replaceFirst("e", "i"); // replaces first occurance of regex String with i
    String var24 = str.replaceAll("come|ngl|to|\\s", "go"); // replaces occurances of regex String with replacement string, "Welgogogogothegojugoe"
    String var25 = str.toUpperCase();
    String var26 = str.toLowerCase();

    // NOTE: use strip() method instead of trim()
    String var201 = str.trim(); // remove whitespace from leading and trailing. use strip() instead, it's newer
    String var202 = str.strip(); // newer version of trim(). remove whitespace from leading and trailing including unicode characters
    String var203 = str.stripLeading();
    String var204 = str.stripTrailing();
    String var205 = str.stripIndent(); // removes indents/whitespace
    String var206 = str.translateEscapes(); // returns new string with escaped characters as string literals
    String var207 = str.concat(" ending");
    String var208 = str.concat("to").concat("get").concat("her");
    String var209 = String.join("java", "is", "cool");

    String var301 = String.valueOf(4);
    String var302 = String.valueOf(new char[] { 'a', 'b', 'c' }); // only works for char[]. use Arrays.toString() for string such as ["p", "e", "t"]
    String var303 = String.valueOf(new String[]{"p", "e", "t"});  // returns the address of the object, [Ljava.lang.String;@5f184fc6. Use Arrays.toString() instead
    String var3035 = Arrays.toString(new String[] {"p", "e", "t"}); // returns "[p, e, t]"
    String var304 = String.valueOf(new int[] { 1, 2, 3 }); // returns the Address of object, only works for char[], use Arrays.toString()
    String var305 = String.valueOf(true); // returns "true"
    String var306 = String.valueOf(23.4); // returns "23.4"


    // ===== STRINGBUILDER =======================================

    StringBuilder sb = new StringBuilder("Work on your system");

    // StringBuilder does not create a new String each modification, instead you call toString()

    int var401 = sb.length();
    String var402 = sb.substring(1, 3); // from index 1 to exclusive 3, "or"
    char var403 = sb.charAt(2); // returns char at index 2, 'r'
    String var404 = sb.toString(); // When String type is needed

    sb.append("Don't worry.");
    sb.reverse();
    sb.reverse();

    sb = new StringBuilder("Work on your system");
    StringBuilder var500 = sb.insert(7, "***"); // insert string at index 7. this will change sb. the return reference can be stored in another variable
    var500.insert(7, " ###"); // also changes sb, same object!, var500 and sb are now "Work on ###*** your system"
    System.out.println(var500);


    sb.insert(sb.length(), " "); // adds blank space at the end
    sb.replace(3, 6, "%%"); // replace form 3 to before 6 with the value
    sb.delete(3, 5); // delete from 3 to before 5
    sb.deleteCharAt(3); // delete char at index 3


    // StringBuilder.equals() returns true only when passed the same object as an argument. It does not compare the contents
    // Since Java 11, StringBuilder implements Comparable, so you can use a compareTo method for the equality test
    StringBuilder var600 = new StringBuilder("a");
    StringBuilder var601 = new StringBuilder("a");
    System.out.println(var600 == var601); // false
    System.out.println(var600.compareTo(var601) == 0); // true, the strings are equal
    System.out.println(var600.toString().equals(var601.toString())); // true, the strings are equal


  }

}