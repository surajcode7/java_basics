package com.sk.stream.api.hk;

import java.util.List;

public class MapTest {
	
public static void main(String[] args) {
	
	List<Object> list = List.of("a",10,"b",20,"c",30,21,35);
	
	list.stream()                //object type["a",10,"b",20,"c",30,21,35]
	.map(ele->ele.toString()+5)  //String type["a5","105","b5","205","c5","305","215","355"]
	.forEach(System.out::println);// o/p:"a5","105","b5","205","c5","305","215","355"
	System.out.println(".......................");
	
    //***map()********
	list.stream()              //object type["a",10,"b",20,"c",30,21,35]
	.map(ele->ele.toString()+5)// //String type["a5","105","b5","205","c5","305","215","355"]
	.forEach(ele->System.out.println(ele.toUpperCase()));// o/p:"A5","105","B5","205","C5","305","215","355"
	System.out.println(".......................");
	
	//***using filter()***
	list.stream()                       //object type["a",10,"b",20,"c",30,21,35]
	.filter(ele->ele instanceof String) //object type["a","b","c"]
	//.forEach(ele->System.out.println(ele.toUpperCase()));  //compile time error
	.forEach(ele->System.out.println(ele));
	System.out.println(".......................");
	
	list.stream()                    //object type["a",10,"b",20,"c",30,21,35]
	.map(ele->5)                     //Integer type[5,5,5,5,5,5,5,5]
	.forEach(System.out::println);   //5,5,5,5,5,5,5,5
	System.out.println(".......................");
	
	list.stream()                    //object type["a",10,"b",20,"c",30,21,35]
	.map(ele->5)                     //Integer type[5,5,5,5,5,5,5,5]
	.forEach(ele->System.out.println(ele+5));//10,10,10,10,10,10,10,10
	System.out.println(".......................");
	
	
	//retrieving only strings and print them in upper case
	list.stream()                         //object type["a",10,"b",20,"c",30,21,35]
	.filter(ele->ele instanceof String)   //object type["a","b","c"]
	.map(ele->ele.toString().toUpperCase())  //String["A","B","C"]
	.forEach(System.out::println);         // o/p: A, B, C
}
}
