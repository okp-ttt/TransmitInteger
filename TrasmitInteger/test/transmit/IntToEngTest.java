package transmit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import transmit.IntToEng;

public class IntToEngTest {

	@Test
	public void translateEngメソッドをテスト() {
		IntToEng ite = new IntToEng();
		String expected1 = "twenty one";
		String actual1 = ite.translateEng(21);
		assertThat(actual1,is(expected1));
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
