package code.edu.dsm.dmacc.hw19;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {

	public static void main(String[] args) {

		// Homework
		Function<String, Integer> StringToInt = (String s) -> {
			return s.length();
		};

		System.out.println("Result StringToInt : " + StringToInt.apply("Hello"));

		BiFunction<String, String, Integer> StringsToInt = (String x, String y) -> {
			return x.length() + y.length();
		};

		System.out.println("Result StringsToInt : " + StringsToInt.apply("Hello", "World"));

		Consumer<String> useString = (String s) -> {
			System.out.println(s);
		};
		useString.accept("Result Consumer Lambda");

		Supplier<String> makeString = () -> {
			return "Hello!";
		};
		System.out.println("Result makeString : " + makeString.get());

	}

}
