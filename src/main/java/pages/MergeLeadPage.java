package pages;

import wrapper.ProjectSpecificWrapper;

public class MergeLeadPage extends ProjectSpecificWrapper {
	
	public FindLeadsWindowPage clickIconNearFromLead() {
		clickByXpath("(//img[@src='/images/fieldlookup.gif'])[1]");
		return new FindLeadsWindowPage();
	}

}
