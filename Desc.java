import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;
public class Desc {

// 	  Method to do the sorting
	  public static int[] sortDesc(int[] in) {
		 //sorting in asc
		  Arrays.sort(in);
		  //reverse order
		  int newin[] = new int [in.length]; 
		  int j = in.length-1; 
		  for (int i= 0; i<in.length; i++) {
			  newin[i]=in[j]; 
			  j--; 
		  }
		  
		  return newin;
	  }

	//Unit Test:
	 @Test 

		public void TestingSortingAsc() {
//			Test case 1 
		 	int testarr1[] = {3, 1, 2, 5, 7, -10};
			int [] correct1 = new int[] {7,5,3,2,1,-10};
			assertTrue("Incorrect",Arrays.equals(correct1, sortDesc(testarr1)));
//			Test case 2
			int testarr2[]= { };
			int [] correct2 = new int[] {};
			assertTrue("Incorrect",Arrays.equals(correct2, sortDesc(testarr2)));
			
//			Test case 3
			int testarr3[]= {1,2,3,4,8,9,50};	
			int correct3[]= {50,9,8,4,3,2,1};
			assertTrue("Incorrect",Arrays.equals(correct3, sortDesc(testarr3)));
		}
}