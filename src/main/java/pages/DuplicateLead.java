package pages;

import wrapper.ProjectSpecificWrapper;

public class DuplicateLead extends ProjectSpecificWrapper{

	
	public DuplicateLead verifytheTitleAsDupLead(String titleOfDupLead) {
		verifytheTitleAsDupLead(titleOfDupLead);
		return this;
	}
	public ViewLeadPage clickCreateLead() {
		clickByXpath("//input[value=Create Lead]");
		return new ViewLeadPage();
	}
}
