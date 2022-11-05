public class QuickSort {
	
	
 

	public QuickSort(int[] mainArr, int left, int length) {
		quickSort(mainArr,  left,  length);
	}



	public static void quickSort(int arr[], int left, int right) {
		   if( left < right ) {
		      int pivotIndex = (int) (left + (right-left)/2);
		      int pivotNewIndex = partition(arr, left, right, pivotIndex);
		      quickSort(arr, left, pivotNewIndex - 1);
		      quickSort(arr, pivotNewIndex + 1, right);
		   }
		}
		  
		public static int partition(int arr[], int left, int right, int pivotIndex) {
		   int pivotValue = arr[pivotIndex];
		   arr[pivotIndex] = arr[right];
		   arr[right] = pivotValue;
		   int storeIndex = left;
		   for(int i=left; i<right; i++) {
		     if( arr[i] < pivotValue ) {
		        int temp = arr[i];
		        arr[i] = arr[storeIndex];
		        arr[storeIndex] = temp;
		        storeIndex++;
		  
		       
		     }
		   }
		   int temp = arr[right];
		   arr[right] = arr[storeIndex];
		   arr[storeIndex] = temp;
		   return storeIndex;
		  
		}

}
