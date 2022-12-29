package stream;

import org.apache.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

    public static void main(String[] args) {

        List<Person> people = getPeople();


        List<Person> females = new ArrayList<>();

    for (Person person : people) {
        if (person.getGender().equals(Gender.FEMALE)) {
            females.add(person);
        }
    }
    females.forEach(LOGGER::info);

        // Filter
        List<Person> male = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());


        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAge.ifPresent(LOGGER::info);
        }

    }

