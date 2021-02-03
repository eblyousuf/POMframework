package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper {
	
		
	public  ViewLeadPage verifyFirstName(String firstName) {
	verifyTextById("//input[@name='submitButton']", "firstName");
	return this;
}
public ViewLeadPage verifyTitleOfPage(String title) {
	verifyTitleOfPage(title);
	return this;
	
}
public OpenTapsCRMPage clickEditLink() {
	clickByLinkText("Edit");
	return new OpenTapsCRMPage();
}
public ViewLeadPage confirmeChangeName(String firstName) {
 verifyFirstName("");
	return this;
}

public MyLeadsPage clickDelete() {
	clickByXpath("//a[text()='Delete']");
	return new MyLeadsPage();
}
 
 public ViewLeadPage clickCreateLead() {
	 clickByXpath("//input[@name='submitButton']"); 
	 return new ViewLeadPage();
 }
 public void confirmedtheDupLeadAsCap() {
	 
 }
 public FindLeadsPage clickFindLeads() {
clickByXpath("//a[text()='Find Leads']");
return new FindLeadsPage();
	 
 }	 
 public MyLeadsPage clickDeleteBtn() {
		clickByXpath("//a[@class='subMenuButtonDangerous']");
		return new MyLeadsPage();
	}	 
	 
	 

}
