package palindrome;

public class Check {
	
	Check(){
	}
	
	public boolean isPal(String in) {
		
		boolean flag = true;

		for(int i=0; i<in.length()/2; i++) {
			if(in.charAt(i) != in.charAt(in.length()-1-i)) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}