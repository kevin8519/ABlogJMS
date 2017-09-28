package associatebankerrorlogger.com;


public class CodeGenerator {
	
	
	

	public String onCall(String errrorVar) throws Exception {
		String result=null;
		
		
		
		
		
		 
		
		 if ((errrorVar.contains(ErrorConstants.QUERY_PARAMETER)) && (errrorVar.contains(ErrorConstants.UNIQUEID))&& (errrorVar.contains(ErrorConstants.INVALID_VALUE)) &&(errrorVar.contains(ErrorConstants.LONGER))|| (errrorVar.contains(ErrorConstants.SHORTER)) ){
			
			result= "  Invalid Account No  ";
		}
		
else if ((errrorVar.contains(ErrorConstants.QUERY_PARAMETER)) && (errrorVar.contains(ErrorConstants.UNIQUEID))){
			
			result= "  Please Check the query paramter  ";
		}
		
else {
	result= "  Resource Not Found  or  Service Not Avaialable ";
}
		
			return result;
}}
