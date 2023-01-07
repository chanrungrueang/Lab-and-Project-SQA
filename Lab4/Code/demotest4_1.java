package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import Code.GradeEnum;
import Code.GradeEnum.GradeType;

class demotest4_1 {
	GradeEnum grade;
	@ParameterizedTest
	@ValueSource(strings = {"0,50,50","50,0,50","50,50,0"})
	@DisplayName("Input: scoreA = 30,scoreB = 30, scoreFinal = 30 ; Expected value: Outstanding")
	void tc1(String input) {
		String[] text = input.split(",");
		int num1 = Integer.parseInt(text[0]);
		int num2 = Integer.parseInt(text[1]);
		int num3 = Integer.parseInt(text[2]);
		grade = new GradeEnum(num1,num2,num3); //score
	    assertEquals("Outstanding", grade.showResult(grade.classify()));
	}

	@ParameterizedTest
	@ValueSource(strings = {"20,20,20"})
	@DisplayName("Input: scoreA = 20,scoreB = 20, scoreFinal = 20 ; Expected value: C")
	void tc2(String input) {
		String[] text = input.split(",");
		int num1 = Integer.parseInt(text[0]);
		int num2 = Integer.parseInt(text[1]);
		int num3 = Integer.parseInt(text[2]);
		grade = new GradeEnum(num1,num2,num3); //score
		String result = grade.classify().toString(); //enum to string
		assertEquals("C",result); //check grade
	}
}
