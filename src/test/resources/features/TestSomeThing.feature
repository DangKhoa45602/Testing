Feature: TestSomeThing

  Scenario Outline: Test
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When User Click On TKB
    Then TKB appear
    Examples:
      | url                             | User  | Password   |
      | http://my.uda.edu.vn/sv/svlogin | 45602 | 12/01/2000 |