package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.AdmEmployee;

public class Test {
	public static void main(String args[]) throws Exception{
		new Test().test();
	}
	//数据库连接测试
	public void test() throws Exception{
		String oracle_driverName="oracle.jdbc.OracleDriver";
		String oracle_url="jdbc:oracle:thin:@10.103.28.46:1521:orcl";
		String oracle_username="dbHospital";
		String oracle_password="Sys123456";
		Class.forName(oracle_driverName);// 加载Oracle驱动程序
		Connection conn = DriverManager.getConnection(oracle_url, oracle_username, oracle_password);// 获取连接
		String sql ="select * from \"t_adm_employee\"";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = null;
		rs = pstm.executeQuery();
		int num=0;
		while(rs.next()){
			num++;
		}
		System.out.println(num);
	}
	//AdmEmployee操作测试
	public void testAdmEmployee()throws Exception{
		AdmEmployee admEmployee = new AdmEmployee();
		admEmployee.setId(0);
		admEmployee.setRoolId(20);
		admEmployee.setSex(AdmEmployee.SEX_MAN);
		admEmployee.setUserNumber("123");
		admEmployee.setPassword("123");
		admEmployee.setCreateTime(new String("2014-11-03 23:02:02"));//yyyy-mm-dd hh:mm:ss
	}
	
}
