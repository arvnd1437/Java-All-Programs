package ArrayProgram;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//System.out.println(args.length);
		ArrayDemo ad = new ArrayDemo();
		//ad.learnig_1();
		//ad.learnig_2();
		//ad.learnig_3();
		//ad.learning_4();
		//ad.learning_5();
		//ad.learning_6();
		//ad.learning_7();
	//	ad.learning_8();
		//ad.learning_9();
		//ad.learning_10();
		//ad.learning_11();
		//ad.learning_12();
		//ad.learning_13();
		//ad.learning_14();
		//ad.learing_15();
		//ad.learing_16();
		//ad.learing_17();
		//ad.learing_18();//sub array check
		//ad.learing_19();
		ad.learing_20();
		//ad.learing_21();
		//ad.learing_22();
		//ad.learing_23();
		
		
	}


	private void learing_23() {
	}


	private void learing_22() {
		
		int[]ar= {10,20,30,40,50};//take top most in temp
		int count=2;
		while(count>0) {
		int temp=ar[0];
		int i;
		for(i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		ar[i]=temp;
		count--;
		
		}
		for(int j=0;j<ar.length;j++) {
			System.out.print(ar[j]+" ");
		}
	}


	private void learing_21() {
		int[]ar= {10,20,30,40,50};
		int temp=ar[0];
		int i;
		for(i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		ar[i]=temp;
		for(int j=0;j<ar.length;j++) {
			System.out.print(ar[j]+" ");
		}
		
	}

	
	
	private void learing_20() {
		int []ar= {10,20,30,40,50};
		int temp1=ar[0];
		int temp2=ar[1];
		int i;
		for(i=0;i<=2;i++) {
			ar[i]=ar[i+2];
		}
		ar[i]=temp1;
		i++;
		ar[i]=temp2;
		for(int j=0;j<ar.length;j++) {
		System.out.println(ar[j]);
		}
		
	}

	private void learing_19() {
		int no[]= {18,10,3,19,7,22,14,23};
		int key =15;
		for(int i=0,j=0;i<no.length;i++)
		{
			if(no[i]<=15) {
				int temp=no[i];
				no[i]=no[j];
				no[j]=temp;
				j++;
			}
		}
			for(int i=0;i<no.length;i++) {
				{
					System.out.print(no[i]+" ");
				}
			}
		
	}

	private void learing_18() {
		int [] a = {20,33,10};
		int[] b = {10,30};
		int count = 0; 
		//int j;
		for(int j=0; j<b.length; j++) {
			boolean present = false;
			for(int i=0; i<a.length; i++)
			{
				if(b[j]==a[i]) {
					count++;
					present = true;
				}
				}
			if(present == false) {
				System.out.println("Not sub Array");
				break;
			}
		}
		if(count == b.length){
		//if(j == b.length) {
			System.out.println("Sub Array");	
		}
		
	}

	private void learing_17() {
			  int[] mark= {94,75,45,96,100};
			  int highest=Integer.MIN_VALUE;
			  int secondhighest=Integer.MIN_VALUE;
			  int lowest=Integer.MAX_VALUE;
			  int secondlowest=Integer.MAX_VALUE;
			  for(int i=0;i<mark.length;i++) {
			   if(mark[i]>highest){
			    secondhighest=highest;
			    highest=mark[i];
			   }
			   else if (mark[i]<secondhighest){
			    secondhighest=mark[i];
			   } 
			   else if(mark[i]<lowest){
			    secondlowest=lowest;
			    lowest=mark[i];
			   }
			   else if(mark[i]<secondlowest) {
			    secondlowest=mark[i];
			   }
			  }
			  System.out.println("highest mark is:"+highest);
			  System.out.println("secondhighest mark is:"+secondhighest);
			  System.out.println("lowest mark is:"+lowest);
			  System.out.println("secondlowest mark is:"+secondlowest);
			 

		
	}

	private void learing_16() {
		int a[]= {94,75,70,96,100};
		int high1= Integer.MIN_VALUE;
		int high2= Integer.MIN_VALUE;
		int low1= Integer.MAX_VALUE;
		int low2= Integer.MAX_VALUE;
			
			for(int i=0; i<a.length; i++)
			{
				
			}
			
		
	}

	private void learing_15() {
		
				String s="kishore nithya";
				char[] name=s.toCharArray();
				
				for(int j=0;j<name.length;j++) {
				char ch = name[j];
				int count=1;
				
				if(ch=='-')
					continue;
				for(int i=j+1;i<name.length;i++){
					if(ch==name[i])
					{
						name[i]='-';
						count++;
					}	
				}	
				//if(/count==2)
					
				System.out.println("count of"+" "+ch+" is"+" "+count);
						}
	}

	private void learning_14() {
		//char name[]= {'n','a','t','a','r','a','n'};
		//char name[]= {'a','n','a','n','d','h'};
//char name[]= {'a','r','a','v','i','n','d','h'};
		String s="aravindh";
		char[] name=s.toCharArray();
		int big=0;
		char c=' ';
		for(int j=0;j<name.length;j++) {
		char ch = name[j];
		int count=1;
		
		if(ch=='-')
			continue;
		for(int i=j+1;i<name.length;i++){
			if(ch==name[i])
			{
				name[i]='-';
				count++;
			}
		}	
		if(count>big) {
			big=count;
			c=ch;
		}	
		}
		System.out.println("Most frequent letter is "+c);
		System.out.println("It appears for "+ big +" times");

		
		
	}

	private void learning_13() {
		//char name[]= {'n','a','t','a','r','a','n'};
				//char name[]= {'a','n','a','n','d','h'};
		char name[]= {'a','r','a','v','i','n','d','h'};
				
				for(int j=0;j<name.length;j++) {
				boolean repeated = false;
				char ch = name[j];
				//if(ch=='-')
				//	continue;
				for(int i=j+1;i<name.length;i++){
					if(ch==name[i])
					{
						//name[i]='-';
						repeated = true;
					}
					
				}
				if(repeated ==false)
				{
					System.out.println("First non repeated char-"+ch);
					break;
				}
				}
		
	}

	private void learning_12() {
		char name[]= {'n','a','t','a','r','a','n'};
		//char name[]= {'a','n','a','n','d','h'};
		
		for(int j=0;j<name.length;j++) {
		boolean repeated = false;
		
		char ch = name[j];
		
		for(int i=j+1;i<name.length;i++){
			if(ch==name[i])
			{
				repeated = true;
				break;
			}
			
		}
		if(repeated ==false)
		{
			System.out.println("Third non repeated char-"+ch);
			break;
		}
		}
		
	}

	private void learning_11() {
		char name[]= {'v','i','j','a','y'};
		
		boolean repeated = false;
		char ch = name[0];
		for(int i=1;i<name.length;i++){
			if(ch==name[i])
			{
				repeated = true;
				System.out.println("First repeated char-"+ch);
				break;
			}
		}
		if(repeated ==false)
		{
			System.out.println("First non repeated char-"+ch);
		}
		
	}

	private void learning_10() {
		int count=0;
		char[]name= {'p','r','a','k','v','t','s'};
		for(int j=0;j<name.length-1;j++) {
			char ch=name[j];
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					System.out.println("First Repeat:"+ch);
					count++;
					break;
				}
			}
			if(count==1)
				break;
		}
		if(count==0)
		System.out.println("No Repeated Letter");
		
	}

	private void learning_9() {
		char[]name= {'p','r','a','k','a','s','h'};
		for(int j=0;j<name.length-1;j++) {
			char ch=name[j];
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					System.out.println("First Repeat:"+ch);
					break;
				}
			}
		}
	}

	private void learning_8() //First char Repeated is
	{		
		char []name= {'A','R','A','V','I','N','D','H','A'};
		char ch = name[0];
		for(int i=1;i<name.length;i++) 
		{
			
			if(ch==name[i])
			{
				System.out.println("First char Repeated is: "+" "+ch);
				break;
			}
		}

		
	}

	private void learning_7() {
		int[]array= {5,-10,-20,30,-40,50};
		int count=0;
		for(int i=0;i<array.length;i++) {
			//if(array[i]<0) {
			//	count++;
			//System.out.println(array[i]);}
			//if(array[i]<0&&array[i]%20==0) {
				
				//System.out.println(array[i]);
				if(array[i]<0&&i%2==0) {
					System.out.println(array[i]);
				
			}
		
		}
		
		//System.out.println(count);
		}
	

	private void learning_6() {
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int[] scores = {45,93,190,56,68};
		int lowest=Integer.MAX_VALUE,scond_lowest=Integer.MIN_VALUE;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]<lowest) {
				scond_lowest=lowest;
				lowest=scores[i];
				
			}
			else if(scores[i]<scond_lowest){
			
				scond_lowest=scores[i];
			}
			
		}
		System.out.println("Lowest small:"+lowest);
		System.out.println("Second Lowest small:"+scond_lowest);
		
				
		
	}

	private void learning_5() {
		//              0  1   2  3  4
		int[] scores = {45,93,190,56,68};
		int high=scores[0],high2nd=scores[0];
		for(int i=1;i<scores.length;i++) {
			if(scores[i]>high) {
				high2nd=high;
				high=scores[i];
				
			}
			else if(scores[i]>high2nd){
			
				high2nd=scores[i];
			}
			
		}
		System.out.println("Highest:"+high);
		System.out.println("Second High:"+high2nd);
		
				
	}

	private void learning_4() {
		int[] marks = {96,96,100,98,99};
		int count =0;
		for(int i=0;i<marks.length;i++) {
			//if(marks[i]==100) {
			//	count++;
				//System.out.println(i);
			//}
			if(marks[i]>96) {
				count++;
				
			}
			
			
			
		}
		//System.out.println(count);
		System.out.println(count);
	}
		
	

	private void learnig_3() {
		int[] marks = {75,54,64,23,77};
		int low=100;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<low) {
				low = marks[i];
			}
		}
		System.out.println("Lowest mark:"+low);
		
	}

	private void learnig_2() {
		int[] marks = {75,54,64,23,77};
		int high=0,low=100;int total=0;
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
			if(marks[i]>high) {
				high = marks[i];
			}
			if(marks[i]<low) {
				low = marks[i];
			}
		}
		System.out.println("Total mark:"+total);
		System.out.println("Hightest mark:"+high);
		System.out.println("Lowest mark:"+low);
		
	}

	private void learnig_1() {
		
		int[] marks = new int[5];
		
		Scanner scan = new Scanner(System.in);
	int total = 0,high=0;
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter Mark:");
			marks[i] = scan.nextInt();
			//System.out.println(marks[i]);
			//total=total+marks[i];
			total+=marks[i];
			if(marks[i]>high) {
				high = marks[i];
			}
		}
		scan.close();
		System.out.println("Total:"+total);
		System.out.println("Percentage:"+total/marks.length);
		System.out.println("Higest Mark:"+high);
		
		/*marks[0] = 35;
		marks[1] = 56;
		marks[2] = 56;
		marks[3] = 44;
		marks[4] = 67;
		
		
		
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(i);
		}*/
	}

}
