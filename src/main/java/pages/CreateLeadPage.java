package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLeadPage extends ProjectSpecificWrapper {

	public CreateLeadPage enterCompanyName(String cName) {
		enterById("createLeadForm_companyName", cName);
		return this;
	
}
public CreateLeadPage enterFirstName(String fName) {
	enterById("createLeadForm_firstName", fName);
	return this;
}

public CreateLeadPage enterLastName(String lName) {
	enterById("createLeadForm_lastName", lName);
	return this;
	
}
public CreateLeadPage enterFstNameLocal(String FnameLocal) {
	enterById("createLeadForm_firstNameLocal", FnameLocal);
	return this;
}

public CreateLeadPage enterLstNameLocal(String LnameLocal) {
	enterById("createLeadForm_lastNameLocal", LnameLocal);
	return this;
}
public CreateLeadPage enterSalutation(String Salut) {
	enterById("createLeadForm_personalTitle", Salut);
	return this;
}
 public CreateLeadPage chooseSource(String source) {
	 selectVisibileTextById("createLeadForm_dataSourceId", source);
	 return this; 
 }
 public CreateLeadPage enterTitle(String title) {
	 enterById("createLeadForm_generalProfTitle", title);
	 return this;
 }
 public CreateLeadPage enterARevenue(String aRevenue) {
	 enterById("createLeadForm_annualRevenue", aRevenue);
	 return this;
 }
 public CreateLeadPage choosetIndustry(String ind) {
	 selectVisibileTextById("createLeadForm_industryEnumId", ind);
	 return this; 	 
 }
 public CreateLeadPage chooseOwnership(String ownership) {
	 selectVisibileTextById("createLeadForm_ownershipEnumId", ownership);
	 return this;
 }
 public CreateLeadPage sicCode(String Scode) {
	 enterById("createLeadForm_sicCode", Scode);
	 return this; 
 }
 public CreateLeadPage enterDescription(String Desc) {
	 enterById("createLeadForm_description", Desc);
	 return this;
 }
 public CreateLeadPage enterImpoNote(String ImproNote) {
	 enterById("createLeadForm_importantNote", ImproNote);
	 return this;
 }
 public CreateLeadPage enterCountryCode(String cCode) {
	 enterById("createLeadForm_primaryPhoneCountryCode", cCode);
	 return this;
 }
 public CreateLeadPage enterAreaCode(String aCode) {
	 enterById("createLeadForm_primaryPhoneAreaCode", aCode);
	 return this;
 }
 public CreateLeadPage enterExtension(String extension) {
	 enterById("createLeadForm_primaryPhoneExtension", extension);
	 return this;
 }
 public CreateLeadPage enterDepartment(String dept) {
	 enterById("createLeadForm_departmentName", dept);
	 return this;
 }
 public CreateLeadPage choosePrefCurrency(String pCurrency) {
	 selectVisibileTextById("createLeadForm_currencyUomId", pCurrency);
	 return this;
 }
 public CreateLeadPage enterNoOfEmp(String noEmp) {
	 enterById("createLeadForm_numberEmployees", noEmp);
	 return this;
 }
 public CreateLeadPage enterTickerSymbol(String tSymbol) {
	 enterById("createLeadForm_tickerSymbol", tSymbol);
	 return this;
 }
 public CreateLeadPage enterPersonToAskFor(String pTAK) {
	 enterById("createLeadForm_primaryPhoneAskForName", pTAK);
	 return this;
 }
 public CreateLeadPage enterWebUrl(String webUrl) {
	 enterById("createLeadForm_primaryWebUrl", webUrl);
	 return this;
 }
 public CreateLeadPage enterToName(String toName) {
	 enterById("createLeadForm_generalToName", toName);
	 return this;
 }
 public CreateLeadPage enterAddress1(String address1) {
	 enterById("createLeadForm_generalAddress1", address1);
	 return this;
 }
 public CreateLeadPage enterAddress2(String address2) {
	 enterById("createLeadForm_generalAddress2", address2);
	 return this;
 }
 public CreateLeadPage enterCity(String city) {
	 enterById("createLeadForm_generalCity", city);
	 return this;
 }
 public CreateLeadPage chooseStateProvince(String staPro) {
	 selectVisibileTextById("createLeadForm_generalStateProvinceGeoId", staPro);
	 return this;
 }
 public CreateLeadPage chooseCountry(String country) {
	 selectVisibileTextById("createLeadForm_generalCountryGeoId", country);
	 return this;
 }
 public CreateLeadPage enterZipPostalCode(String zipPostal) {
	 enterById("createLeadForm_generalPostalCode", zipPostal);
	 return this;
 }
 public CreateLeadPage enterPostalZipCodeExt(String pzce) {
	 enterById("createLeadForm_generalPostalCodeExt", pzce);
	 return this;
 }
 public CreateLeadPage chooseMarketingCampaign(String mKcamp) {
	 selectVisibileTextById("createLeadForm_marketingCampaignId", mKcamp);
	 return this;
 }
 public CreateLeadPage enterPhoneNumber(String phNo) {
	 enterById("createLeadForm_primaryPhoneNumber", phNo);
	 return this;
 }
 public CreateLeadPage enterEmailAddress(String eAddress) {
	 enterById("createLeadForm_primaryEmail", eAddress);
	 return this;
 }
 public ViewLeadPage clickViewLeadPage() {
	 clickByXpath("//input[@name='submitButton']");
	 return new ViewLeadPage();
 }

 public void verefyFirstName(String fName) {
	
 }
	 
}






