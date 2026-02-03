package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Movie{
	String name;
	double rating;
	int year;
	
	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year=year;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" |Rating: "+rating+ " Year: "+year;
	}
}

public class TrendingMovies {
	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();
		
		movies.add(new Movie("Avengers", 5, 2018));
		movies.add(new Movie("Dhurandar", 3.5, 2025));
		movies.add(new Movie("Tere Ishq Me", 4.2, 2024));
		movies.add(new Movie("Train To Busan", 4.7, 2017));
		movies.add(new Movie("Jurassic world", 3, 2020));
		movies.add(new Movie("Jumanji", 5, 2014));
		
		movies.stream()
        .filter(m -> m.rating >= 8)
        .sorted(
            Comparator.comparingDouble((Movie m) -> m.rating).reversed()
                      .thenComparingInt(m -> m.year).reversed()
        )
        .limit(5)
        .forEach(System.out::println);
		
	}
}
