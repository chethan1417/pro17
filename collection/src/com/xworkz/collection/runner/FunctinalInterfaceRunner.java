package com.xworkz.collection.runner;

import com.xworkz.collection.functionalInterface.BiConsumer;
import com.xworkz.collection.functionalInterface.BiFunction;
import com.xworkz.collection.functionalInterface.BiPredicate;
import com.xworkz.collection.functionalInterface.BinaryOperator;
import com.xworkz.collection.functionalInterface.Consumer;
import com.xworkz.collection.functionalInterface.DoubleBinaryOperator;
import com.xworkz.collection.functionalInterface.DoubleConsumer;
import com.xworkz.collection.functionalInterface.DoubleFunction;
import com.xworkz.collection.functionalInterface.DoublePredicate;
import com.xworkz.collection.functionalInterface.DoubleSupplier;
import com.xworkz.collection.functionalInterface.DoubleToIntFunction;
import com.xworkz.collection.functionalInterface.DoubleToLongFunction;
import com.xworkz.collection.functionalInterface.DoubleUnaryOperator;
import com.xworkz.collection.functionalInterface.Function;
import com.xworkz.collection.functionalInterface.IntBinaryOperator;
import com.xworkz.collection.functionalInterface.IntConsumer;
import com.xworkz.collection.functionalInterface.IntFunction;
import com.xworkz.collection.functionalInterface.IntPredicate;
import com.xworkz.collection.functionalInterface.IntSupplier;
import com.xworkz.collection.functionalInterface.IntToDoubleFunction;
import com.xworkz.collection.functionalInterface.IntToLongFunction;
import com.xworkz.collection.functionalInterface.IntUnaryOperator;
import com.xworkz.collection.functionalInterface.LongBinaryOperator;
import com.xworkz.collection.functionalInterface.LongConsumer;
import com.xworkz.collection.functionalInterface.LongFunction;
import com.xworkz.collection.functionalInterface.LongPredicate;
import com.xworkz.collection.functionalInterface.LongSupplier;
import com.xworkz.collection.functionalInterface.LongToDoubleFunction;
import com.xworkz.collection.functionalInterface.LongToIntFunction;
import com.xworkz.collection.functionalInterface.LongUnaryOperator;
import com.xworkz.collection.functionalInterface.ObjDoubleConsumer;
import com.xworkz.collection.functionalInterface.ObjIntConsumer;
import com.xworkz.collection.functionalInterface.ObjLongConsumer;
import com.xworkz.collection.functionalInterface.Predicate;
import com.xworkz.collection.functionalInterface.Supplier;
import com.xworkz.collection.functionalInterface.ToDoubleBiFunction;
import com.xworkz.collection.functionalInterface.ToDoubleFunction;
import com.xworkz.collection.functionalInterface.ToIntBiFunction;
import com.xworkz.collection.functionalInterface.ToIntFunction;
import com.xworkz.collection.functionalInterface.ToLongBiFunction;
import com.xworkz.collection.functionalInterface.ToLongFunction;
import com.xworkz.collection.functionalInterface.UnaryOperator;

public class FunctinalInterfaceRunner {

	public static void main(String[] args) {

		Consumer<Boolean> consumer = (Boolean b) -> {
			System.out.println("accept of Consumer in runner:" + b);
			System.out.println();
		};
		consumer.accept(true);

		BiConsumer<Boolean, Integer> biConsumer = (Boolean boo, Integer in) -> {
			System.out.println("accept of BiConsumer in runner:" + boo + " " + in);
			System.out.println();
		};
		biConsumer.accept(true, 11);

		Supplier<String> supplier = () -> {
			System.out.println("get of Supplier in runner");
			return "food";
		};
		supplier.get();
		System.out.println();

		Function<Integer, String> function = (i) -> {
			System.out.println("apply of Function in runner:" + i);
			return "done";
		};
		function.apply(10);
		System.out.println();

		BiFunction<Integer, Integer, Integer> biFunction = (i) -> {
			System.out.println("apply of BiFunction in runner:" + i);
			return 0;
		};
		biFunction.apply(11);
		System.out.println();

		Predicate<Double> predicate = (d) -> {
			System.out.println("test of Predicate in runner:" + d);
			return false;
		};
		predicate.test(10.00);
		System.out.println();

		BiPredicate<Integer, Integer> biPredicate = (i, i1) -> {
			System.out.println("test of Predicate in runner:" + i + " " + i1);
			return false;
		};
		biPredicate.test(10, 11);
		System.out.println();

		UnaryOperator<String> unaryOperator = (s) -> {
			System.out.println("apply of UnaryOperator in runner:" + s);
			return "done";
		};
		unaryOperator.apply("no");
		System.out.println();

		BinaryOperator<String> binaryOperator = (s, s1) -> {
			System.out.println("apply of BinaryOperator in runner:" + s);
			return "yes";
		};
		binaryOperator.apply("add", "divide");
		System.out.println();

		IntConsumer intConsumer = (i) -> {
			System.out.println("apply of BinaryOperator in runner:" + i);
		};
		intConsumer.accept(0);
		System.out.println();

		IntSupplier intSupplier = () -> {
			System.out.println("getAsInt of IntSupplier in runner");
			return 0;
		};
		intSupplier.getAsInt();
		System.out.println();

		IntFunction<Boolean> intFunction = (i) -> {
			System.out.println("apply of IntFunction in runner:" + i);
			return true;
		};
		intFunction.apply(0);
		System.out.println();

		IntPredicate intPredicate = (i) -> {
			System.out.println("test of IntPredicate in runner:" + i);
			return false;
		};
		intPredicate.test(0);
		System.out.println();

		IntUnaryOperator intUnaryOperator = (i) -> {
			System.out.println("applyAsInt of IntUnaryOperator in runner:" + i);
			return 1;
		};
		intUnaryOperator.applyAsInt(0);
		System.out.println();

		IntBinaryOperator intBinaryOperator = (i, i1) -> {
			System.out.println("applyAsInt of IntUnaryOperator in runner:" + i + " " + i1);
			return 2;
		};
		intBinaryOperator.applyAsInt(10, 20);
		System.out.println();

		LongConsumer longConsumer = (l) -> {
			System.out.println("accept of LongConsumer in runner:" + l);

		};
		longConsumer.accept(10);
		System.out.println();

		LongSupplier longSupplier = () -> {
			System.out.println("getAsLong of LongSupplier in runner");
			return 10L;

		};
		longSupplier.getAsLong();
		System.out.println();

		LongFunction<Integer> longFunction = (l) -> {
			System.out.println("apply of LongFunction in runner:" + l);
			return 100;

		};
		longFunction.apply(10L);
		System.out.println();

		LongPredicate longPredicate = (l) -> {
			System.out.println("test of LongPredicate in runner:" + l);
			return true;
		};
		longPredicate.test(20000L);
		System.out.println();

		LongUnaryOperator longUnaryOperator = (l) -> {
			System.out.println("applyAsLong of LongUnaryOperator in runner:" + l);
			return 3000L;
		};
		longUnaryOperator.applyAsLong(100000L);
		System.out.println();

		LongBinaryOperator longBinaryOperator = (l, l1) -> {
			System.out.println("applyAsLong of LongUnaryOperator in runner:" + l + " " + l1);
			return 0;
		};
		longBinaryOperator.applyAsLong(11111L, 2222L);
		System.out.println();

		DoubleConsumer doubleConsumer = (d) -> {
			System.out.println("accept of DoubleConsumer in runner:" + d);

		};
		doubleConsumer.accept(100);
		System.out.println();

		DoubleSupplier doubleSupplier = () -> {
			System.out.println("getAsDouble of DoubleSupplier in runner");
			return 0;
		};
		doubleSupplier.getAsDouble();

		DoubleFunction<String> doubleFunction = (d) -> {
			System.out.println("apply of DoubleFunction in runner:" + d);
			return "process";
		};
		doubleFunction.apply(100);
		System.out.println();

		DoublePredicate doublePredicate = (d) -> {
			System.out.println("test of DoublePredicate in runner:" + d);
			return true;
		};
		doublePredicate.test(232);
		System.out.println();

		DoubleUnaryOperator doubleUnaryOperator = (d) -> {
			System.out.println("applyAsDouble of DoubleUnaryOperator in runner:" + d);
			return 22;
		};
		doubleUnaryOperator.applyAsDouble(11);
		System.out.println();

		DoubleBinaryOperator doubleBinaryOperator = (d, d1) -> {
			System.out.println("applyAsDouble of DoubleBinaryOperator in runner:" + d + "  " + d1);
			return 1;
		};
		doubleBinaryOperator.applyAsDouble(54, 90);
		System.out.println();

		ToIntFunction<String> toIntFunction = (s) -> {
			System.out.println("applyAsInt of ToIntFunction in runner:" + s);
			return 10;
		};
		toIntFunction.applyAsInt("process");
		System.out.println();

		ToDoubleFunction<Double> toDoubleFunction = (d) -> {
			System.out.println("applyAsDouble of ToDoubleFunction in runner:" + d);
			return 1;
		};
		toDoubleFunction.applyAsDouble(232.0);
		System.out.println();

		ToLongFunction<Integer> toLongFunction = (i) -> {
			System.out.println("applyAsLong of ToLongFunction in runner:" + i);
			return 1;
		};
		toLongFunction.applyAsLong(22);
		System.out.println();

		ToIntBiFunction<String, String> toIntBiFunction = (s, s1) -> {
			System.out.println("applyAsInt of ToIntBiFunction in runner:" + s + "  " + s1);
			return 2;
		};
		toIntBiFunction.applyAsInt("ten", "two");
		System.out.println();

		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (i, i1) -> {
			System.out.println("applyAsDouble of ToDoubleBiFunction in runner:" + i + "  " + i1);
			return 2;
		};
		toDoubleBiFunction.applyAsDouble(33, 44);
		System.out.println();

		ToLongBiFunction<Integer, Integer> toLongBiFunction = (i, i1) -> {
			System.out.println("applyAsLong of ToLongBiFunction in runner:" + i + "  " + i1);
			return 3;
		};
		toLongBiFunction.applyAsLong(22, 44);
		System.out.println();

		ObjIntConsumer<Double> objIntConsumer = (d, i) -> {
			System.out.println("accept of ObjIntConsumer in runner:" + d + "  " + i);
		};
		objIntConsumer.accept(77., 9);
		System.out.println();

		ObjDoubleConsumer<String> objDoubleConsumer = (s, d) -> {
			System.out.println("accept of ObjDoubleConsumer in runner:" + s + "  " + d);

		};
		objDoubleConsumer.accept("number", 20);
		System.out.println();

		ObjLongConsumer<Integer> objLongConsumer = (i, l) -> {
			System.out.println("accept of ObjLongConsumer in runner:" + i + "  " + l);
		};
		objLongConsumer.accept(99, 775836L);
		System.out.println();

		IntToDoubleFunction intToDoubleFunction = (i) -> {
			System.out.println("applyAsDouble of IntToDoubleFunction in runner:" + i);
			return 5;
		};
		intToDoubleFunction.applyAsDouble(89);
		System.out.println();

		IntToLongFunction intToLongFunction = (i) -> {
			System.out.println("applyAsLong of IntToLongFunction in runner:" + i);
			return 9;
		};
		intToLongFunction.applyAsLong(34);
		System.out.println();

		DoubleToIntFunction doubleToIntFunction = (d) -> {
			System.out.println("applyAsInt of DoubleToIntFunction in runner:" + d);
			return 9;
		};
		doubleToIntFunction.applyAsInt(54);
		System.out.println();

		LongToIntFunction longToIntFunction = (l) -> {
			System.out.println("applyAsInt of LongToIntFunction in runner:" + l);
			return 99;
		};
		longToIntFunction.applyAsInt(8595L);
		System.out.println();

		DoubleToLongFunction doubleToLongFunction = (d) -> {
			System.out.println("applyAsLong of DoubleToLongFunction in runner:" + d);
			return 8;
		};
		doubleToLongFunction.applyAsLong(89);
		System.out.println();

		LongToDoubleFunction longToDoubleFunction = (l) -> {
			System.out.println("applyAsDouble of LongToDoubleFunction in runner:" + l);
			return 90;
		};
		longToDoubleFunction.applyAsDouble(9888);
		System.out.println();

	}
}
