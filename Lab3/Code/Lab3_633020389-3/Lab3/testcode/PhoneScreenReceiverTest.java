package testcode;

import static org.junit.jupiter.api.Assertions.*;




import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class PhoneScreenReceiverTest {
	PhoneScreenReceiverEdit psr = new PhoneScreenReceiverEdit();
	@BeforeEach
	void beforeEach(TestInfo testInfo) {
			System.out.println(testInfo.getDisplayName());
	        String methodName = testInfo.getTestMethod().get().getName();
	        System.out.println(methodName);
	}
	@RepeatedTest(value = 6)
	@DisplayName("TS001 : noAttempt = 1-6 and isCorrectPwd = true, Expected result = true")
	void TS001(TestInfo testInfo, RepetitionInfo repetitionInfo) {
	 	int currentRepetition = repetitionInfo.getCurrentRepetition();
	 	boolean bl = true;
	 	psr.onReceive(currentRepetition, bl);
	 	boolean screen = psr.isScreenOn;
		//System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
		System.out.println("noAttempt = "+currentRepetition+" and isCorrectPwd = "+bl+", Expected result = true, "+"Actual result = "+screen);
		assertEquals(true,screen);
	}
	@RepeatedTest(value = 6)
	@DisplayName("TS002 : noAttempt = 1-6 and isCorrectPwd = false, Expected result = false")
	void TS002(TestInfo testInfo, RepetitionInfo repetitionInfo) {
	 	int currentRepetition = repetitionInfo.getCurrentRepetition();
	 	boolean bl = false;
	 	psr.onReceive(currentRepetition, bl);
	 	boolean screen = psr.isScreenOn;
		//System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
		System.out.println("noAttempt = "+currentRepetition+" and isCorrectPwd = "+bl+", Expected result = false, "+"Actual result = "+screen);
		assertEquals(false,screen);
	}
	@RepeatedTest(value = 6)
	@DisplayName("TS003 : noAttempt = 1-5 and isCorrectPwd = false AND noAttempt = 6 and isCorrectPwd = true , Expected result = false")
	void TS003(TestInfo testInfo, RepetitionInfo repetitionInfo)
	{
		boolean bl;
		int currentRepetition = repetitionInfo.getCurrentRepetition();
	 	if(currentRepetition <=5)
	 	{
	 		bl = false;
	 	}
	 	else
	 	{
	 		bl = true;
	 	}
	 	psr.onReceive(currentRepetition, bl);
	 	boolean screen = psr.isScreenOn;
		//System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
		System.out.println("noAttempt = "+currentRepetition+" and isCorrectPwd = "+bl+", Expected result = false, "+"Actual result = "+screen);
		assertNotEquals(true,screen);
	}
	@AfterEach
	void afterEach() {
    	System.out.println("=====Test by 633020389-3=====");
	}
}
