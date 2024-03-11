package model;

import java.util.List;

public class PostMovieLogic {
	public void execute(Movie movie, List<Movie> movieList) {
		movieList.add(0,movie);
	}
}
