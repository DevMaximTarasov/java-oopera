package show;

import person.Director;
import person.MusicAuthor;

public class MusicalShow extends Show {
    private final MusicAuthor musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText(){
        System.out.println("Текст либретто для \"" + getTitle() + "\":");
        System.out.println(librettoText);
    }

    public MusicAuthor getMusicAuthor() {
        return musicAuthor;
    }
}
