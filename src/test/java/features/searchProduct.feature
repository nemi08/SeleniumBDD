Feature: Search and Place  the order for the product

#Scenario: Search experience for product search in both home and Offers page

#Given User is on GreenCart Landing Page
#When User searched the product with shortname "Tom" and extracted actual name of the product
#Then User search for the same shortname "Tom" in offers page to check if product exists 
#Then validate product name in offer page matches with landing page
@SearchPage
Scenario Outline: Search experience for product search in both home and Offers page

Given User is on GreenCart Landing Page
When User searched the product with shortname <Name> and extracted actual name of the product
Then User search for the same shortname <Name> in offers page to check if product exists 
Then validate product name in offer page matches with landing page

Examples:
|	Name	|
| Tom		|
|	Beet	|