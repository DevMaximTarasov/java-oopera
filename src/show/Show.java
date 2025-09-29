package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final List<Actor> listOfActors;

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public boolean isActorInList(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер - " + actor + ", которого вы хотите добавить, уже есть в списке");
            return true;
        } else {
            return false;
        }
    }

    public void addActor(Actor actor) {
        if (!isActorInList(actor)) {
            listOfActors.add(actor);
            System.out.println("В представление: \"" + getTitle() + "\" добавлен актер: " + actor);
        }
    }

    public void changeActor(Actor actor, String previousActorSurname) {
        if (isActorInList(actor)) {
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(previousActorSurname)) {
                System.out.println("Заменен актер: " + listOfActors.get(i));
                listOfActors.remove(listOfActors.get(i));
                addActor(actor);
                return;
            }
        }
        System.out.println("В спектакле не было найдено актера, которого можно было бы заменить, с фамилией: " + previousActorSurname);
    }

    public void printListOfActors() {
        System.out.println("Список актеров для спектакля: " + getTitle());
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }
}
