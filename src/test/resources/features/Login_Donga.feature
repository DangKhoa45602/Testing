Feature: LoginDonga

  Scenario Outline: CheckLogin
    Given Go to login page "<url>"
    When  Input User"<User>" and Password"<Password>"
    And Click button Login
    Then Go to dashboard
    Examples:
      | url                             | User  | Password   |
      | http://my.uda.edu.vn/sv/svlogin | 45602 | 12/01/2000 |
