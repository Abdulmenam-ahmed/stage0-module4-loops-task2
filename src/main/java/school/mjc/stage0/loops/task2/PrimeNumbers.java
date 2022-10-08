package school.mjc.stage0.loops.task2;

import java.util.Iterator;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
    	
    	int i =2;
    	int j=2;
    	int counter =0;
    	double s = i%j;
    	//System.out.println(i%j);
    	while (i<printToInclusive ) {
      	  if (i==2)
      		  System.out.println(2);
      	  else {
      		  while (j< i ) {
     		    if (i%j ==0) {
     		     	counter=0;
     		    	break;}
     			else  {
     				counter=1;
     				j++;
     				}
     		    }
      	  }
      	if(counter!=0) {System.out.println(i);}
     	  i++;
     	  j=2;
          
      	}
    }
}
