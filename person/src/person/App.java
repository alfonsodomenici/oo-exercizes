package person;

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

        
    }

}
