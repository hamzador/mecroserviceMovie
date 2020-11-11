package org.tem.entities;

public class Raiting {
    
    
    private String movieId;
    private int raiting;

    
    
    
    public Raiting(String movieId, int raiting) {
        this.movieId = movieId;
        this.raiting = raiting;
    }

    
   
    
    
    public Raiting() {
		super();
		// TODO Auto-generated constructor stub
	}





	public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
    
    
    
}
