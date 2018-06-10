
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]={1,2,3,4,5};
		
		int n=ar.length,p=1;
		//int ar[]={1,2,3,4,5};
		int ar1[] =new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				
			{
				
				if(j!=i)
				p=p*ar[j];
			}
			
			//System.out.println("p="+p);
			ar1[i]=p;
			p=1;
					System.out.println(i +" $ "+ar1[i]);
				
			
			
		}	
		
	
	}

}
