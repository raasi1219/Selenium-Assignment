@tag
Feature: Register and send mail
1. register
2. send mail

@register
Scenario: user should Regiter
Given user navigates to login page
When user clicks on singup
And user enter Firstname "qwe1" and Lastname "asd1"
And user enter Mail "qwe1@asd.com" and User "qwe1"
And user enter Password "qwe1" and ConfPasswd "qwe1"
And click on register button
Then user should view confirmation message "Dear qwe1 asd1, Your personal settings have been registered."
And click on user dropdown
Then validate the user "qwe1 asd1" and mail "qwe1@asd.com" 
And close browser

@sendmail
Scenario: user sends an email
Given user logins and click on compose button
When user enter Id "qwe@asd.com" 
And user enter Subject "Hi for Testing" and Desc "Hello qwe, \n  \\t This is for Testing, \n\n From \n qwe "
And click on send
Then validate the acknowledgement "The message has been sent to qwe asd (qwe)"



