
import java.lang.Math;

@SuppressWarnings("all")
public class c_Numbers{

  public static void runner(){
    System.out.println("\n=== Numbers =================\n");

    // each Numeric class extends Number so they come with helper methods such as .intValue(), .doubleValue(), etc.
    // These return the primitive value, but will be boxed to Wrapper if needed
    Integer var1 = 4;
    long var2 = var1.longValue();
    double var3 = var1.doubleValue();
    short var4 = var1.shortValue();

    // valueOf methods convert from primitive or string to Wrapper class
    int varInt = 4;
    Integer varInt2 = Integer.valueOf(varInt); // Each wrapper class has valueOf() methods
    Double varDouble = Double.valueOf("2.34");
    
    

    // The byte data type can store whole numbers from -128 to 127. 8 bit integer
    byte myNum = 100;

    // The short data type can store whole numbers from -32768 to 32767. 16 bit integer
    short myNum2 = 5000;

    // The int data type can store whole numbers from -2147483648 to 2147483647. 
    // In general the int data type is the preferred data type when we create variables with a numeric value.
    int myNum3 = 234234;

    // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 64 bit integer
    // This is used when int is not large enough to store the value. Note that you should end the value with an "L":
    long myNum4 = 9223372036854775807L; // L required because Java interprets as an int before casting to a long and this is too big for int

    // Note that you should end the value with an "f" for floats and "d" for doubles:
    // float fff = 2.34; //doesn't compile without f suffix or explicit casting
    // 32 bits. 4 bytes, low accuracy. 6-7 decimal digits. not the default float type which is double.
    float myNum5 = 5.75f;

    // Double data type is also decimal. 
    // 64 bits, 8 bytes. 15-16 decimal digits. used for more accuracy and more precision
    double d = 23.43;


    float x = 3.49f, y = 0.98f;
    float z =  x /  y; 
    System.out.println(z); // 3.5612245

    // not accurate
    double dd = (double) x / (double) y; 
    System.out.println(dd); // 3.5612244302161

    
    double xx = 3.49d;
    double yy = 0.98d;
    double zz = xx/yy; // 3.5612244897959187 // acutal value
    System.out.println(zz);


    // octal digits. start with 0
    int oct = 017;
  
    // hexidecimal digits. start with 0x
    int hex = 0x1A;
    
    // binary digits. start with 0b
    int bin = 0b1010;

    // ===== MATH =======================================
    // java.lang.Math

    double value1 = Math.min(12.3876, 10.2986);
    System.out.println(value1);
    long value2 = Math.round(value1); // removes decimal portion of a double and returns a long
    int value3 = Math.round(23.43f); // removes decimal portion of a float and returns an int

    // Math.ceil(double num);
    // Math.floor(double num);
    // Math.pow(double num, double exponent);
    // Math.random(); // returns number equal to 0 and less than 1. [0, 1)




    
  }
}