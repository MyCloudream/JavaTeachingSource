package cn.ucai.tools;

import java.util.Random;

public class RandomTools {
	private static Random random = new Random();

	// return a random number that is greater than or equal to 0 and less than n
	public static int getRandomInt(int n) {
		return random.nextInt(n);
	}

	public static double getRandomDouble() {
		return random.nextDouble();
	}
}
