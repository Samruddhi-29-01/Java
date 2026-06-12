package java1;

public class SlidingWindowHiggestNum {
	
	    public static void main(String[] args) {

	        int arr[] = {2, 1, 5, 1, 3, 2};
	        int k = 2;
	        int windowSum = 0;

	        
	        for (int i = 0; i < k; i++) {
	            windowSum += arr[i];
	        }
	        double maxAvg = (double) windowSum / k;

	        for (int i = k; i < arr.length; i++) {
	            windowSum = windowSum - arr[i - k] + arr[i];

	            double currentAvg = (double) windowSum / k;

	            if (currentAvg > maxAvg) {
	                maxAvg = currentAvg;
	            }
	        }

	        System.out.println("Highest Average = " + maxAvg);
	    }
	}


