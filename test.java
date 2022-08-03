package study;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface test {
	public static void main (String args[]) {
		
		
		// Function: 하나의 매개변수(T)를 입력받아서 결과(R)을 리턴해줌 즉, T타입 인자를 받아서 R타입을 리턴한다.
		Function<Integer, String> showFunction = (a) -> a.toString();
		System.out.println(showFunction.apply(3));
		
		// Consumer: T타입의 인자에 대해 데이터만 소비하고 아무것도 생성하지 않는다. 즉, 인자 하나를 받고 아무것도 리턴하지 않는다.
		Consumer<String> showConsumer = (i) -> System.out.println(i);
		showConsumer.accept("Allra");
		
		// Supplier: 매개변수가 존재하지 않으며 T타입의 객체를 반환한다 즉, 아무런 인자를 받지 않고 T 타입의 객체를 리턴
		Supplier<String> showSupplier = () -> "핀테크";
		System.out.println(showSupplier.toString());
		
		// Predicate: 특정값을 받아서 boolean 값을 변환하는 인터페이스 즉, 인자를 하나 받아서 boolean 타입을 리턴한다.
		Predicate<Integer> showPredicate = (i) -> i * 5 == 10;
		System.out.println(showPredicate.test(2));
		
		// Runnable: 아무런 객체를 받지도 리턴하지도 않는다.
		Runnable showRunnable = () -> System.out.println("오늘도 화이팅...");
		showRunnable.run();
	}
}
