package java1;

public class SlidingWindow {
	public static void main(String[] args) {
		int arr[] = {2,1,5,1,3,2};
		int k=3;
		
		int Maxwindowsum=0;
		
		for(int i=0;i<k;i++) {
			Maxwindowsum += arr[i];
		}
		int CurrentMax = Maxwindowsum; 
		
		for(int i=k;i<arr.length;i++) {
			Maxwindowsum = Maxwindowsum-arr[i-k];
			Maxwindowsum= Maxwindowsum + arr[i];
			
			if(Maxwindowsum>CurrentMax) {
				CurrentMax = Maxwindowsum;
			}
		}
		System.out.println("Max sum of the sub array is " + CurrentMax);
		
		
	}

}