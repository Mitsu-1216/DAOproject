import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SampleDAO {
public static void main(String[] args) throws SQLException {
//データベースに接続
	try (Connection conn = DriverManager.getConnection(
			"jdbc:h2:tcp://localhist/-/example","sa","")){
		
		//SQL文生成
		String sql;
	}
	
	
}
}