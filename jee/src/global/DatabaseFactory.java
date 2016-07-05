package global;

import java.sql.Connection;

/**
 *@date    :2016. 7. 5.
 *@author  :최인철
 *@file    : DatabaseFactory.java
 *@story  :
 */
public class DatabaseFactory {
	public static Database createDatabase(Vender vender,String id, String pw){
		String driver ="",url="";
		switch(vender){
		case ORACLE:
			driver = Constants.ORACLE_DRIVER;
			url = Constants.ORACLE_URL;
			break;
		case MYSQL:
			driver = Constants.MYSQL_DRIVER;
			url = Constants.MYSQL_URL;
			break;
		case MSSQL:break;
		case MARIDB:break;
		default:
			break;
		}
		return new Database(driver,url,id,pw);
		
	}
}
