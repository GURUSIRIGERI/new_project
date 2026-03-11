package com.spring.jpa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.Movie;

@Repository//it will not create the object for interface ,it create pr
public interface MovieRepo extends CrudRepository<Movie,Integer> { //T means Types of database
	

}
 