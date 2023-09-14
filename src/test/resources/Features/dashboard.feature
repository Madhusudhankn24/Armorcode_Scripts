Feature: dashboard all bu functionality

  Scenario: Click on Production and Staging Option from top side
   Given login to armorcode appliction
   And   click on dashboard dropdown
   When  select all bu option in dropdown
   And   check product page all data should be displayed
   And   click staging option
   Then  check staging all data should be displayed
   
   Scenario: Click on all different filters.
   When  click on sevrity dropown
   And   select critial option and click apply button
   And   slect high option and click apply button
   And   select medium and click apply button
   And   selct low  and click apply
   When  click on status dropdow
   And   select optionn click apply 
   And   click source dropdown button
   And   select dependency option apply
   And   select custom and apply
   And   slect zap and apply