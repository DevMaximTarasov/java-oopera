package person;

import enums.Gender;

public class Actor extends Person{
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name=" + getName() +
                ", surname=" + getSurname() +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;
        return height == actor.height && getName().equals(actor.getName()) && getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        if (getName() != null) {
            hash = hash * 11 + getName().hashCode();
        }
        if (getSurname() != null) {
            hash = hash * 31 + getSurname().hashCode();
        }
        if (height != 0) {
            hash = hash * 17 + height;
        }
        return hash;
    }
}
