package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorClass;

class OperatorTest {

	OperatorClass test = new OperatorClass();
	@Test
	void operatorTestingInJava() {
		assertEquals(10,test.addition(8,2),"");
	}

}
