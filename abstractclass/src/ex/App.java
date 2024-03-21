package ex;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Animal> zoo = Arrays.asList(new Lion(), new Tiger(), new Tiger());

        for (Animal animal : zoo) {
            animal.spaventa();
        }
    }
}
