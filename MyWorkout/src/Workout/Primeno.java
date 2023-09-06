package Workout;
public class Primeno
{
public static void main(String[]args)
{
    Primeno pm=new Primeno();
    //pm.find_pno(13);
    //pm.find_pno(14);
    int no=2;
    while(no<=20)
    {
    	pm.find_pno(no);
    	no=no+1;
    }
}
public int find_pno(int no)
{
int d=2;
int count=0;
while(d<no)
{
if (no%d==0)
count=count+1;

d=d+1;
}
if(count==0)
{
System.out.println("Prime no");
}
else
{
System.out.println("Not Prime no");
}
return count;
}

}