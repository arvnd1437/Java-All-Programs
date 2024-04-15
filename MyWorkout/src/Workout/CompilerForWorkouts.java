package Workout;

public class CompilerForWorkouts {

	public static void main(String[] args){
		
		int no[]= {18,10,3,19,7,22,14,23};
		for(int j=0;j<no.length;j++) {
			System.out.print(no[j]+"j ");
			for(int i=0;i<no.length;i++) {
				System.out.print(no[i]+"i ");
				if(no[i]>=15) {
					int tem=no[i];
					System.out.print(tem+" ");
					no[i]=no[j];
					System.out.print(no[i]+" ");
					no[j]=tem;
					System.out.print(no[j]+" ");
				}
				}
			}
		for(int i=0;i<no.length;i++) {
			System.out.print(no[i]+" ");
		}
		
		
	}

}