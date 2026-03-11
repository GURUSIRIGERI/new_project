//package com.spring.jpa.runner;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.spring.jpa.entity.Movie;
//import com.spring.jpa.repo.MovieRepo;
//
//import lombok.Data;
//
//@Data
//@Component
//public class MovieRunner implements CommandLineRunner {
//
//	@Autowired
//	MovieRepo mrp;
//
//	@Override
//	public void run(String... args) throws Exception {// if we write any code in this that will go as c
//
//		Movie movie1 = new Movie();
//		movie1.setMovieId(12);
//		movie1.setMovieName("Mark");
//		movie1.setLanguage("kannada");
//		movie1.setRating(4.5);
//		movie1.setTicketPrice(150);
//
//		// to save the entity/database
////		mrp.save(movie1);
//
//		Movie movie2 = new Movie();
//		movie2.setMovieId(13);
//		movie2.setMovieName("sahho");
//		movie2.setLanguage("telugu");
//		movie2.setRating(4);
//		movie2.setTicketPrice(200);
//
//		Movie movie3 = new Movie();
//		movie3.setMovieId(14);
//		movie3.setMovieName("kantara");
//		movie3.setLanguage("kannada");
//		movie3.setRating(5);
//		movie3.setTicketPrice(300);
//		
//		mrp.saveAll(Arrays.asList(movie1,movie2));
//		
//
////		List<Movie> movielist = Arrays.asList(movie1, movie2, movie3);
////		// Iterable<T> saveAll(Iterable <S Entity>)
////		mrp.saveAll(movielist);
//		
//
//		// Iterable<t> findALL();
//		List<Movie> movies = (List<Movie>) mrp.findAll();
//		movies.forEach(System.out::println);
////
////		// fingById return type is Optionel<T> FindById(13)
////
////		Movie movie = mrp.findById(13).get();
////		System.out.println(movie);
////
////		// Iterabl<T> findAllById(Iterable<ID>);
////		mrp.findAllById(Arrays.asList(12, 13)).forEach(System.out::println);
////
////		/*
////		 * if we pass existing id for the save() method it acts as a update method
////		 */
////		Movie movie4 = mrp.findById(13).get();
////		movie4.setMovieName("bahuballis");
////		System.out.println(mrp.save(movie4));
////
////		// long count()
////		System.out.println(mrp.count());
////
////		Movie deleteMovie = new Movie();
////		deleteMovie.setMovieId(12);
////		mrp.delete(deleteMovie);
////		
////		
////		mrp.deleteById(12);
////		mrp.deleteAllById(Arrays.asList(12,13));
////		mrp.deleteAll(Arrays.asList(movie1,movie3));
////		mrp.deleteAll();
////		
//	}
//
//}
