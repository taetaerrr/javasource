package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select 구문 시에만 사용

        try {

            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 3. connection얻기
            con = DriverManager.getConnection(url, user, password);

            // 4. connection을 통해서 실행하고자 하는 sql 구문전송
            String sql = "SELECT * FROM EMP WHERE EMPNO=7369";
            pstmt = con.prepareStatement(sql);

            // insult , delete, update구문 = executeUpdate / select 구문 executeQuery
            // 5. 전송된 sql 구문 실행
            rs = pstmt.executeQuery();

            // 6. 결과값이 담긴 rs에서 하나씩 조회(행단위)
            if (rs.next()) {
                // number => getInt() / varchar2 => getString() / date => getDate()
                // () 안에는 컬럼 번호 or 컬럼명 가능
                System.out.println("empno : " + rs.getInt(1));
                System.out.println("ename : " + rs.getString(2));
                System.out.println("job : " + rs.getString(3));
                System.out.println("mgr : " + rs.getInt(4));
                System.out.println("hitedate : " + rs.getDate(5));
                System.out.println("sal : " + rs.getInt(6));
                System.out.println("comm : " + rs.getInt(7));
                System.out.println("deptno : " + rs.getInt(8));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
