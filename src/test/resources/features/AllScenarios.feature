@Test
Feature: Test practice page and personal data

  Scenario: Charge personal data of anybody
    Given navigate in the practice page
    When enter complete and mandatory data
    And click in the submit button
    Then charge personal data successfully

  Scenario: Charge personal data with checkbox
    Given navigate in the practice page checkbox
    When enter complete and checkbox data
    And click in the submit button checkbox
    Then charge personal data successfully checkbox

  Scenario: Charge personal data with radio
    Given navigate in the practice page radio
    When enter complete and radio data
    And click in the submit button radio
    Then charge personal data successfully radio

  Scenario: Charge personal data with combobox
    Given navigate in the practice page combobox
    When enter complete and combobox data
    And click in the submit button combobox
    Then charge personal data successfully combobox

  Scenario: Charge personal data with dependent combobox
    Given navigate in the practice page combobox2
    When enter complete and combobox2 data
    And click in the submit button combobox2
    Then charge personal data successfully combobox2

  Scenario: Charge personal data with calendar
    Given navigate in the practice page calendar
    When enter complete and calendar data
    And click in the submit button calendar
    Then charge personal data successfully calendar

  Scenario: Charge personal data with file
    Given navigate in the practice page file
    When enter complete and file data
    And click in the submit button file
    Then charge personal data successfully file

  Scenario: Validate mandatory fields
    Given navigate in the practice page mandatory fields
    When click in the submit button mandatory
    Then does not load personal data and generate alerts
    When enter not mandatory data
    And click in the submit button mandatory
    Then does not load personal data and generate alerts again
    When enter mandatory data
    And click in the submit button mandatory
    Then charge personal data successfully mandatory

  Scenario: Load and validate the contact information
    Given navigate in the practice page contact information
    When click in the submit button contact information
    Then does not load personal data and generate alerts contact information
    When enter contact information data without consent
    And click in the submit button contact information
    Then does not load personal data and generate alerts again contact information
    When enter contact information data with consent
    And click in the submit button contact information
    Then load personal data successfully contact information

  Scenario: Load personal data with disabled fields
    Given navigate in the practice page disabled fields
    When enter complete and disabled fields data
    And click in the submit button disabled fields
    Then load personal data successfully disabled fields

  Scenario: Load personal data with course
    Given navigate in the practice page course
    When click in the submit button course
    Then does not load personal data and generate alerts course
    When enter course data without address
    And click in the submit button course
    Then does not load personal data and generate alerts again course
    When enter complete course data
    And click in the submit button course
    Then load personal data successfully course

  Scenario: Load survey
    Given navigate in the practice page survey
    When enter complete survey
    And click in the submit button survey
    Then load survey successfully

  Scenario: Load products form
    Given navigate in the practice page products
    When click in the submit button products
    Then does not load data and generate alerts in products
    When enter products data without address
    And click in the submit button products
    Then does not load data and generate alerts again in products
    When enter complete products form
    And click in the submit button products
    Then load products form successfully

  Scenario: Load membership form
    Given navigate in the practice page membership
    When click in the submit button membership
    Then does not load data and generate alerts in membership
    When enter membership data without address
    And click in the submit button membership
    Then does not load data and generate alerts again in membership
    When enter complete membership form
    And click in the submit button membership
    Then load membership form successfully

  Scenario: Load school form
    Given navigate in the practice page school
    When click in the submit button school
    Then does not load data and generate alerts in school - personal information
    When enter school - personal information data
    And click in the next button school - personal information
    Then show school - secondary education form

    When click in the submit button school
    Then does not load data and generate alerts in school - secondary education
    When enter complete school - secondary education form
    And click in the next button school - secondary education
    Then show school - post secondary education form

    When click in the submit button school
    Then does not load data and generate alerts in school - post secondary education
    When enter complete school - post secondary education form
    And click in the next button school - post secondary education
    Then show school - personal statement form

    When click in the submit button school
    Then does not load data and generate alerts in school - personal statement
    When enter complete school - personal statement form
    And click in the submit button school
    Then load school form successfully