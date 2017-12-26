// Java Implementation of an InsertionSort

public class insertionSort{

	public static void main(String[] args){
		insertionSort is = new insertionSort();
		int[] testArray = {6,2,4,7,1,8};

		int[] result = is.insertionSort(testArray);
		for(int i : result){
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// in place implementation of insertionSort.
	public int[] insertionSort(int[] A){

		for(int j = 1; j < A.length; j++){
			int key = A[j]; // key to insert into sorted part of array
			int i = j-1; // end index of sorted part of array.
			while(i >= 0 && A[i] > key){
				// iterate from end of sorted array and stop when reaching A[i] > key
				A[i+1] = A[i]; // move numbers up the array
				i--;
			}
			A[i+1] = key;
				// if the A[i] < key, then A[i+1] > key
				// since A[i+1] was moved up to A[i+2], A[i+1] is there free to become the key
				// thus the array is sorted.

				// if i !>= 0, then no smaller number has been found so far and thus A[0] = key
		}
		return A; // return sorted array
	}
}
















