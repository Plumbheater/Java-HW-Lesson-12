package org.ManagerMovies;
public class MoviesManager {
    private String[] movies = new String[0];
    private int limit;

    public MoviesManager(){
        limit = 10;
    }
    public MoviesManager(int limit){
        this.limit = limit;

    }

    public void addMovie(String movieName){
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movieName;
        movies = tmp;
    }

    public String[] findAll(){
        String[] tmp = new String[limit];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[i];
        }
        return  tmp;

    }

    public String[] findLast(){
        int resulLength;
        if (movies.length < limit){
            resulLength = movies.length;
        } else {
            resulLength = limit;
        }
        String[] tmp = new String[resulLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return  tmp;
    }
}