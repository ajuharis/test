package com.haris.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.haris.bean.Address;
import com.haris.bean.Person;

public class CollectionExampleJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = Arrays.asList(new Person(1, "Haris", 20, new Address(1, "Abc house", "Keezhathur", "Kottayi", "Palakkad", "Kerala", 678572)),
				new Person(2, "Sulu", 20, new Address(2, "Kha house", "Padinjart", "Kottayi", "Palakkad", "Kerala", 678572)),
				new Person(3, "HKamal", 20, new Address(3, "Ajhjbc house", "Tvhgjh", "Mathur", "Palakkad", "Kerala", 678572)),
				new Person(4, "Gitar", 20, new Address(4, "dydyd house", "Labuud", "Pathiri", "Palakkad", "Kerala", 678572)),
				new Person(5, "Para", 20, new Address(5, "djdj house", "Kulamkal", "Mankar", "Trissure", "Kerala", 678572)));
		printAll(persons);
		System.out.println("********************************************************");
		Collections.sort(persons, (p1, p2) -> p1.getId() - p2.getId());
		printAll(persons);
		System.out.println("********************************************************");
		Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		printAll(persons);
		System.out.println("********************************************************");
	}
	private static void printAll(List<Person> persons) {
		for(Person p : persons) {
			System.out.println(p);
		}
	}

}
