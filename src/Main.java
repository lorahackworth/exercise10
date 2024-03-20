import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Joker", "Joker@Persona5.com");
        Person person2 = new Person("Akechi", "Akechi@Persona5.com");

        Contact contact = new Contact();
        contact.addPerson(person1);
        contact.addPerson(person2);

        System.out.println(contact);
    }
}

class Person{
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

class Contact implements Iterable{
    private ArrayList<Person> myList = new ArrayList<Person>();
    public Contact(){
    }
    public void addPerson(Person a){
        myList.add(a);
    }
    @Override
    public String toString() {
        return "Contact{" +
                "myList=" + myList +
                '}';
    }
    @Override
    public Iterator iterator() {
        return myList.iterator();
    }
}