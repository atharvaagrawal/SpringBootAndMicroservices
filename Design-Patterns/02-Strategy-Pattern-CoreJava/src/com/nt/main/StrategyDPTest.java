package com.nt.main;

import com.nt.comps.Amazon;
import com.nt.factory.AmazonFactory;

public class StrategyDPTest {

	public static void main(String args[]) {
		
		// get amazon class obj
		Amazon amz = AmazonFactory.getInstance("dtdc");
		
		// invoke the b.method
		String resultMsg = amz.shopping(new String[] {"Dress", "Bike", "Chain"},  
				new double[] {5000.0, 120000.0, 40000.0});
		
		System.out.println(resultMsg);
	}
}
