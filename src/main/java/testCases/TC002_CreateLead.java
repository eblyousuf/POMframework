package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
	 excelfile = "TC002_CreateLead";
		
	}
	

    @Test(dataProvider = "getData")
	public void createLead(String uName,String pwd, String cName, String fName, String lName, String FnameLocal, String LnameLocal, String Salut, String source, String title, String aRevenue, String ind, String own, String Scode, String Desc, String ImproNote, String cCode,
			String aCode,String extension,String dept,String pCurrency,String noEmp,String tSymbol,String pTAK,String webUrl, String toName,String address1,String address2,String city,String StPro,String country,String zipPostal,String pzce,String MktCamp,String phNo,String emailAdd) { 
    		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA() 
		.clickLeadsLink()
		.ClickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterFstNameLocal(FnameLocal)
		.enterLstNameLocal(LnameLocal)
		.enterSalutation(Salut)
		.chooseSource(source)
		.enterTitle(title)
		.enterARevenue(aRevenue)
		.choosetIndustry(ind)
		.chooseOwnership(own)
		.sicCode(Scode)
		.enterDescription(Desc)
		.enterImpoNote(ImproNote)
		.enterCountryCode(cCode)
		.enterAreaCode(aCode)
		.enterExtension(extension)
		.enterDepartment(dept)
		.choosePrefCurrency(pCurrency)
		.enterNoOfEmp(noEmp)
		.enterTickerSymbol(tSymbol)
		.enterPersonToAskFor(pTAK)
		.enterWebUrl(webUrl)
		.enterToName(toName)
		.enterAddress1(address1)
		.enterAddress2(address2)
		.enterCity(city)
		.chooseStateProvince(StPro)
		.chooseCountry(country)
		.enterZipPostalCode(zipPostal)
		.enterPostalZipCodeExt(pzce)
		.chooseMarketingCampaign(MktCamp)
		.enterPhoneNumber(phNo)
		.enterEmailAddress(emailAdd);
		//.verifyTextById(id, text);
		
		
		
	}
		
}












/*@Test(dataProvider = "getData")

public void loginAndLogout() {

	LoginPage lp = new LoginPage();
	lp.enterUsername();
	lp.enterPassword();
	lp.clickLogin();
	HomePage hp = new HomePage();
	hp.clickLogOut();
	new LoginPage()
	.enterUsername()
	.enterPassword()
	.clickLogin()
	.clickCRMSFA();
}
public void myHomePage() {

	new MyHomePage()
	.clickLeads();
}
public void myLeadspage() {

	new MyLeadsPage()
	.ClickCreateLink();
}
public void createLeadPage() {

	new CreateLeadPage()
	.enterCompanyName()
	.enterFirstName()
	.enterLastName()
	.clickCreateLead();
}
public void viewLeadPage() {

	new ViewLeadPage();
}*/