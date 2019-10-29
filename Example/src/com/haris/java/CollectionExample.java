package com.haris.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.haris.bean.Address;
import com.haris.bean.Person;
import com.haris.rules.Condition;

public class CollectionExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(1, "Haris", 20, new Address(1, "Abc house", "Keezhathur", "Kottayi", "Palakkad", "Kerala", 678572)),
				new Person(2, "Sulu", 20, new Address(2, "Kha house", "Padinjart", "Kottayi", "Palakkad", "Kerala", 678572)),
				new Person(3, "HKamal", 20, new Address(3, "Ajhjbc house", "Tvhgjh", "Mathur", "Palakkad", "Kerala", 678572)),
				new Person(4, "Gitar", 20, new Address(4, "dydyd house", "Labuud", "Pathiri", "Palakkad", "Kerala", 678572)),
				new Person(5, "Para", 20, new Address(5, "djdj house", "Kulamkal", "Mankar", "Trissure", "Kerala", 678572)));
		printAll(persons);
		System.out.println("********************************************************");
		persons.sort(nameComparator);
		printAll(persons);
		System.out.println("********************************************************");
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}
			
		});
		printAll(persons);
		System.out.println("********************************************************");
		//printFirstNameBeginningWithH(persons);
		printConditionally(persons, new Condition() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getName().startsWith("H");
			}
		});
	}
	//Sort list by name
	private static Comparator<Person> nameComparator = new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};
	private static void printAll(List<Person> persons) {
		for(Person p : persons) {
			System.out.println(p);
		}
	}
	private static void printConditionally(List<Person> persons, Condition condition) {
		for(Person p : persons)
			if(condition.test(p)) {
				System.out.println(p.getName());
			}
	}
}
