package sorting;

public class mergeSortProgram {

	public static void main(String[] args) {
		int a[] = {8,9,14,3,7,6,2};
		// TODO Auto-generated method stub
		System.out.println("Given Array"); 
        printArray(a); 
  
        mergeSortProgram ob = new mergeSortProgram(); 
        ob.mergesort(a, 0, a.length - 1); 
  
        System.out.println("\nSorted array"); 
        printArray(a); 

	}
	
	public void mergesort(int a[],int l, int r)
	{
		if(l<r) {
			int m = (l + r)/2;
			mergesort(a,l,m);
			mergesort(a,m+1,r);
			merge(a,l,m,r);
		}
	}
	
	public void merge(int a[],int l,int m, int r)
	{
		int n1 =0 , n2=0 ;
		n1 = m-l+1;
		n2= r-m;
		int l1[] = new int[n1];
		int l2[] = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			l1[i] = a[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			l2[j] = a[m+1+j];
		}
		int i=0 , j =0 , k=l;
		while(i<n1 && j <n2) {
			if(l1[i]< l2[j])
			{
				a[k] = l1[i];
				i++;
			}
			else
			{
				a[k] = l2[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k] = l1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k] = l2[j];
			j++;
			k++;
		}
	}
	
	static  void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	  

}
