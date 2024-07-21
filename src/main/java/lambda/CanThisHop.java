package lambda;

public class CanThisHop implements Checker {

    public boolean test(Animal a){
        return a.canHop();
    }
}
