package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    List<Movie> movieList=new ArrayList<>();

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category){
        List<Movie> filteredMovieList=new ArrayList<>();
        for(Movie movie:movieList){
            if(movie.getCategory()==category && movie.getRating()>2){
                filteredMovieList.add(movie);
            }
        }
        return filteredMovieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(Movie movie){
        movieList.add(movie);
    }
}
