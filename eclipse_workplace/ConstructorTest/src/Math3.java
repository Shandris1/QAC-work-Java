
public class Math3 {
 public float add (float x, float y)
 {
	 return (x + y);
 }
 public float subtract (float x, float y)
 {
	 return ( x - y);
 }
 public float divide (float x, float y)
 {
	 
	 if  (y == 0)
	 {
		 int i,m=0,flag=0;   
		 int counter = 0;
		 int n = counter;
		 while (n<1000000)
		 {
			 m=n/2;  
			 flag = 0;
			 for(i=2;i<=m;i++){    
				   if(n%i==0){    
				   //System.out.println("Number is not prime");    
				   flag=1;    
				   break;    
				   }    
				  }    
				  if(flag==0)    
				  System.out.println("Number "+n+" is prime");  
		 n++;
		 }
	 }
	 return (x/y);
 }
 public float multiply (float x, float y)
 {
	 return ( x * y );
	 
 }
}
