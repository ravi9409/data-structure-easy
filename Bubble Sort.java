public class algorithm {
 
	public static void main(String[] args) {
		int a1[]=new int[] {20,35,-15,7,55,1,-22};
		Sort sort=new Sort();
		int [] sorted=sort.bubblesort(a1);
		for (int i : sorted) {
			System.out.println(i);
		}
		
}	
}
	
	
	class Sort
	{
		public  int[] bubblesort(int[] a1) {
			for(int i=0;i<a1.length;i++)
			{
				for(int j=0;j<a1.length;j++)
				{
				if(a1[i]<a1[j])
				{
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
					
				}
			}
			
		}
			return a1;
		}
	}
