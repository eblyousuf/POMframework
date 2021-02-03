package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsWindowPage extends ProjectSpecificWrapper {
	
public void moveToNewWindow() {
	

}
public FindLeadsWindowPage enterLeadid(String enterLeadId) {
	enterByXpath("(//div[@class='x-form-element']/input)[1]", enterLeadId);
	return this;
}
public FindLeadsWindowPage enterFindLeadsBtn(String findLeadsBtn) {
	enterByXpath("//button[text()='Find Leads']", findLeadsBtn);
	return this;
}
public FindLeadsWindowPage clickFirstResultingLead1() {
	clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	return this;
}

public FindLeadsWindowPage clickIconNearToLead() {
	clickByXpath("(//img[@src='/images/fieldlookup.gif'])[1]" );
return this;
}

}
