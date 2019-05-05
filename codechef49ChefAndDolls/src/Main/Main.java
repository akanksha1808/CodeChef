package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int n = scan.nextInt();
			while (n != 0) {
				int a = scan.nextInt();
				int i = 1;
				if (!map.containsKey(a))
					map.put(a, i);
				else {
					i = map.get(a);
					i++;
					map.put(a, i);
				}
				n--;

			}
			Collection<Integer> values = map.values();
			// System.out.println(map.entrySet());
			ArrayList<Integer> lists = new ArrayList<>(values);
			// int l=lists.size();
			// System.out.println(lists);
			for (int j : lists) {
				// System.out.println(j);
				if (j % 2 != 0)
					System.out.println(getKey(map, j));

			}
		}

	}

}
