package _7.Map;

import java.util.Collections;
import java.util.HashSet;

public class HowToHandelThreadconcurrency {

	public static void main(String[] args) {
		Collections.synchronizedSet(new HashSet<Integer>());
	}

}
