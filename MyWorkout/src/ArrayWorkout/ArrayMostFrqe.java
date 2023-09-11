package ArrayWorkout;

public class ArrayMostFrqe {

	public static void main(String[] args) {
		int a[]= {2,2,4,5,3,6,1,2,3,5,6,6,1,2};
		System.out.println("Most frqent Element is: "+ maxFreq(a, a.length));

	}

	private static int maxFreq(int a[],int n) {
		int maxCount=0;
		int maxFreqnt=0;
		int secMaxFreqnt=0;
		for(int i=0; i<a.length; i++) {
			int count =0;
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxFreqnt=a[i];
			}
			else {
				secMaxFreqnt=count;
				maxFreqnt=a[i];
			}
				
			
		}
		
		return maxFreqnt;
	}

}
