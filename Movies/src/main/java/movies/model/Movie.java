package movies.model;

public class Movie {
    private String title;
    private int category;
    private Director director;
    
    public Movie (String title, int category) {
        this.title = title;
        this.category = category;
    }

	public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }


    public Director getDirector() {
        return director;
    }


    public void setDirector(Director director) {
        this.director = director;
    }
}
