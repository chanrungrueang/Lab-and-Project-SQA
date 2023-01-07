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
	@ValueSource(strings = {"0,50,50,Fail","50,0,50,Fail","50,50,0,Fail"})
	@DisplayName("TS001 : TC01-TC03 : "
			+ "score_sectionA = 0,50,50 score_sectionB = 50,0,50 score_sectionC = 50,50,0 "
			+ "Expected Result = Fail,Fail,Fail")
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
	@ValueSource(strings = {"1,50,50,Fail","50,1,50,Fail","50,50,1,Fail"})
	@DisplayName("TS002 : TC01-TC03 : "
			+ "score_sectionA = 1,50,50 score_sectionB = 50,1,50 score_sectionC = 50,50,1 "
			+ "Expected Result = Fail,Fail,Fail")
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
	@ValueSource(strings = {"50,50,50,Fail"})
	@DisplayName("TS003 : TC01 : "
			+ "score_sectionA = 0,50,50 "
			+ "Expected Result = Fail")
	void TS003(String input) {
		String[] text = input.split(",");
		String expect = text[3];
		int num1 = Integer.parseInt(text[0]);
		int num2 = Integer.parseInt(text[1]);
		int num3 = Integer.parseInt(text[2]);
		ge = new GradeEnum(num1, num2, num3);
		assertEquals(expect,ge.showResult(ge.classify()));
	}
	@ParameterizedTest
	@ValueSource(strings = {"99,50,50,Fail","50,99,50,Fail","50,50,99,Fail"})
	@DisplayName("TS004 : TC01-TC03 : "
			+ "score_sectionA = 99,50,50 score_sectionB = 50,99,50 score_sectionC = 50,50,99 "
			+ "Expected Result = Fail,Fail,Fail")
	void TS004(String input) 
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
	@ValueSource(strings = {"100,50,50,Fail","50,100,50,Fail","50,50,100,Fail"})
	@DisplayName("TS005 : TC01-TC03 : "
			+ "score_sectionA = 100,50,50 score_sectionB = 50,100,50 score_sectionC = 50,50,100 "
			+ "Expected Result = Fail,Fail,Fail")
	void TS005(String input) 
	{
		String[] text = input.split(",");
		String expect = text[3];
		int num1 = Integer.parseInt(text[0]);
		int num2 = Integer.parseInt(text[1]);
		int num3 = Integer.parseInt(text[2]);
		ge = new GradeEnum(num1, num2, num3);
		assertEquals(expect,ge.showResult(ge.classify()));
	}
}