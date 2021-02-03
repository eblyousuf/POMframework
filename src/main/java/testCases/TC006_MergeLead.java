package testCases;

import org.testng.annotations.BeforeTest;

import wrapper.ProjectSpecificWrapper;

public class TC006_MergeLead extends ProjectSpecificWrapper {
	

	@BeforeTest
	public void setData() {
	 excelfile = "TC006_MergeLead";
		
	}
}
