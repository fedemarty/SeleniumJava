@Navigation
Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    Background: I am on the Free Range Testers web without logging in.
        Given I navigate to www.freerangetesters.com

    Scenario Outline: I can access the subpages through the navigation bar
        When I go to <section> using the navigation bar
        Examples:
           | section  |
           | Academia |
           | Cursos   |
           | Mentorías |
           | Recursos |
           | Udemy    |
           | Blog |
    @Courses
    Scenario: Courses are presented correctly to potential customers
        When I go to Cursos using the navigation bar
        And The user selects Introduccion al Testing

    @Plans
    Scenario: Users can select a plan when signing up
        When The user selects Elegir Plan
        Then The client can validate the options in the checkout page

