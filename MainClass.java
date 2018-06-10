
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]={10,15,3,7};
		
		int k=17;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
				
			{
				if(ar[i]+ar[j]==k)
				{
					System.out.println(ar[i]+" $ "+ar[j]);
				}
			}
			
		}
	
	}

}
