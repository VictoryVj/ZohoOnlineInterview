import java.io.*;									//Java IO package imported
public class PatternPrinting 
{
	public static void main(String[] args) 
	{
	    int loop1,loop2,len=5;
	    for(loop1=5;loop1>0;loop1--)				//Outer loop execution
	    {
	        for(loop2=5;loop2>0;loop2--)			//Inner loop execution
	        {
	            if(loop2>loop1)						//Condition Check 
	            {
	                System.out.print(loop2);
	            }
	            else
	            {
	                System.out.print(loop1);
	            }
	        }
	        System.out.println();					//Creating a new line
	    }
	}	
}

