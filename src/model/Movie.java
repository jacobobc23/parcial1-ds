package model;

/**
 *
 * @author Jacobo-bc
 */
public class Movie {
    
    private String title;
    private String director;
    private String genre;
    private String language;
    private String productionStudio;
    private int yearLaunch;
    private String duration;

    public Movie(String title, String director, String genre, String language, String productionStudio,
            int yearLaunch, String duration) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.language = language;
        this.productionStudio = productionStudio;
        this.yearLaunch = yearLaunch;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProductionStudio() {
        return productionStudio;
    }

    public void setProductionStudio(String productionStudio) {
        this.productionStudio = productionStudio;
    }

    public int getYearLaunch() {
        return yearLaunch;
    }

    public void setYearLaunch(int yearLaunch) {
        this.yearLaunch = yearLaunch;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
}
