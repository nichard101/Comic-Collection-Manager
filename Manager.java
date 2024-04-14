import java.util.Scanner;
import java.util.ArrayList;

public class Manager {

    public static ArrayList<Series> library = new ArrayList<Series>();

    public static void main(String[] args){
        displayComics();
        addComic("Amazing Spider-Man", 143, new String[]{"Gerry Conway"}, new String[]{"Ross Andru"});
        addComic("Amazing Spider-Man", 500, new String[]{"J. Michael Straczynski"}, new String[]{"John Romita, Jr."});
        addComic("Amazing Spider-Man", 501, new String[]{"J. Michael Straczynski"}, new String[]{"John Romita, Jr."});
        addComic("Amazing Spider-Man", 502, new String[]{"J. Michael Straczynski"}, new String[]{"John Romita, Jr."});
        addComic("Amazing Spider-Man", 503, new String[]{"J. Michael Straczynski"}, new String[]{"John Romita, Jr."});
        addComic("Amazing Spider-Man", 504, new String[]{"J. Michael Straczynski"}, new String[]{"John Romita, Jr."});
        addComic("Amazing Spider-Man", 700, new String[]{"Dan Slott"}, new String[]{"Humberto Ramos"});
        addComic("Peter Parker, The Spectacular Spider-Man", 87, new String[]{"Bill Mantlo"}, new String[]{"Al Milgrom"});
        displayComics();
    }

    public static void displayComics(){
        for(Series s : library){
            s.displaySeries();
        }
    }

    public static int indexOfSeries(String name){
        for(int i = 0; i < library.size(); i++){
            if(library.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public static void addComic(String name, double number, String[] writers, String[] artists){
        int i = indexOfSeries(name);
        if(i != -1){
            library.get(i).addComic(number, writers, artists);
        }else{
            Series series = new Series(name, 1, 1900);
            series.addComic(number, writers, artists);
            library.add(series);
        }
    }
}