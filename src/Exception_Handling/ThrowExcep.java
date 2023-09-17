package Exception_Handling;

public class ThrowExcep {
	
	
	
	
	
	
	
	
	 static void fun()
	    {
	        try {
	            throw new NullPointerException("demo");
	        }
	        catch (NullPointerException e) {
	            System.out.println("Caught inside fun().");
	            throw e; // rethrowing the exception
	        }
	    }
	 
	    public static void main(String args[])
	    {
//	        try {
//	            fun();
//	        }
//	        catch (NullPointerException e) {
//	            System.out.println("Caught in main.");
//	        }
	       
	        
	        try {
	        	 int data =20/0;
	    		throw new ArithmeticException();
	    	}
	    	catch(ArithmeticException ae)
	    	{
	    		System.out.println();
	    	}
	    }
	    
	    
	    

}
