import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
public class Asc {

// 	  Method to do the sorting
	  public static int[] sortAsc(int[] in) {
		  Arrays.sort(in); 
		  return in;
	  }

	//Unit Test:
	 @Test 

		public void TestingSortingAsc() {
//			Test case 1 
		 	int testarr1[] = {3, 1, 2, 5, 7, -10};
			int [] correct1 = new int[] {-10,1,2,3,5,7};
			assertTrue("Incorrect",Arrays.equals(correct1, sortAsc(testarr1)));
//			Test case 2
			int testarr2[]= { };
			int [] correct2 = new int[] {};
			assertTrue("Incorrect",Arrays.equals(correct2, sortAsc(testarr2)));
			
//			Test case 3
			int testarr3[]= {1,2,3,4,8,9,50};	
			int correct3[]= {1,2,3,4,8,9,50};
			assertTrue("Incorrect",Arrays.equals(correct3, sortAsc(testarr3)));
		}

}
