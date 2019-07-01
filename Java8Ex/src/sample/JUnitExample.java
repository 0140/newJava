package sample;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * http://www.guru99.com/junit-annotations-api.html
 * http://www.guru99.com/junit-test-framework.html
 * 
 * JUnit Once-only setup, Once-only tear down @BeforeClass, @AfterClass
 * 
 * 
 * @RunWith(Suite.class) @Suite.SuiteClasses({ SuiteTest1.class,
 * SuiteTest2.class, })
 * 
 * @author Bhaskara Sama
 *
 */
public class JUnitExample {

	private File output;
	@Before
	public void createOutputFile() {
		output = new File("sample.txt");
	}

	@After
	public void deleteOutputFile() {
		output.delete();
	}

	@Test
	public void testFile1() {
		// We can write JUnit Assertions
		assertEquals("Expected", "Actual");

	}
	@Test
	public void testFile2() {
		assertEquals("Expected", "Expected");
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnitExample.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful()); 
	}

}
