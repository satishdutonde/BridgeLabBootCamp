public class _4InsertionSort 
{
	public static void main(String[] args) 
	{
		char[] arr = {'b', 'a', 'd', 'c', 'e'};
		
		System.out.print("Array Before Sort: ");
        for(char c:arr)
        {
        	System.out.print(c+" ");
        }
        
        insertionSort(arr);
        
        System.out.println();
        System.out.print("Array After Sort : ");
        for(char c:arr)
        {
        	System.out.print(c+" ");
        }
	} 
	
    public static void insertionSort(char[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) // get second char compare with first char
        {
            char c = arr[i];
            int j = i - 1;

           
            while (j >= 0 && arr[j] > c) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = c;
        }
    }

}
