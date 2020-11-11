/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.raitins.entities;

/**
 *
 * @author Toshiba
 */
public class Raiting {
    
    
    private String movieId;
    private int raiting;

    
    
    
    public Raiting(String movieId, int raiting) {
        this.movieId = movieId;
        this.raiting = raiting;
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
