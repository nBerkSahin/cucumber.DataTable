@Rpr
Feature: DataTable Step Definition

  Scenario Outline: Kullanıcı data ekleyebilmeli

    Given kullanıcı "CHotelUrl" sayfasına gider
    Then new butonuna basar
    And editor firstname kutusuna "<firstName>" bilgilerini girer
    And editor lastname kutusuna "<lastName>" bilgilerini girer
    And editor position kutusuna "<position>" bilgilerini girer
    And editor office kutusuna "<office>" bilgilerini girer
    And editor extension kutusuna "<extension>" bilgilerini girer
    And editor startdate kutusuna "<startDate>" bilgilerini girer
    And editor salary kutusuna "<salary>" bilgilerini girer
    And Create tusuna basar
    Then "<firstName>" ve "<lastName>" girerek kaydin tamamlandiğini test eder


    Examples:
      |firstName| lastName|position|office|extension|startDate|salary|
      |Hakan    |Tetik    |TestLead|Paris |ali      |2021-01-21|60000|
      |Murat    |Ercoban  |QA      |Kenya |126      |2021-01-20|40000|
      |Furkan   |Yilmaz   |QA      |Adana |130      |2021-03-21|80000|