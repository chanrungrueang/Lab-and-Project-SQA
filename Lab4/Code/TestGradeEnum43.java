package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestGradeEnum43 {

	@DisplayName("TS001, Expected result = Fail")
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/TS001_WorstCaseBoundaryValueTesting.csv", numLinesToSkip = 1)
	void TS001(int sectionA, int sectionB, int scoreFinal, String expect) {
		ge = new GradeEnumEdit(sectionA, sectionB, scoreFinal);
		String result = ge.showResult(ge.classify());
		assertEquals(expect, result);
	}
}
