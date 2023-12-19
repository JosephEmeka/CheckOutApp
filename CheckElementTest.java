import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckElementTest{


	@Test
	public void checkIfElementOccursInList(){

	
	int[] my_list = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

	int element = 14;
        
        assertTrue(CheckElement.checkIfElementOccursInList(my_list, element));
    
	}
		

}




   
