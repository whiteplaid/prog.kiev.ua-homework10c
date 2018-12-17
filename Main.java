package com.homework.intarray;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int[] array = generateArray(1000000);
		Map<Integer,Integer> numbers = count(array);
		Set<Integer> keys = numbers.keySet();
		for (Integer key : keys) {
			System.out.println(key + " = " + numbers.get(key) + "\t" + (numbers.get(key)*100)/array.length + "%");
		}
	}
	public static int[] generateArray (int n) {
		int[] array = new int[n];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(10);
		}
		return array;
	}
	public static <T> Map<T, Integer> count (T[] array) {
		Map<T, Integer> object = new HashMap<>();
		for (T i : array) {
			Integer element = object.get(i);
			if (element != null) {
				object.put(i,element + 1);
			} else {
				object.put(i, element);
			}
		}
		return object;
	}
	public static Map<Integer,Integer> count (int[] array) {
		Map<Integer,Integer> object = new HashMap<>();
		for (int i : array) {
			Integer element = object.get(i);
			if (element != null) {
				object.put(i, element + 1);
			} else {
				object.put(i, element);
			}
		}
		return object;
	}
}
