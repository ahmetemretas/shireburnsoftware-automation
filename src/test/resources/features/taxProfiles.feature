Feature: Tax profiles

  Background: Login with valid credentials
    Given User logs in succesfully

  @aet
  Scenario: Add a new Tax Profile
    When User clicks Tax Profile
    And User clicks Add button
    Given User fills in the required fields
    Then User clicks Save button
    And User clicks Cancel button
    Then User verifies new Tax Profile is added

  @aet
  Scenario Outline: Define rates
    When User clicks Tax Profile
    And User highlights the tax profile
    When User cliks Rates button
    And User clicks Add button
    Given User fills in the required fields with "<code>", "<range from>", "<range to>", "<tax rate>", "<subtract>"
    Then User clicks Save button
    Then User verifies datas are added "<code>"
    Examples:
      | code | range from | range to | tax rate | subtract |
      | 1001 | 0          | 9100     | 0        | 0        |
      | 1002 | 9101       | 14500    | 15       | 1365     |
      | 1003 | 14501      | 19500    | 25       | 2815     |
      | 1004 | 19501      | 60000    | 25       | 2725     |
      | 1005 | 60001      | 100000   | 35       | 8725     |

  @aet
  Scenario: Edit a Tax Profile
    When User clicks Tax Profile
    And User highlights the tax profile
    When User clicks Edit button
    Given User edits required fields
    And User clicks Save button
    Then User verifies Tax Profiles edited

  @aet
  Scenario: Delete a Tax Profile
    When User clicks Tax Profile
    And User highlights the tax profile
    When User clicks Delete button
    And User clicks Delete to accept
    And User verifies there is no data to display
