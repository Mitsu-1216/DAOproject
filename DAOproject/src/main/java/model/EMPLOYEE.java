package model;


public class EMPLOYEE {
public static void main(String[] args) throws SQLException {
//データベースに接続
	try (Connection conn = DriverManager.getConnection(
			"jdbc:mysql:tcp://localhost/~/example","sa","")){
		
		//SQL文生成
		String sql="SELECT ID,NAME,AGE FROM EMPLOYE";
		PreparedStatement pStmt = conn.prepareStatement(sql);
		
		ResultSet rs = pStmt.executeQuery();
		
		while (rs.next()) {
			String id = rs.getString("ID");
			String name = rs.getString("NAME");
			int age = rs.getInt("AGE");
			
			System.out.println(id);
			System.out.println(name);
			System.out.println(age);
		}
	}
		catch (SQLException e) {
			e.printStackTrace();
			}
	}
}