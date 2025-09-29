import enums.Gender;
import person.Actor;
import person.Choreographer;
import person.MusicAuthor;
import person.Director;
import show.Ballet;
import show.Opera;
import show.Show;

import static constant.Duration.*;
import static constant.Libretto.LIBRETTO_BALLET;
import static constant.Libretto.LIBRETTO_OPERA;
import static constant.Name.*;

public class Theatre {
    public static void main(String[] args) {
        Actor actorOne = new Actor(ACTOR_ONE_NAME, ACTOR_ONE_SURNAME, Gender.MALE, RandomManager.getRandomHeight());
        Actor actorTwo = new Actor(ACTOR_TWO_NAME, ACTOR_TWO_SURNAME, Gender.MALE, RandomManager.getRandomHeight());
        Actor actorThree = new Actor(ACTOR_THREE_NAME, ACTOR_THREE_SURNAME, Gender.FEMALE, RandomManager.getRandomHeight());

        Director directorOne = new Director(DIRECTOR_NAME, DIRECTOR_ONE_SURNAME, Gender.MALE, RandomManager.getRandomNumberOfShows());
        Director directorTwo = new Director(DIRECTOR_NAME, DIRECTOR_TWO_SURNAME, Gender.FEMALE, RandomManager.getRandomNumberOfShows());

        MusicAuthor musicAuthor = new MusicAuthor(COMPOSER_NAME, COMPOSER_SURNAME, Gender.FEMALE);

        Choreographer choreographer = new Choreographer(CHOREOGRAPHER_NAME, CHOREOGRAPHER_SURNAME, Gender.MALE);

        Show show = new Show(SHOW_NAME, SMALL_DURATION, directorOne);
        Opera opera = new Opera(OPERA_NAME, LARGE_DURATION, directorOne, musicAuthor, LIBRETTO_OPERA, RandomManager.getRandomChoirSize());
        Ballet ballet = new Ballet(BALLET_NAME, MEDIUM_DURATION, directorTwo, musicAuthor, LIBRETTO_BALLET, choreographer);

        show.addActor(actorOne);
        show.addActor(actorTwo);
        System.out.println("------------------------------------");
        opera.addActor(actorThree);
        opera.addActor(actorTwo);
        System.out.println("------------------------------------");
        ballet.addActor(actorOne);
        ballet.addActor(actorThree);
        System.out.println("------------------------------------");
        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();
        System.out.println("------------------------------------");
        show.changeActor(actorThree, actorOne.getSurname());
        show.printListOfActors();
        System.out.println("------------------------------------");
        ballet.changeActor(actorThree, CHOREOGRAPHER_NAME);
        ballet.printListOfActors();
        System.out.println("------------------------------------");
        ballet.changeActor(actorTwo, CHOREOGRAPHER_NAME);
        ballet.printListOfActors();
        System.out.println("------------------------------------");
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
