 package com.spring.jpa;

import org.springframework.data.convert.ReadingConverter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

//@Setter
//@Getter
//@AllArgsConstructor
////@NoArgsConstructor
//@RequiredArgsConstructor//only for the final variable it initialize for the final argument constructor
//@EqualsAndHashCode
//@ToString
@Data//@responsible to provide getter+setter+@requiredArsgConstructor+@EqualsAndHashCode+@ToString
@Value//@AllArgConstructor+@getter+@EqualsAndHashCode+@ToString
public class Persion {
	private int pid;
	private String pname;
	private final String Email;
	

}

