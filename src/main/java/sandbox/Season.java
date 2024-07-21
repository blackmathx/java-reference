package sandbox;

public enum Season {
    SUMMER("test-summer"), FALL("f"), WINTER("w"), SPRING("s"); // <- constructor calls without new keyword

    private final String something;
    Season(String s) {
        System.out.println("constructing");
        this.something = s;
    }
    public String getSomething(){
        return something;
    }

    public static String get() { return "season enum"; }
    public String getString() { return "non static string"; }
}
