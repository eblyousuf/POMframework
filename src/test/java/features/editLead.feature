Feature: Automate Leaftaps Application

Scenario: TC004_EditLead

Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click the login button
	And click CRMSFA
	And click leads
	When click Find Leads
	And enter first name as Gopi
	And click find lead button
	And click first resulting lead
	Then nevigated view lead page
	And verify title of the page
    And click on Edit
    Then nevigated Edit Lead page
    And the company name
   And click update
   And confirm changed name appears
   And close browser
   
 Scenario: TC005_DeleteLead
 Given Lunch chrome browser and load url
    And enter username as demosalesmanager
    And enter password as crmsfa
    And click the loginbutton
    And click CRMSFA
    And click leads link
    When click Find Leads
    
    And click on phone
    And enter phone number
    And click find lead button
    And capture Lead ID of first resulting Lead
    And click first resulting lead
    And click Delete
    Then nevigated MyLeadsPage
    And click Find Leads
    And captured Lead ID
    And click find leads button
    And verify error msg
    And close browser
    
    
	
	