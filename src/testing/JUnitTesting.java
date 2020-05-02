package testing;
import java.lang.Math; 

public class JUnitTesting {
	
	public int countD(String wordD){
		int count = 0;
		for(int i = 0; i < wordD.length(); i++){
			if(wordD.charAt(i)=='d' || wordD.charAt(i)=='D'){
				count++;
			}	
		}
		return count;
	}
	public double squareRoot(double x){
	return Math.sqrt(x); 
	}
}
