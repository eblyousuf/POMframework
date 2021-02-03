package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeadsPage extends ProjectSpecificWrapper{
	
	public  CreateLeadPage ClickCreateLeadLink() { //D
		clickByLinkText("Create Lead");
		return new CreateLeadPage();
	}
	public FindLeadsPage clickFindLeads() {
		clickByLinkText("Find Leads");
		return new FindLeadsPage();
	}
public MyLeadsPage clickMyLeadspage() {
	clickByXpath("//a[text()='My Leads']");
	return this;
}
public MergeLeadPage clickMergeLeadsPage() {
	clickByXpath("//a[text()='Merge Leads']");
	return new MergeLeadPage();
}
}
