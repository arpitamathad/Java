package progs;

public class Fibo {

	public static void main(String[] args) {
		
		int first=0,third=0;
		int second=1;
		System.out.print(first+" "+second+" ");
		while(first+second<=100){
			third = first + second;
			System.out.print(third+" ");
			first = second; 
			second = third;
		}
	}
}
