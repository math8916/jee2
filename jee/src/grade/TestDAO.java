package grade;

/**
 *@date    :2016. 7. 4.
 *@author  :최인철
 *@file    : TestDAO.java
 *@story  :
 */
public class TestDAO {
/**
 * 
 */
	private static TestDAO instans = new TestDAO();

private TestDAO() {
	// TODO Auto-generated constructor stub
}
public static TestDAO getInstans() {
	return instans;
}
}
