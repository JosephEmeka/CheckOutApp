
public class PrintEvenPositions {

	public static void printEvenPositions(int [] my_list) {
        	for (int item = 0; item < my_list.length; item += 2 ) 
		System.out.println(my_list[item]);
    	}



public static void main (String[] args) {


	int[] my_list = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};



	printEvenPositions(my_list);
      

       }
}