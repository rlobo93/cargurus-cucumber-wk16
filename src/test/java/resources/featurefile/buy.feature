Feature: Search functionality
  @smoke,@regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<Make>"
    And I select model "<Model>"
    And I select location "<Location>"
    And I select price "<Price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | Make   | Model | Location          | Price    | make   |
      | Nissan | GT-R  | NSW - South Coast | $200,000 | NISSAN |
#      | BMW        | Series            | NSW - Sydney      | $25,000  | BMW        |
#      | Audi       | A4                | NSW - Far West    | $40,000  | AUDI       |
#      | Ford       | Mustang           | NT - South        | $80,000  | FORD       |
#      | Land Rover | Range Rover Vogue | QLD - Brisbane    | $70,000  | LAND ROVER |
#      | Toyota     | Supra             | QLD - Brisbane    | $90,000  | TOYOTA     |

#  @regeneration
#  Scenario Outline: Search the used car with model
#    Given I am on homepage
#    When I mouse hover on “buy+sell” tab
#    And I click ‘Used’ link
#    Then I navigate to ‘Used Cars For Sale’ page
#    And I select make "<Make>"
#    And I select model "<Model>"
#    And I select location "<Location>"
#    And I select price "<Price>"
#    And I click on Find My Next Car tab
#    Then I should see the make "<make>" in results
#
#    Examples:
#      | Make       | Model             | Location          | Price    | make       |
#      | Nissan     | GT-R              | NSW - South Coast | $200,000 | NISSAN     |
#      | BMW        | Series            | NSW - Sydney      | $25,000  | BMW        |
#      | Audi       | A4                | NSW - Far West    | $40,000  | AUDI       |
#      | Ford       | Mustang           | NT - South        | $80,000  | FORD       |
#      | Land Rover | Range Rover Vogue | QLD - Brisbane    | $70,000  | LAND ROVER |
#      | Toyota     | Supra             | QLD - Brisbane    | $90,000  | TOYOTA     |



