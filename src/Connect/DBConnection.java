package Connect;

import Model.Recept;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

    String username = "p***";
    String passw = "g***";
    String code= "jdbc:mysql://mapetite.cw3bvdxamgbe.us-east-2.rds.amazonaws.com:3306/Mapetite";

    //Queries

    String receptQuery = "select * from recept";
    String ingredienceQuery = "select * from ingredienser";
    String ingredienceListQuery = "select * from ingredienslista";



    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public List<Recept> getRecept(String ID){
        List<Recept> allRecept = new ArrayList<>();
        String query = "select * from Recept";
        if (ID.length() > 0)
            query = "select * from Recept where ID = ?";
        try(Connection con = DriverManager.getConnection(code, username, passw);
            PreparedStatement stmt = con.prepareStatement(query);
        ){
            if (ID.length() > 0)
                stmt.setString(1, ID);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Recept temp = new Recept();
                temp.setTitel(rs.getString("titel"));
                allRecept.add(temp);
            }
        }   catch (SQLException ex) {
            ex.printStackTrace();
        }
        return allRecept;
    }



}
