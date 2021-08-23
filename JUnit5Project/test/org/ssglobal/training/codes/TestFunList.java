package org.ssglobal.training.codes;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.FunList;

public class TestFunList {
    // wala ng extends Test Case, annotations lang
	// @Test [nilalagay kada methods]
	
	// always void ang TEST METHODS
	
	
	//private static FunList funList; // kapag naka All
	//BeforeAll & AfterAll : gawing static ang setup and teardown as well as the class instance variable
	//@BeforeAll
	
	private FunList funList;
	
	@BeforeEach
	public void setup() {
		// pwede mag system out, bawal software logging
		System.out.println("initialization");
		funList = new FunList("test/config/myfile.txt");
		// ALL OBJECT CONCERNS SHOULD BE INSTANTIATED HERE
	}
	
	// Sunny Day Testing : positive
	@Disabled
	@Test
	public void testCountEqualsValue() {
		// bawal mag if and loop, program flow/construct 
		// one assert into one method only!
		long count = funList.countWords();
		Assertions.assertEquals(6, count);
	}
	@Disabled
	@Test
	public void testCountNonNegativeFile1() {
		
		long count = funList.countWords();
		Assertions.assertTrue(count >= 0); // conditional statement ang nasa loob except == MAG ASSERTEQUALS NALANG PAG GANITO
	}

	@Test
	public void testCountNonNegativeFile2() {
		FunList funList = new FunList("test/config/myfile2.txt");
		long count = funList.countWords();
		Assertions.assertEquals(0,count);
		funList = null;
	}
	@Disabled
	@Test
	public void testContentListNotNull() {
		List<String> temp = funList.getContentList();
		Assertions.assertNotNull(temp);
	}
	@Disabled
	@Test
	public void testSameContentArrays() {
		
		Assertions.assertDoesNotThrow(() -> {
			String[] content = {"The fox jumps over the window."};
			String[] actual = funList.getContentArray();
			Assertions.assertSame(content, actual); // tinitingnan kung same yung memory address, swak ang assertSame sa Enum or objects na static or any objects sharing the address
		});
		
	}
	
	// Enum, constants object, or pointers pointing to one object
	@Disabled
	@Test
	public void testSameContentArraysRainy() {
		
		Assertions.assertThrows(ClassCastException.class, () -> {
			String[] content = {"The fox jumps over the window."};
			String[] actual = funList.getContentArray();
			Assertions.assertSame(content, actual); // tinitingnan kung same yung memory address, swak ang assertSame sa Enum or objects na static or any objects sharing the address
		});
		
	}
	
	
	@Disabled
	@Test
	public void testSameContentArraysValues() {
		String[] content = {"The fox jumps over the window."};
		String[] actual = funList.getContentArray();
		Assertions.assertArrayEquals(content, actual); // tinitingnan kung same yung memory address, swak ang assertSame sa Enum or objects na static or any objects sharing the address
	}
	
	// Rainy Day Testing
	@Disabled
	@Test
	public void testCountNegativeFile1Rainy() {
		long count = funList.countWords();
		Assertions.assertFalse(count <=0);
	}
	@Disabled
	@Test
	public void testCountNegativeFile2Rainy() {
		FunList funList = new FunList("test/config/myfile2.txt");
		long count = funList.countWords();
		Assertions.assertNotEquals(10,count);
		funList = null;
	}
	@Disabled
	@Test
	public void testContentListNotNullRainy() {
		List<String> temp = funList.getContentList();
		Assertions.assertNull(temp);
	}
	

	
	@Test
	public void testDisplayInSeconds() {
		Assertions.assertTimeout(Duration.ofSeconds(2), () ->{
			funList.showLines();
		});
		
	}
	
	@Test
	public void testDisplayInMillieconds() {
		Assertions.assertTimeout(Duration.ofMillis(6), () ->{
			funList.showLines();
		});
		
	}
	
	@RepeatedTest(value = 5)
	public void testSameContentArraysValuesRepeat() {
		String[] content = {"The fox jumps over the window."};
		String[] actual = funList.getContentArray();
		Assertions.assertArrayEquals(content, actual); // tinitingnan kung same yung memory address, swak ang assertSame sa Enum or objects na static or any objects sharing the address
	}
	
	//@AfterAll
	@AfterEach
	public void tearDwon() {
		System.out.println("destroyer");
		funList=null;
	}
}
