package phptravelsTNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class fieldanalyzer implements IRetryAnalyzer {
	
	int failcount = 0;
	int retry = 3;

	@Override
	public boolean retry(ITestResult arg0) {
		if(failcount <retry) {
			failcount++;
			return true;
		}
		return false;
	}
	

}
