package person.courses;

import person.Person;

public class Subscriber extends Person {

    private boolean paid;

    public Subscriber(Person p) {
        this(p.getName(), p.getAge());
    }

    public Subscriber(String name, int age) {
        this(name, age, false);
    }

    public Subscriber(String name, int age, boolean paid) {
        super(name, age);
        this.paid = paid;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    
    @Override
    public String toString() {
        return "Subscriber [ " +
                super.toString()
                + " paid=" + paid + "]";
    }

}
