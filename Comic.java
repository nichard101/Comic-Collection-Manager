import java.util.Arrays;

public class Comic {
    String name;
    double number;
    String[] writer;
    String[] artist;

    public Comic(String name, double number){
        this.name = name;
        this.number = number;
    }

    /**
     * Set single writer
     * @param writer Name of writer
     */
    public void setWriter(String writer){
        this.writer = new String[]{writer};
    }

    /**
     * Set single artist
     * @param artist Name of artist
     */
    public void setArtist(String artist){
        this.artist = new String[]{artist};
    }

    /**
     * Set multiple writers
     * @param writers Names of writers
     */
    public void setWriter(String[] writers){
        this.writer = writers;
    }
    
    /**
     * Set  multiple artists
     * @param artists Names of artists
     */
    public void setArtist(String[] artists){
        this.artist = artists;
    }

    /**
     * 
     * @return Issue name
     */
    public String getName(){
        return this.name;
    }

    /**
     * 
     * @return Issue number
     */
    public Double getNumber(){
        return this.number;
    }

    /**
     * 
     * @return String array of writer/s
     */
    public String[] getWriter(){
        return this.writer;
    }
    
    /**
     * 
     * @return String array of artist/s
     */
    public String[] getArtist(){
        return this.artist;
    }

    public String displayComic(){
        return name + " " + number + "\nWriter: " + Arrays.toString(writer) + "\nArtist: " + Arrays.toString(artist);
    }
}
