package org.leqcar.lambda.traders;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class AppTraders {

	public static void main(String[] args) {
		
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
		
		
		System.out.println("1) ==> Find all transactions in the year 2011 and sort them by value(small to high");
		transactions.stream()
			.filter(f -> 2011 == f.getYear())
			.map(Transaction::getValue)
			//asc
			.sorted()
			//desc .sorted((s1, s2) -> s2.compareTo(s1))
			.forEach(System.out::println);
		
		System.out.println("2) ==> What are all the unique cities where traders work");
		transactions.stream()
			.map(Transaction::getTrader)
			.map(Trader::getCity)
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("3) ==> Find all traders from Cambridge and sort them by name");
		transactions.stream()
			.filter(f -> "Cambridge".equals(f.getTrader().getCity()))
			.map(Transaction::getTrader)
			.map(Trader::getName)
			.sorted()
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("4) ==> Return a string of all traders names sorted alphabetically");
		String names = transactions.stream()
			.map(Transaction::getTrader)
			.map(Trader::getName)
			.sorted()
			.reduce("", (name1, name2) -> name1 + name2);
		System.out.println(names);
		
		String namesJoin = transactions.stream()
				.map(Transaction::getTrader)
				.map(Trader::getName)
				.sorted()
				.collect(Collectors.joining());
		System.out.println(namesJoin);
		
		System.out.println("5) ==> Are any traders based in Milan?");
		Boolean hasMilan = transactions.stream()
			.map(Transaction::getTrader)
			.anyMatch(f -> f.getCity().equals("Milan"));
		System.out.println("Result : " +hasMilan);
		
		System.out.println("6) ==> Print all transactions value from the traders living in Cambridge");
		transactions.stream()
			.filter(f -> f.getTrader().getCity().equals("Cambridge"))
			.map(Transaction::getValue)
			.forEach(System.out::println);
			
		System.out.println("7) ==> What’s the highest value of all the transactions?");
		OptionalInt highestValue =  transactions.stream()
			.mapToInt(Transaction::getValue)
			.max();
		System.out.println("Highest value: " +highestValue.getAsInt());
		
		System.out.println("8) ==> Find the transaction with the smallest value");

		Optional<Transaction> min1 = transactions
				.stream()
				.reduce((a, b) -> a.getValue() < b.getValue() ? a : b);
		System.out.println(min1);
		
		Optional<Transaction> min2 = transactions
				.stream()
				.min(Comparator.comparing(Transaction::getValue));
		System.out.println(min2);
		
		OptionalInt lowestValue =  transactions.stream()
			.mapToInt(Transaction::getValue)
			.min();
		System.out.println("Lowest transaction: " +lowestValue.getAsInt());
		
	}
}
