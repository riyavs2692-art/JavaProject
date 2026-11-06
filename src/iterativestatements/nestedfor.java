package iterativestatements;

public class nestedfor {

	public static void main(String[] args) {
	
		// ****
		// ****
		// ****
        // 3 raws and 4 columns
	    // 3x4matrix
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*"); 
			}//return back to inner loop j++
			//return to outer loop when inner loop condition is false
			System.out.println();
			
		}// return back outer loop i++
		
		
		
	}

}
