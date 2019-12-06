package replace;

public class replacePattern {
	
	/*public static void main(String args[]){
		
		replace("@odata.context","@odata.", "abc");
		
	}*/
	
	public static String replace(String inputString, String regx, String with){
		
		String result= inputString.replaceAll(regx, with);
		//System.out.println(result);
		return result;
		
		
	}

}