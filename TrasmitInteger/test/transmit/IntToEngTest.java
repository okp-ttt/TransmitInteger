package transmit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import transmit.IntToEng;

public class IntToEngTest {

	@Test
	public void translateEngメソッドをテスト() {
		IntToEng ite = new IntToEng();
		String expected1 = "zero";
		String expected2 = "ten";
		String expected3 = "one hundred twenty three";
		String expected4 = "one hundred twenty three thousand four hundred fifty six";
		String actual1 = ite.translateEng(0);
		String actual2 = ite.translateEng(10);
		String actual3 = ite.translateEng(123);
		String actual4 = ite.translateEng(123456);
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));
		assertThat(actual3,is(expected3));
		assertThat(actual4,is(expected4));
	}
	/*
	@Test
	public void translateEngメソッドをテスト＿１桁の数() {
		IntToEng ite = new IntToEng();
		String expected1 = "one";
		String actual1 = ite.translateEng(1);
		assertThat(actual1,is(expected1));
	}*/

}
