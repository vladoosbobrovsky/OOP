import java.util.Random;

public class ths {
	
	public static void main(String args[]) {
		//#1
		
		int sum = 1;
		
		
		int[] arr = { 1, 5, 9, 3, 5, 7, 7, 9, 2};
		
		for(int i = 1;i < arr.length;i++){
			boolean is = false;
			for(int j = 0;j < i;j++){
				if(arr[j] == arr[i]){
					is = true;
					break;
				}
			}
			if(is == false){
				sum += 1;
			}
		}
		
		System.out.println(sum);
		
		///////////////////////////////////////////////////////
		
		//#2
		/*int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9};

		int[] arr2 = new int[9];

		Random rand = new Random();
		int index = 0;

		for (int i = 0;i < 9;i++) {
			while(true){
				index = rand.nextInt(9);
				if(index != i && arr2[index] == 0){
					arr2[index] = arr[i];
					break;
				}
					
			}
			
		}

		for (int i = 0;i < 9;i++) {
			System.out.printf("%d ", arr2[i]);
		}*/
		
		///////////////////////////////////////////////////////
		
		//#3
		/*char[] email = { 'k', 'r', 'i', 's', 't', 'i', 'n', 'a', '@', 'g', 'm', 'a', 'i', 'l', '.', 'c', 'o', 'm' };
		int dog = 0, dot = 0;
		char c = '@', d = '.';
		for(int i = 1;i < email.length;i++){
			if(c == email[i]){
				dog = i;
				break;
			}
		}
		
		for(int i = dog+1;i < email.length;i++){
			if(d == email[i]){
				dot = i;
				break;
			}
		}
		
		for(int i = dog + 1;i < dot;i++){
			email[i] = '*';
		}
		
		System.out.println(email);*/
	}
}