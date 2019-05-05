package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int a = 0; a < t; a++) {
			String line = s.next();
			Map<Character, Integer> count = new HashMap<Character, Integer>();
			for (int b = 0; b < line.length(); b++) {
				char c = line.charAt(b);
				if (!count.containsKey(c)) {
					count.put(c, 1);
				} else {
					count.put(c, count.get(c) + 1);		
				}
			}
			int sum = 0;
			for (char d : count.keySet()) {
				sum += count.get(d);
			}
			boolean valid = false;
			for (char d : count.keySet()) {
				if (count.get(d) * 2 == sum)
					valid = true;
			}
			if (valid) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		s.close();
	}

}
