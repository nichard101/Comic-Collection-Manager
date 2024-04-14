import java.util.ArrayList;
import java.util.Arrays;

public class Series {
    public String name;
    public int volume, year;
    private ArrayList<Comic> comicList;

    public Series(String name, int volume, int year){
        this.name = name;
        this.volume = volume;
        this.year = year;
        this.comicList = new ArrayList<Comic>();
    }

    /**
     * 
     * @return String comic name
     */
    public String getName(){
        return name;
    }

    /**
     * 
     * @return int volume number
     */
    public int getVolume(){
        return volume;
    }

    /**
     * 
     * @return int comic year
     */
    public int getYear(){
        return year;
    }

    /**
     * 
     * @return int series size
     */
    public int getSize(){
        return comicList.size();
    }

    /**
     * Adds a comic to series
     * @param comic Comic object to be added
     */
    public void addComic(Comic comic){
        comicList.add(comic);
    }

    /**
     * Adds a comic to series
     * @param number Number of new comic
     */
    public void addComic(double number){
        Comic comic = new Comic(name, number);
        addComic(comic);
    }

    /**
     * Adds a comic to series
     * @param number number of new comic
     * @param writers Writer/s of new comic
     * @param artists Artist/s of new comic
     */
    public void addComic(double number, String[] writers, String[] artists){
        Comic comic = new Comic(name, number);
        comic.setWriter(writers);
        comic.setArtist(artists);
        addComic(comic);
    }

    /**
     * Prints series information
     */
    public void displaySeries(){
        System.out.println(name + " - " + getSize() + " issues\n");

        Comic start = comicList.get(0);
        Comic end = comicList.get(0);
        int i = 0;

        while(i < getSize()){
            Comic tempComic = comicList.get(i);
            if(i == getSize()-1){
                if(!Arrays.toString(tempComic.getWriter()).equals(Arrays.toString(start.getWriter()))){
                    System.out.println(displayRun(start, end));
                    System.out.println(displayRun(tempComic, tempComic));
                } else {
                    System.out.println(displayRun(start, tempComic));
                }
                
            } else if(!Arrays.toString(tempComic.getWriter()).equals(Arrays.toString(start.getWriter()))){
                System.out.println(displayRun(start, end));
                start = tempComic;
                end = start;
            } else {
                end = tempComic;
            }
            i++;
        }
        System.out.println("###########\n");
    }

    String displayRun(Comic start, Comic end){
        String writer = Arrays.toString(start.getWriter());
        String artist = Arrays.toString(start.getArtist());
        double startNum = start.getNumber();
        double endNum = end.getNumber();
        return startNum + (startNum != endNum ? (" - " + endNum) : "") + "\nWriter: " + writer.substring(1,writer.length()-1) + "\nArtist: " + artist.substring(1,artist.length()-1) + "\n";
    }
}
