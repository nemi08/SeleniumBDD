Feature: Place the order for products

@CheckoutPage
Scenario Outline: Purchase experience for the users

Given User is on GreenCart Landing Page
When User searched the product with shortname <Name> and extracted actual name of the product
And Added "3" items of the selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkout page
And Verify if user has option to add promo code and place the order 

Examples:
|	Name	|
|Tom		|