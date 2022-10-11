package addressBook;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public aspect aspectDelete 
{

		pointcut logDelete() : 
	    	call (public * *.delete());
	    
	    after () returning(Object obje): logDelete()
	    {
	        try 
	        {
	        PrintWriter pwriter = new PrintWriter(new FileWriter("UpdateLog.txt", true));

	        pwriter.println("Record Deleted->" + obje);

	        pwriter.close();

	        }
	            catch (IOException e) 
	        	{
	                System.out.println(e.getMessage());
	            }

	    }

}
