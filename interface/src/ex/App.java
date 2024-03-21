package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        TeacherMusician tm = new TeacherMusician("anna", "rossi", 20);

        Musician musician = tm;

        Teacher teacher = tm;

        Person person = tm;

        Object object = tm;

        Collection<Musician> c = new ArrayList<>();

        c.add(new TeacherMusician("anna", "rossi", 10));
        c.add(new Computer());
        c.add(new TeacherMusician("davide", "bianchi", 10));

        List<String> parole = Arrays.asList("ciao", "arrivederci", "addio", "salve", "salve", "buondi");

        System.out.println(parole);

        Set<String> paroleNoDuplicati = new TreeSet<>(parole);

        System.out.println(paroleNoDuplicati);

        Iterator<String> iterator = parole.iterator();

        System.out.println("------------------iterator");
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }

        System.out.println("------------------for:");
        for (String p : parole) {
            System.out.println(p);
        }

        System.out.println("------------------foreach lambda");
        parole.forEach(t -> System.out.println(t.toUpperCase()));

        System.out.println("------------------foreach method reference");
        parole.forEach(System.out::println);

        System.out.println("------------------foreach method reference");
        parole.forEach(App::wordConsumer);

    }

    private static void wordConsumer(String w) {
        System.out.println(w);
    }
}

class MyConsumer implements Consumer<String> {

    @Override
    public void accept(String t) {
        System.out.println(t);
    }

}