package dao;

import java.sql.Connection;

public class DaoFactory {
	
	public static ICongeDao getCongeDao(Connection conn){
		return new CongeDaoMysql(conn);
	}
	public static IEmployeDao getEmployeDao(Connection conn){
		return new EmployeDaoMysql(conn);
	}
	
}
