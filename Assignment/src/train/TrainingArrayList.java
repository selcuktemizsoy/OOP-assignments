package train;

import java.util.ArrayList;
import java.util.Random;

public class TrainingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> listOne = new ArrayList<>();
		ArrayList <Integer> listTwo;
		listOne.add(3);
		listOne.add(5);
		listOne.add(2, 5);
		listTwo = new ArrayList<>(listOne);
		
		listTwo.add(2, 10);
		listTwo.add(2, 5);
	//	System.out.println(listTwo);
		listOne.remove(new Integer(5));
		listTwo.removeAll(listOne);
		
//		System.out.println(listOne);
//		System.out.println(listTwo);
		
		Random r = new Random();
		int a = r.nextInt('z' - 'a');
		System.out.println( (char)(6));
		
	}

}
