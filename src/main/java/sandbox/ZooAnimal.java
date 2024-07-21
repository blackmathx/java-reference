package sandbox;

public interface ZooAnimal {
    int numTeeth();

    static int count(){
        return 2;
    }

    default String test(){
        return "this teeth";
    }
}
