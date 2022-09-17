public class Buch {
    private String buchID;
    private String autor;
    private String titel;
    private int erscheinungsjahr;
    private String genre;

    public Buch(String buchID, String autor, String titel, int erscheinungsjahr, String genre) {
        this.buchID = buchID;
        this.autor = autor;
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.genre = genre;
    }

    public String getBuchID() {
        return buchID;
    }

    public String getAutor() {
        return autor;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitel() {
        return titel;
    }
}
