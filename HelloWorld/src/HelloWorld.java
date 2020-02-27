import com.leetcode.easy.TwoSum;

import java.util.Arrays;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		TwoSum twoSumDriver = new TwoSum();
		int [] testcase_1 = new int [] {2, 7, 11, 15};
		int target = 9;
		int [] testcase_result;
		testcase_result = twoSumDriver.twoSum(testcase_1, target);
		System.out.println(Arrays.toString(testcase_result));
	}

}
