package person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import person.courses.Course;
import person.courses.Subscriber;

public class App {

    public static void main(String[] args) {
        PersonUnm p1 = new PersonUnm("alfonso", 57);

        PersonUnm p2 = new PersonUnm("maria", 40);

        
        System.out.println(p1.toString());

        System.out.println(p2.toString());

        Person p3 = new Person("mario", 23);

        
        System.out.println(p3);

        p3.setAge(20);

        System.out.println(p3);

        PersonRec p4 = new PersonRec("anna", 27);

        System.out.println(p4);

        System.out.println(createRandom());

        List<Person> elenco = new ArrayList<>();

        elenco.add(createRandom());
        elenco.add(createRandom());
        elenco.add(createRandom());

        for (Person person : elenco) {
            System.out.println(person);
        }

        Course course = new Course("java", LocalDate.now());

        course.subscribe(new Subscriber("mario", 25, false));
        course.subscribe(new Subscriber("anna", 23, false));
        course.subscribe(new Person("aa", 12));
        System.out.println(course);

        List<Person> people = new ArrayList<>();
        people.add(new Subscriber(null, 0, false));

        List<Subscriber> s = new ArrayList<>();
        //s.add(new Person(null, 0));
    }

    private static Person create(String name, int age){
        return new Person(name, age);
    }

    private static Person createRandom(){
        Random rnd = new Random();
        int age = rnd.nextInt(90) +1 ;
        return new Person(UUID.randomUUID().toString(), age);
    }


}
