import java.sql.DriverManager

object ThriftserverDemo {
  def main(args: Array[String]): Unit = {
      //add driver
      var driver = "org.apache.hive.jdbc.HiveDriver"
      Class.forName(driver)

      //get connection
      val (url,username,userpasswd) = ("jdbc:hive2://hadoop1:10000","root","root")
      val connection = DriverManager.getConnection(url,username,userpasswd)

      //get statement
      connection.prepareStatement("use rz").execute()
      val sql = "select * from rzt z where z.id > 1000"
      val statement = connection.prepareStatement(sql)

      //get result
      val rs = statement.executeQuery()
      while (rs.next()){
        println(s"${rs.getString(1)}:${rs.getString(2)}")
      }

      //close
      rs.close()
      statement.close()
      connection.close()

  }
}
