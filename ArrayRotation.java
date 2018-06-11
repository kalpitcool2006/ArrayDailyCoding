
public class ArrayRotation {
	
	public static void rotate(int ar[], int d)
	{
		
		int n=ar.length;
		//System.out.println(n);
		int temp;
		for(int i = 0; i<d;i++)
		{
			temp =ar[0];
			for(int j=0; j<n-1;j++)
			{
					ar[j]=ar[j+1];
					
			}
			ar[n-1]=temp;
					
				
			
		
		}
		for(int i = 0; i<ar.length;i++)
		{
		
		System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={1,2,3,4,5};
		
		rotate(ar,2);
	}

}
