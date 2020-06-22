Feature: Validating Place API

Scenario: validate new Place is added using AddPlace API
	Given Add Place payload
	When user calls AddPlace API with Post request method
	Then user should receive status code as 200
	