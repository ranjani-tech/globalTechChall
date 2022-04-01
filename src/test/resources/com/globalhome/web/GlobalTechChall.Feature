@Regression
@endtoend

Feature: Find product checkout page and total cost of the product

  @AddAndRemoveProduct
  Scenario: end to end journey till product checkout page.
    Given User is on my store product home page
    When user verify the page title "My Store"
    And user adds
      | "Product" | "Size" | "Colour" | "SubProduct" | "actionNow" | "actionNext" |
      | "T-shirts" | "M" | "Blue" | "Faded Short Sleeve T-shirts" | "Add to Cart" | "Continue Shopping" |
      | "Dresses" | "S" | "Beige" | "Evening Dresses" | "Add to Cart" | "Continue Shopping" |
      | "Dresses" | "M" | "Orange" | "Summer Dresses" | "Add to Cart" | "Proceed to Checkout" |
    Then user should be able to view the item in cart "Shopping-cart summary" page
    And user again add the Faded Short Sleeve T-shirts item in cart "Add"
    And user remove the evening dresses item from cart "Delete"
    And user validate the summary page
      | Product     | Faded Short Sleeve T-shirts |
      | Description | Faded Short Sleeve T-shirts |
      | Avail.  | In stock                        |
      | Unit price  | $16.51                      |
      | Unit price  | $28.98                      |
      | Qty | 2                                   |
      | Qty  | 1                                  |
      | Total | 33.02                             |
      | Total | 28.98                             |
      | Total products  | 62.00                   |
      | Total shipping  | $2.00                   |
      | Total           | $64.02                  |
      | Tax             | $0.00                   |
      | Total           | $64.00                  |
    And user verify the "Proceed to checkout" button on cart page




