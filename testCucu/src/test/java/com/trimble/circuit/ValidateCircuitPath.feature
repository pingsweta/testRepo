Feature: First Rest Assured test22

  Scenario Outline: Test data driven111
    Given  User hits the F1 data
    When user gets the data
    #Then user checks 200 the status code
    Then get size of JSON file
    #Then user checks "albert_park" value
    #Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]" with the "albert_park" value
    Then user checks at path "<path>" with the "<value>" value

    Examples: 
      | path                                      | value       |
      | MRData.CircuitTable.Circuits.circuitId[0] | albert_park |
      | MRData.CircuitTable.Circuits.circuitId[1] | americas |
      | MRData.CircuitTable.Circuits.circuitId[2] | bahrain    |
