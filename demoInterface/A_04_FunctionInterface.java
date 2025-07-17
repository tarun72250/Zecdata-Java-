package demoInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class A_04_FunctionInterface {

	public static void main(String[] args) {
		
		//Takes one input and returns a result
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Tarun"));
		
		//Takes two inputs and returns a result
		BiFunction<Integer,Integer, Integer> add = (a,b) ->(a+b);
		System.out.println(add.apply(2, 3));
		
		//Takes one input, returns boolean
		Predicate<String> checkChar = s -> s.startsWith("A");
		System.out.println(checkChar.test("Apply"));
		
		//Takes two inputs, returns boolean
		BiPredicate<String , Integer> bp = (s,len) -> s.length() == len;
		System.out.println(bp.test("tarun",5));
		
		// Takes input, performs action, returns nothing
		Consumer<String> printUpperCase = s->System.out.println(s.toUpperCase());
		printUpperCase.accept("rama");
		
		BiConsumer<String,Integer> bc = (name,age)->System.out.println(name+" is "+age+" years old");
		bc.accept("Aniket", 23);
		
		//Takes no input, returns output
		Supplier<Double> sup =() -> Math.random();
		System.out.println(sup.get());
		
		UnaryOperator<Integer> sq = (s) -> s*s;
		System.out.println(sq.apply(4));
		
		BinaryOperator<String> concat = (s,sa)-> s+sa;
		System.out.println(concat.apply("Java", "Script"));
		} 
}
