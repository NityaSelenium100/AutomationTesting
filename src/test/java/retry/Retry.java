package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	int counter=0;
	int maxRetry=3;

	@Override
	public boolean retry(ITestResult result) {
		if(maxRetry>counter) {
			
			counter++;
			return true;
			
		}
		return false;
	}
	
	

}
