package zadaci_12_02_2018;

import java.util.*;
public class NajvecaVrijednostArrayList {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		if (max(list) == null){
			System.out.println("Lista je prazna");
		}
		else {
		System.out.println("Najveci broj u listi je " + max(list));
		}
	}
public static Integer max(ArrayList<Integer>list){
	if (list == null || list.size() == 0){
		return null;
	}
	else {
		int max = list.get(0);
		for (int e : list){
			if (e > max){
				max = e;
			}
		}
	
	return max;
	}
}
}
