package java8;
//simple using streamAPI
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(35);
		list.add(30);
		list.add(20);
		list.add(12);
		list.add(45);
		list.add(11);
		list.add(100);

		List<Integer> evennumber = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

		evennumber.forEach(evennum -> System.out.println(evennum));

	}

}
