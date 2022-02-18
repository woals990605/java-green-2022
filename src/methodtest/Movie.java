package methodtest;

public class Movie {
    private String title, director, actors;

    public Movie(String title) {
        this.title = "Transformer";
    }

    public String getTitle() {
        return title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
