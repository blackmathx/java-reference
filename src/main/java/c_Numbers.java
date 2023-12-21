
public class c_Numbers{

  public static void runner(){
    System.out.println("\n=== Numbers =================\n");

    // each Numeric class extends Number so come with helper methods such as .intValue(), .doubleValue(), etc. 
    // These return the primitive value, but will be boxed to Wrapper if needed
    Integer ll = 4;
    long lll = ll.longValue();
    double dddd = ll.doubleValue();
    short ssss = ll.shortValue();
    

    // The byte data type can store whole numbers from -128 to 127.
    // 8 bit integer
    byte myNum = 100;

    // The short data type can store whole numbers from -32768 to 32767
    // 16 bit integer
    short myNum2 = 5000;

    // The int data type can store whole numbers from -2147483648 to 2147483647. 
    // In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
    int myNum3 = 234234;

    // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 
    // This is used when int is not large enough to store the value. Note that you should end the value with an "L":
    // 64 bit integer
    long myNum4 = 9223372036854775807L; // L required because Java interprets as an int before casting and that is too big for int

   
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

    double dd = (double) x / (double) y; 
    System.out.println(dd); // 3.5612244302161

    
    double xx = 3.49d;
    double yy = 0.98d;
    double zz = xx/yy; // 3.5612244897959187
    System.out.println(zz);


    // ooctal digits
    int oct = 017;
  
    // hexidecimal digits
    int hex = 0x1A;
    
    // binary digits 
    int bin = 0b1010;


    
  }
}