package DatabaseAutomation;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudOperation extends BaseClass {
    @Test
    public void ReadData() throws Exception {
        Connection con = connector();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from mydb.stud");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getLong(4) + " " + rs.getInt(5) + " " + rs.getInt(6));
        }
    }

    @Test
    public void UpdateData() throws Exception {
        Connection con = connector();
        String updateQuery = "UPDATE mydb.stud SET stud_branch = ? WHERE stud_id = ?";
        PreparedStatement pstmt = con.prepareStatement(updateQuery);
        pstmt.setString(1, "MECH");
        pstmt.setString(2, "2");
        int nora = pstmt.executeUpdate();
        System.out.println(nora + " rows affected");
    }

    @Test
    public void createData() throws Exception {
        Connection con = connector();
        String insertQuery = "INSERT INTO mydb.stud (stud_id, stud_name, stud_branch, stud_num, stud_percentage, dept_no) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(insertQuery);
        ps.setInt(1, 8);
        ps.setString(2, "Raghu");
        ps.setString(3, "Mechaical");
        ps.setLong(4, 1234567898);
        ps.setInt(5, 98);
        ps.setInt(6, 20);
        int rowsInserted = ps.executeUpdate();

        System.out.println("Rows inserted: " + rowsInserted);

    }
    @Test
    public void DeleteData() throws Exception {
        Connection con = connector();
        String deleteQuery = "DELETE FROM mydb.stud WHERE stud_id = ?";
             PreparedStatement pstmt = con.prepareStatement(deleteQuery);
            pstmt.setInt(1, 8);
            int rowsDeleted = pstmt.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);

    }
}