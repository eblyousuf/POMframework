package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsPage extends ProjectSpecificWrapper{

	public FindLeadsPage clickFindLeads() {
		clickByXpath("//a[text()='Find Leads']");
		return new FindLeadsPage();
		}
		public FindLeadsPage clickOnPhone() {
		clickByXpath("//span[text()='Phone']");
		return this;
	}
  public FindLeadsPage enterPhoneNo(String pName) {
	  enterById("phoneNumber", pName);
	  return this;
	  }
  public FindLeadsPage clickOnEmail() {
	  clickByXpath("(//span[@class='x-tab-strip-text '])[3]");
	  return this;
  }
  public FindLeadsPage enterEmail(String email) {
	  enterByXpath("//input[@name='emailAddress']", email);
	  return this;
  }
    public FindLeadsPage clickFindLeadsBtn() {
	  clickByXpath("(//button[@class='x-btn-text'])[1]");
	  return this;
}
    public FindLeadsPage captureNameOf1stRslLead(String nameOfRslLead) {
    	clickByXpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']");
    	return this;
    }
    public ViewLeadPage clickFirstReslLead() {
    	clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]");
    	return new ViewLeadPage();
    }
  
  public FindLeadsPage captureLeadIdFstResLead() {
	  clickByXpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']");
  return this;
  }
  public ViewLeadPage clickFstResLead() {
	  clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
  return new ViewLeadPage();
  }
  public FindLeadsPage enterCaptureLeadID(String capID) {
	  enterByXpath("//input[@class=' x-form-text x-form-field ']", capID);
	  return this;
  }
  public FindLeadsPage enterfromLeadID(String leadId) {
	  enterByXpath("(//div[@class='x-form-element']/input)[1]", leadId);
	  return this;
  }

  public void verefyErrorMsg() {
	  
  }

//public FindLeadsPage enterFirstName(String fname) {
	
}





	/*public ViewLeadPage clickFstRstLeadPage() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");	
		return new ViewLeadPage();	
	}
	public void confirmChangeName() {
		
	}
	public void clickEditlink() {
	clickByXpath("//a[text()='Edit']");	
	return new OpenTapsCRMPage;
	}
	public void changeCompanyName(String changeCOName) {
		enterById("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]", changeCOName);
		return  
	}
	
	*/

