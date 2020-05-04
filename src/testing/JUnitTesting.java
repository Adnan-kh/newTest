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
	
	public double divideHalf(double y){
		return y/2; 
	}
	
	public int multiply(int a, int b){
		int output = a * b; 
		return output; 
	}
}
