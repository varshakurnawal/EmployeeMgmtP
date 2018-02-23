
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/conf/routes
// @DATE:Fri Feb 23 16:56:02 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
