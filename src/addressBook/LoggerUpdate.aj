package addressBook;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public aspect LoggerUpdate 
{

	    pointcut callUpdate() : 
	    	call (public String *.update());
	    
	    after () returning(Object obj): callUpdate()
	    {
	        try 
	        {

	        PrintWriter pwrite = new PrintWriter(new FileWriter("UpdateLog.txt", true));

	        pwrite.println("Record Updated->" + obj);

	        pwrite.close();

	        }
	            catch (IOException e) 
	        	{
	                System.out.println(e.getMessage());
	            }

	    }
	   
	
}
