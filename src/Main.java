import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;
    int classNumber;

    public Person(String name, int age, int classNumber) {
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Class: " + classNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Raj", 28, 2));
        persons.add(new Person("Raju", 27, 3));
        persons.add(new Person("Pinki", 22, 4));

        // Sorting based on age
        Collections.sort(persons, Comparator.comparingInt(Person::getAge));

        // Printing sorted persons
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}