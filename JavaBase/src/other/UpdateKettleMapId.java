package other;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.spi.DirStateFactory.Result;

public class UpdateKettleMapId {
	
	private static Connection getConnection(String username, String password, String driver, String ip, String port,
			String dbname, String url) {
		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("成功连接数据库");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void UpdateData() {
		
		Connection connection = null;
		Connection mysqlConnection = null;
		Result rs = null;
		
		String ip = "";
		String port = "";
		String dbname = "";
		String url = "";
		
		//oracle
		ip = "192.168.12.26";
		port = "1521";
		dbname = "infa";
		url = "jdbc:oracle:thin:@" + ip + ":" + port + ":" +dbname;
		connection = getConnection("kettle_user", "kettle_user", "oracle.jdbc.driver.OracleDriver", ip, port, dbname, url);
		
		//mysql
		ip = "localhost";
		port = "3306";
		dbname = "dim";
		url = "jdbc:mysql://" + ip + ":" + port + ":" +dbname;
		connection = getConnection("root", "sa", "com.mysql.jdbc.Driver", ip, port, dbname, url);
		
		
		String getReacord = "";
		String getDimTask = "";
		String updateSql = "";
		
		String sql = "select * \r\n" + 
				"from \r\n" + 
				"(select t.id_transformation id, t.id_directory, t.name||'.ktr' name from r_transformation t \r\n" + 
				"union all \r\n" + 
				"select j.id_job, j.id_directory, j.name||'.kjb' from r_job j) a \r\n" + 
				"left join \r\n" + 
				"(select id_directory,sys_connect_by_path (directory_name, '/') path   from \r\n" + 
				"r_directory \r\n" + 
				"start with id_directory = 1\r\n" + 
				"connect by prior  id_directory = id_directory_parent) b \r\n" + 
				"on a. id_directory = b.id_directory\r\n" ;
	
	}
}
