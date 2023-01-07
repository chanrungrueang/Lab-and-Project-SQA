package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import Code.GradeEnum;

class TestGradeEnum42 {
	GradeEnum ge;
	@ParameterizedTest
	@CsvSource({
		"-1,15,20,Fail"
		,"0,15,20,Fail"
		,"1,15,20,Fail"
		,"15,15,20,Pass"
		,"29,15,20,Good"
		,"30,15,20,Good"
		,"31,15,20,Good"})
	@DisplayName("TS001 : TC01-TC07 : "
			+ "score_sectionA = -1,0,1,15,29,30,31 score_sectionB = 15,15,15,15,15,15,15 score_sectionC = 20,20,20,20,20,20,20 "
			+ "Expected Result = Fail,Fail,Fail,Pass,Good,Good,Good")
	void TS001(int num1, int num2, int num3, String expect) 
	{
		ge = new GradeEnum(num1, num2, num3);
		assertEquals(expect,ge.showResult(ge.classify()));
	}
	@ParameterizedTest
	@CsvSource({
		"15,-1,20,Fail"
		,"15,0,20,Fail"
		,"15,1,20,Fail"
		,"15,29,20,Good"
		,"15,30,20,Good"
		,"15,31,20,Good"})
	@DisplayName("TS002 : TC01-TC06 : "
			+ "score_sectionA = 15,15,15,15,15,15 score_sectionB = -1,0,1,29,30,31 score_sectionC = 20,20,20,20,20,20 "
			+ "Expected Result = Fail,Fail,Fail,Good,Good,Good")
	void TS002(int num1, int num2, int num3, String expect) 
	{
		ge = new GradeEnum(num1, num2, num3);
		assertEquals(expect,ge.showResult(ge.classify()));
	}
	@ParameterizedTest
	@CsvSource({
		"15,15,-1,Fail"
		,"15,15,0,Fail"
		,"15,15,1,Fail"
		,"15,15,29,Pass"
		,"15,15,30,Good"
		,"15,15,31,Good"})
	@DisplayName("TS003 : TC01-TC06 : "
			+ "score_sectionA = 15,15,15,15,15,15 score_sectionB = 15,15,15,15,15,15 score_sectionC = -1,0,1,29,30,31 "
			+ "Expected Result = Fail,Fail,Fail,Pass,Good,Good")
	void TS003(int num1, int num2, int num3, String expect) 
	{
		ge = new GradeEnum(num1, num2, num3);
		assertEquals(expect,ge.showResult(ge.classify()));
	}
}
