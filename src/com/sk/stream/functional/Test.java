package com.sk.stream.functional;

public class Test {

	public static void main(String[] args) {
		
		Addition intadd = new AdditionImpl();
		int intres = intadd.add(12, 12);
		
		AdditionLong longadd = new AdditionLongImpl();
		Long longres = longadd.add(20l, 30l);
		
		AdditionString stringadd = new AdditionStringImpl();
		String stringres = stringadd.add("suraj", "koli");
		
		System.out.println("intres="+intres+"\n"
				+"longres="+longres+"\n"
				+"stringres="+stringres);
		
	}
}
