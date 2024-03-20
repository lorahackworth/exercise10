import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Joker", "Joker@Persona5.com");
        Person person2 = new Person("Akechi", "Akechi@Persona5.com");

        Contact contact = new Contact();
        contact.addPerson(person1);
        contact.addPerson(person2);

        contact.display();
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
        return "*****\nName: " + name + "\nEmail Address:" + email + "\n";
    }

}

class Contact implements Iterable{
    private ArrayList<Person> myList = new ArrayList<>();
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
        return null;
    }

    public void display(){
        Iterator<Person> it = myList.iterator();
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(it.next());
        }
    }
}