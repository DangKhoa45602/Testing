Feature: TestXemDiem

  Scenario Outline: XemDiem
    Given Go to login page "<url>" And Enter User"<User>" Password"<Password>" Click button Login
    When User Click On KQHT
    Then KQHT appear
    Examples:
      | url                             | User  | Password   |
      | http://my.uda.edu.vn/sv/svlogin | 45602 | 12/01/2000 |