package test.com.tija.aspectTemplate.Math;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerMath {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(MathJUnitTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());

		/**
		 * 
		 */
		Result resultSuite = JUnitCore.runClasses(MathJUnitTestSuite.class);

		for (Failure failure : resultSuite.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(resultSuite.wasSuccessful());
	}
}
