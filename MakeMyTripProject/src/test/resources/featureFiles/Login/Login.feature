Feature: Login.feature Test case to login to MakeMyTrip website

Background: 
	Given Launch the application 
	
Scenario: Login to MakeMyTrip website
	And I click on login button 
	And I enter email "xyz@gmail.com" in login textbox 
	And I enter password "123@qas" in login textbox
	And I click on submit button 
	And I click on dashboard 
 	
Scenario: Enter the details
	And I enter "Ahmedabad" in "From" destination  
	Then I select "AMD" from dropdown  
	And I enter "Mumbai" in "To" destination  
	Then I select "BOM" from dropdown  
	
	And I click on "DEPARTURE"     
	And I select 3 days after today in calender 
	And I click on "RETURN"
	And I select 6 days after today in calender
	And I click on "Travellers & CLASS"
	Then I select tickets "adults-4"   
	Then I select tickets "children-3"    
	Then I select tickets "infants-1" 
	Then I select tickets "travelClass-0"    
	And I click on Apply button  
	Then I click on Search Button
	
#	Then I should see message   
	And I should see message "Flights from " in search page

	