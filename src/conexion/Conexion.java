package conexion;
import java.sql.*;

public class Conexion {
    //Conexión Local
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hospital?serverTimezone=UTC", "root", "");
             System.out.println("enka");
            return cn;
           
        } catch (SQLException e) {
            System.out.println("Error en conexión local " + e.toString());
        }
        return (null);
    }
}
