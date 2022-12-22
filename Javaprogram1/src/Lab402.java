import java.util.*;
public class Lab402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputBB  = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence  = inputBB.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point :");
			sentence = inputBB.nextLine();
			if(sentence.endsWith(".")) {
				break;
			}
		}
		int numberofindex = 0;
		String tence = sentence.replace(".",".");
		System.out.println();
		for (int i = 0; i < sentence.length();i++) {
			if(tence.charAt(i) ==' ') {
				System.out.println(tence.substring(numberofindex,i));
				numberofindex=i+1;
			}
		}
	}

}
