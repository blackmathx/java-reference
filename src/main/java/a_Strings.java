
import java.util.Arrays;

public class a_Strings {

  public static void runner() {
    System.out.println("\n=== Strings =================\n");

    String temp = "Welcome to the jungle";

    int var1 = temp.length();

    int var2 = temp.indexOf('c'); // index of first occurance or -1. returns 3
    int var3 = temp.indexOf("the"); // index of the first occurance or -1. returns 11
    int var4 = temp.indexOf("e ", 7); // with a "from index" parameter. returns 13
    int var5 = temp.indexOf(109); // first occurance of 'm' or -1, which the ascii 'm' is binary 01101101 = 109
    int var6 = temp.lastIndexOf("e", 6); // from index number
    int var7 = temp.lastIndexOf("he");
    int var25 = temp.compareTo("Other"); // compares unicode, 0 if same

    boolean var8 = temp.endsWith("gle");
    boolean var9 = temp.startsWith("Welcome");
    boolean var10 = temp.contains("the"); // returns boolean

    char var11 = temp.charAt(2); // returns 'l'
    char[] var12 = temp.toCharArray(); // returns char array of the string

    String[] var22 = temp.split(" "); // splits string on spaces into String[]
    String[] var23 = temp.split(" ", 4); // limit number of splits
    String[] var26 = temp.split("\\s");
    System.out.println(Arrays.toString(var26));
    String[] var24 = "testingtesttt".split("t"); // splits String into String[], [, es, ing, es] // empty is ignored at the end



    String var13 = temp.substring(5); // begins with character at index to the end
    String var14 = temp.substring(6, 9); // begins with character at index to the exclusive index
    String var15 = temp.substring(0, 0); // from 0 to 0 so nothing
    String var16 = temp.replace("e", "i"); // replaces all occurances of e with i and returns a new String
    String var17 = temp.replace("e", ""); // removes all occurances of e
    String var18 = temp.replaceFirst("e", "i"); // replaces first occurance of regex String with i
    String var19 = temp.replaceAll("come|ngl|to|\s", "go"); // replaces occurances of regex String with replacement string
    String var20 = temp.toUpperCase();
    String var21 = temp.toLowerCase();
    System.out.println(var19);


    String var201 = temp.trim(); // remove whitespace from leading and trailing
    // use strip() method instead of trim()
    String var202 = temp.strip(); // newer version of trim(). remove whitespace from leading and trailing including unicode characters
    String var203 = temp.stripLeading();
    String var204 = temp.stripTrailing();
    String var205 = temp.stripIndent(); // removes indents/whitespace
    String var206 = temp.translateEscapes(); // returns new string with escaped characters as string literals



    String var28 = temp.concat(" ending");
    String var29 = temp.concat("to").concat("get").concat("her");
    String var30 = String.join("java", "is", "cool");


    boolean var31 = temp.equals("other string"); // compares objects if string is equal
    boolean var32 = temp.equalsIgnoreCase("other string"); // compares ignore case
    boolean var33 = temp.isEmpty(); // returns true if it has 0 length
    boolean var34 = temp.isBlank(); // returns true if it only consists of blank spaces and non-printable, characters, \n \t


    // Returns Strings of the given input, boolean char, int. long, double char[], etc.
    String value1 = String.valueOf(4);
    String value2 = String.valueOf(new char[] { 'a', 'b', 'c' }); // only works for char[]. use Arrays.toString()
    String value6 = String.valueOf(new int[] { 1, 2, 3 }); // returns the Address of object!! only works for char[]
    String value3 = String.valueOf(true); // returns "true"
    String value4 = String.valueOf(23.4); // returns "23.4"





    // ===== STRINGBUILDER =======================================

    StringBuilder sb = new StringBuilder("Work on your system.");

    int variable400 = sb.length();
    String var40001 = sb.substring(3, 5); // from index 3 to before 5, "k "
    char variable42 = sb.charAt(5); // returns char at index 5, 'o'
    String var40002 = sb.toString(); // When String type is needed

    sb.append("Don't worry.");
    sb.reverse();
    sb.reverse();

    System.out.println("sb 1: " + sb);
    StringBuilder var66 = sb.insert(7, "###"); // insert string at index 7. it can change sb and return a reference to the same obj
    var66.insert(8, "# # # # #"); // also changes sb, same object!

    sb.insert(sb.length(), " "); // adds blank space at the end
    sb.replace(3, 6, "XY"); // replace form 3 to before 6 with the value
    sb.delete(3, 5); // delete from 3 to before 5
    sb.deleteCharAt(3); // delete char at index 3


    StringBuilder var80 = new StringBuilder("a");
    StringBuilder var81 = new StringBuilder("a");
    StringBuilder var82 = var80.append("xyz"); // able to return StringBuilder. reference to the same object
    System.out.println(var80 == var81); // false
    System.out.println(var80 == var82); // true

  }

}