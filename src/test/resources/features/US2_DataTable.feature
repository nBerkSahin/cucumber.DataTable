Feature: DataTable Step Definition

  Scenario Outline: Kullanıcı data ekleyebilmeli

    Given kullanıcı "CHotelUrl" sayfasına gider
    Then new butonuna basar
    And ilgili kutulara "<firstName>" "<lastName>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>" bilgilerini girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular


    Examples:
      |firstName| lastName|position|office|extension|startDate|salary|
      |Hakan    |Tetik    |TestLead|Paris |ali      |2021-01-21|60000|
      |Murat    |Ercoban  |QA      |Kenya |126      |2021-01-20|40000|
      |Furkan   |Yilmaz   |QA      |Adana |130      |2021-03-21|80000|