import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		int i = 0 ;
		while(i<20){
			
		String chars = "abcdefghjjiklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		while(sb.length() < 10){
			int index  = (int)(random.nextFloat() * chars.length());
			sb.append(chars.charAt(index));
		}
		
		String string = sb.toString();
		System.out.println(string);
		i++;
		}
	}
}
