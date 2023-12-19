public class CheckElement{


public static boolean checkIfElementOccursInList(int[] my_list, int element) {

        for (int item = 0; item < my_list.length; item++) {

             if (my_list[item] == element) {

                return true;

		}
            }
	return false;
    	}



public static void main(String[] args) {


	int[] my_list = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

	int element = 14;


	if (checkIfElementOccursInList(my_list, element)) {

		System.out.println("Item exists in the array");
        } 

	else {

            System.out.println("Item does not exist in the array");
        }

       }



}
