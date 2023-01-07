package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import Code.GradeEnum;
import Code.Numbers;

class TestGradeEnum41 {
	GradeEnum ge;
	@ParameterizedTest
	@ValueSource(strings = {"0,15,20,Fail","1,15,20,Fail","15,15,20,Pass","29,15,20,Good","30,15,20,Good"})
	@DisplayName("TS001 : TC01-TC05 : "
			+ "score_sectionA = 0,1,15,29,30 score_sectionB = 15,15,15,15,15 score_sectionC = 20,20,20,20,20 "
			+ "Expected Result = Fail,Fail,Pass,Good,Good")
	void TS001(String input) 
	{
		String[] text = input.split(",");
		String expect = text[3];
		int num1 = Integer.parseInt(text[0]);
		int num2 = Integer.parseInt(text[1]);
		int num3 = Integer.parseInt(text[2]);
		ge = new GradeEnum(num1, num2, num3);
		assertEquals(expect,ge.showResult(ge.classify()));
	}
	@ParameterizedTest
	@ValueSource(strings = {"15,0,20,Fail","15,1,20,Fail","15,29,20,Good","15,30,20,Good"})
	@DisplayName("TS002 : TC01-TC04 : "
			+ "score_sectionA = 15,15,15,15 score_sectionB = 0,1,29,30 score_sectionC = 20,20,20,20 "
			+ "Expected Result = Fail,Fail,Good,Good")
	void TS002(String input) 
	{
		String[] text = input.split(",");
		String expect = text[3];
		int num1 = Integer.parseInt(text[0]);
		int num2 = Integer.parseInt(text[1]);
		int num3 = Integer.parseInt(text[2]);
		ge = new GradeEnum(num1, num2, num3);
		assertEquals(expect,ge.showResult(ge.classify()));
	}
	@ParameterizedTest
	@ValueSource(strings = {"15,15,0,Fail","15,15,1,Fail","15,15,39,Good","15,15,40,Excellent"})
	@DisplayName("TS003 : TC01-TC04 : "
			+ "score_sectionA = 15,15,15,15 score_sectionB = 15,15,15,15 score_sectionC = 0,1,39,40 "
			+ "Expected Result = Fail,Fail,Good,Excellent")
	void TS003(String input) {
		String[] text = input.split(",");
		String expect = text[3];
		int num1 = Integer.parseInt(text[0]);
		int num2 = Integer.parseInt(text[1]);
		int num3 = Integer.parseInt(text[2]);
		ge = new GradeEnum(num1, num2, num3);
		assertEquals(expect,ge.showResult(ge.classify()));
	}
}