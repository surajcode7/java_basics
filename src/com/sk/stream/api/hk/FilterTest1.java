package com.sk.stream.api.hk;

import java.util.List;

/*
 create collection of elements with Strings and Integers and retrieve only String
 elements and print by stream API
 */
public class FilterTest1 {
  public static void main(String[] args) {
	
	  List<Object> list = List.of("suraj",10,"pravin",20,"rahul",30,21,35);
	  
	  //retrieving Strings
	  list.stream()
	  .filter(ele->ele instanceof String)
	  .forEach(System.out::println);
	  System.out.println(".............................");
	  
	  //retrieving Integer
	  list.stream()
	  .filter(ele->ele instanceof Integer)
	  .forEach(System.out::println);
	  System.out.println(".............................");
	  
	  //retrieving integers and printing even numbers
	  list.stream()
	  .filter(ele->ele instanceof Integer)
	  .filter(ele->((Integer)ele)%2==0)
	  .forEach(System.out::println);
	  System.out.println(".............................");
	  
	  //retrieving integers and printing odd numbers
	  list.stream()
	  .filter(ele->ele instanceof Integer)
	  .filter(ele->((Integer)ele)%2!=0)
	  .forEach(System.out::println);
	  System.out.println(".............................");
	  
	  
	  
	  
	  
}
}
