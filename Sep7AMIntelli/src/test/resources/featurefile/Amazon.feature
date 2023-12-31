Feature: Amazon Validation

  @AmazonSearch @RegessionTest @common
    #Before Hooks
  Scenario: Search functionality of amazon
    #beforestep
    Given user enter the "iphone" and click search icon
    #afterstep
    #beforestep
    Then Validate the title of page
    #afterstep
  #after
    @multi
  Scenario Outline: Multi validation
    Given user enter the "<product name>" and click search icon
    Examples:
      | product name | Sample |
      | iphone       |        |
      | book         |        |
      | Smart Tv     |        |

     @extractvalues
  Scenario: validate the dropdown values
    Given user extracts the value from the categrogy dropdown

       @StaticDropdown
  Scenario: handle the static dropdown
    Given user selects the value from the category dropdown

@mouseaction  @common
  Scenario: Handle the mouse actions
    Given user clicks the babywishlist

  @draganddrop
 Scenario: Drag and Drop
   Given user drag and drop the box