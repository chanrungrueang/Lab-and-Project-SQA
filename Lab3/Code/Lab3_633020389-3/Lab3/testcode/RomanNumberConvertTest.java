package testcode;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.RomanNumbersConverter;

class RomanNumberConvertTest {
	
	RomanNumbersConverter rn = new RomanNumbersConverter();
	@Test
	@BeforeEach
	@DisplayName("TS001 : TC01 : Input = I Expected Result = 1")
	void TS001_TC01() {
		assertEquals(1,rn.asArabic("I"));
	}
	@Test
	@DisplayName("TS001 : TC02 : Input = M Expected Result = 1000")
	void TS001_TC02() {
		assertEquals(1000,rn.asArabic("M"));
	}
	@Test
	@DisplayName("TS002 : TC01 : Input = XI Expected Result = 11")
	void TS002_TC01() {
		assertEquals(11,rn.asArabic("XI"));
	}
	@Test
	@DisplayName("TS002 : TC02 : Input = XX Expected Result = 20")
	void TS002_TC02() {
		assertEquals(20,rn.asArabic("XX"));
	}
	@Test
	@DisplayName("TS002 : TC03 : Input = LXI Expected Result = 61")
	void TS002_TC03() {
		assertEquals(61,rn.asArabic("LXI"));
	}
	@Test
	@DisplayName("TS003 : TC01 : Input = IX Expected Result = 9")
	void TS003_TC01() {
		assertEquals(9,rn.asArabic("IX"));
	}
	@Test
	@DisplayName("TS003 : TC02 : Input = IV Expected Result = 4")
	void TS003_TC02() {
		assertEquals(4,rn.asArabic("IV"));
	}
	@Test
	@DisplayName("TS003 : TC03 : Input = CM Expected Result = 900")
	void TS003_TC03() {
		assertEquals(900,rn.asArabic("CM"));
	}
	@Test
	@DisplayName("TS004 : TC01 : Input = VIIII Expected Result = 9")
	void TS004_TC01() {
		assertNotEquals(9,rn.asArabic("VIIII"));
	}
	@Test
	@DisplayName("TS004 : TC02 : Input = XXXX Expected Result = 40")
	void TS004_TC02() {
		assertNotEquals(40,rn.asArabic("XXXX"));
	}
	@Test
	@DisplayName("TS004 : TC03 : Input = XXVV Expected Result = 30")
	void TS004_TC03() {
		assertNotEquals(30,rn.asArabic("XXVV"));
	}
	@Test
	@DisplayName("TS005 : TC01 : Input = DM Expected Result = 500")
	void TS005_TC01() {
		assertNotEquals(500,rn.asArabic("DM"));
	}
	@Test
	@DisplayName("TS005 : TC02 : Input = VX Expected Result = 5")
	void TS005_TC02() {
		assertNotEquals(5,rn.asArabic("VX"));
	}
	@Test
	@DisplayName("TS005 : TC03 : Input = IC Expected Result = 99")
	void TS005_TC03() {
		assertNotEquals(99,rn.asArabic("IC"));
	}
}
