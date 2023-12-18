Feature: Launch a below URL and verify the title of the Page
	
	Scenario: verify the title of the Page
		Given Launch a below URL and verify the title of the Page
		When Click on A/B Testing link
		Then verify the text on the page as “A/B Test Variation 1”
		And Navigate back to Home page and click on dropdown link
		And Select Option1 value form drop down and confirm if its selected or not
		And Navigate back to Home Page and Click on Frames
		And Verify the below hyperlinks are presented on the Frames Page
		
	
