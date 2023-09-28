package by.flameksandr.dao;

import by.flameksandr.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    List<Person> people;

    {
        people = new ArrayList<>(Arrays.asList(
                new Person(PEOPLE_COUNT++, "Tom"),
                new Person(PEOPLE_COUNT++, "Jessica"),
                new Person(PEOPLE_COUNT++, "Trevar"),
                new Person(PEOPLE_COUNT++, "Kate")
        ));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }
}
