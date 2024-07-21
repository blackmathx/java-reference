package lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class _Runner {

    public static void run(){
        // Explains and demonstrates Lambdas

        System.out.println("runner..");
        var list = new ArrayList<Animal>();

        list.add(new Animal("Fish", false, true));
        list.add(new Animal("Cat", true, false));
        list.add(new Animal("Frog", true, true));
        list.add(new Animal("Penguin", false, false));


        /*
             Step 1: create an interface for a general checker
             Step 2: create a checker implementation CanHop
             Step 3: pass the list and a checker object to a method to do something
             Step 4: Then, change the checker object reference to a lambda expression
         */



        // standard way to pass a Checker implementation
        print(list, new CanThisHop());

        // using a lambda expression instead
        print(list, a -> a.canHop());

        // replace with lambda reference
        print(list, Animal::canHop);


        // Using the functional interface another way
        Answer ans = s -> {
            System.out.println("running lambda");
            System.out.println(s);
            System.out.println("done");
            return s.name();
        };
        String res = ans.abc(list.get(0));
        System.out.println(res);


    }


    static void print(ArrayList<Animal> animals, Checker checker){
        for(Animal a: animals){
            if(checker.test(a)){
                System.out.println(a);
            }
        }
    }
}

interface Answer {
    String abc(Animal a);
}
