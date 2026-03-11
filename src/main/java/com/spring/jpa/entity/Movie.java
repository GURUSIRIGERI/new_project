package com.spring.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="movie_Details")
public class Movie {
	
	
	@Id//to specify primary key in an entity
	@Column(name="Mid") //give the column by own 
	private Integer movieId;
	@Column(name="Mname" ,nullable=false,unique = true)//if nullable=false, means Not Null.if nullable=true means it null,//unique=true means it will not allow duplicate 
	private String movieName;
	private String language;
	@Column(nullable=true)//True means Null.
	private double rating;
	private int ticketPrice;
	

}
