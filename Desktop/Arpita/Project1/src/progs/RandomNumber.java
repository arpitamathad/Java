package progs;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		//		for(int i = 0 ; i <= 100 ; i++){
		//			long num = (long) (Math.random()*1000000000);
		//			System.out.println("9"+(long)num);
		//		}

		Random ran = new Random();
		int i=0;

		while(i++<100)
		{
			int num1 = ran.nextInt(9045)+1000;
			int num2 = ran.nextInt(65401)+10000;
			System.out.println("9"+num1+num2);
		}
	}
}
