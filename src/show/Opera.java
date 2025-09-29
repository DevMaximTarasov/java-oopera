package show;

import person.Director;
import person.MusicAuthor;

public class Opera extends MusicalShow{
    private final int choirSize;

    public Opera(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
