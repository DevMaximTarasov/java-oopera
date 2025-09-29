package person;

import enums.Gender;

public class Person {
    private final String name;
    private final String surname;
    private final Gender gender;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
