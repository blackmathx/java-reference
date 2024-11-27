
import java.lang.Math;

@SuppressWarnings("all")
public class b_Numbers {

  public static void run(){
    System.out.println("\n======= Numbers =================\n");

    /*
     * byte, short, int, long, float, double, char. memorize in order
     * you get implicit casting from smaller to larger, otherwise explicitly cast them
     * primitives can't be null, where objects can be null. the typical consequence is using 'int id' in an object, it can't be null so use Long or Integer instead
     */



    // Each numeric class extends Number, so they all come with helper methods such as .intValue(), .doubleValue(), etc.
    Integer var10 = 4;
    long var20 = var10.longValue();
    double var30 = var10.doubleValue(); // returns primitive value
    Double var35 = var10.doubleValue(); // returns primitive value, but will be boxed to wrapper if needed
    short var40 = var10.shortValue();


    // Each numeric class has a static valueOf() method to convert from primitive or string to the Wrapper class
    int var50 = 4;
    Integer var60 = Integer.valueOf(var50); // Each wrapper class has valueOf() methods
    Double varDouble = Double.valueOf("2.34");
    Double var70 = Double.valueOf(var50);
    Float var80 = Float.valueOf("3.49");
    


    byte myNum = 100;     // The byte data type can store whole numbers from -128 to 127. 8 bit integer
    short myNum2 = 5000;  // The short data type can store whole numbers from -32768 to 32767. 16 bit integer
    int myNum3 = 234234;  // The int data type can store whole numbers from -2147483648 to 2147483647.

    // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 64 bit integer. Used when int is not large enough
    // L required here because Java interprets as an int before casting to a long and this is too big for int
    long myNum4 = 9223372036854775807L;


    // 32 bits. 4 bytes, low accuracy. 6-7 decimal digits. not the default float type which is double.
    // Note that you should end the value with an "f" for floats and "d" for doubles:
    // float fVariable = 2.34; // doesn't compile without f suffix or explicit casting because it is first interpreted as a double
    float myNum5 = 5.75f;

    double d = 23.43; // Double data type is also decimal. 64 bits, 8 bytes. 15-16 decimal digits. used for more accuracy and more precision


    // 3.49/.98 is an irrational repeating decimal, 3.5[612244897959183673469387755102040816326530]6122...
    float x = 3.49f, y = 0.98f;
    float z =  x /  y; // 3.5612245
    double dd = (double) x / (double) y; // 3.5612244302161
    double xx = 3.49d, yy = 0.98d;
    double zz = xx/yy; // 3.5612244897959187


    // Octal, Hexidecimal and Binary digits
    int oct = 017;    // octal digits. start with 0
    int hex = 0x1A;    // hexidecimal digits. start with 0x
    int bin = 0b1010;    // binary digits. start with 0b



    // ===== MATH ==============================================

    // java.lang.Math class
    // Note some methods are overloaded so they take mulltiple data types and retrun multiple data types

    /*
      Math.random();
      Math.max(x, y);
      Math.min(x, y);
      Math.abs(x);
      Math.sqrt(x);
      Math.pow(x, y);
      Math.round(x);
      Math.ceil(x);
      Math.floor(x);
      Math.sin(x);
      Math.cos(x);
      Math.tan(x);
      Math.log(x);
      Math.log10(x);
      Math.log1p(x); // natural log
      Math.hypot(x, y); // returns sqrt(x^2 + y^2)
      Math.E
      Math.PI
     */

    // Using java.lang.Math class
    double var300 = Math.max(Math.E, Math.PI); // takes doubles or floats
    int var301 = (int) Math.round(Math.random() * 100); // rounds and returns a long
    int var302 = Math.round(23.43f);
    long var303 = Math.round(23.43); // removes decimal portion and returns a long
    double var304 = Math.ceil(8.9f);
    double var305 = Math.floor(8.9);
    double var306 = Math.pow(2.1, 2.4);
    double var307 = Math.random(); // returns double that is between 0 inclusive and less than 1. [0, 1). ex: 0.8183029608682497

    
  }
}