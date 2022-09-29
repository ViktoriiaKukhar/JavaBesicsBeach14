package review.class2;

public class NestedIf {

	public static void main(String[] args) {
		// Nested if conditions are conditions which are dependent on each other 
		//if outer conditions not true inner-conditions is never checked inner-conditions is only checked when
		//outer-conditions is passed
		
		//Simple nested conditions
	
	        boolean studyHard = true;

	        if (studyHard)
	        {
	            System.out.println(" we ge the job in first few weeks");
	            boolean goodCommunicationSkills = true;
	            
	            if (goodCommunicationSkills)
	            {
	                System.out.println(" might get a job in Apple Amazon, etc. ");
	            } 
	            else
	            {
	                System.out.println(" we need to work on our communication skills");
	            }

	        } 
	        else 
	        {

	            System.out.println("it might take a little longer to get the job");
	        }

	    

	}

}
