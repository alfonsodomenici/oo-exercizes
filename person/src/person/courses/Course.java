package person.courses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import person.Person;

public class Course {

    private final String name;
    private final LocalDate start;
    private final List<Subscriber> subscribers;

    public Course(String name, LocalDate start) {
        this.name = name;
        this.start = start;
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Person p){
        System.out.println("add Person");
        subscribers.add(new Subscriber(p));
    }

    public void subscribe(Subscriber p){
        System.out.println("add Subscriber");
        subscribers.add(p);
    }

    public void remove(Subscriber p){
        subscribers.remove(p);
    }

    /*getters etc.. */
    public String getName() {
        return name;
    }

    public LocalDate getStart() {
        return start;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((start == null) ? 0 : start.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (start == null) {
            if (other.start != null)
                return false;
        } else if (!start.equals(other.start))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + ", start=" + start + ", subscribers=" + subscribers + "]";
    }
    

    

}
