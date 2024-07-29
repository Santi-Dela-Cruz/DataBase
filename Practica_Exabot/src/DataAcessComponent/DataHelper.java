package DataAcessComponent;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataHelper {
    private static String DBPathConnection = "jdbc:sqlite:dataBase/ExaBot2k24.sqlite";
    private static Connection connection = null;
    //protected DataHelper(){}

    /**
    * La función 'opConnection' devuelve una conexión de base de datos sincronizada, creando un nuevo conexión si aún no existe.
     * @return Se devuelve el objeto 'connection'.
     */
    protected static synchronized Connection opConnection() throws Exception{
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(DBPathConnection);
            }
        } catch (Exception e) {
            throw e;
        }
        return connection;
    }

    /**
     * La función 'closeConnection' intenta cerrar una conexión y lanza una excepción si se produce un error.
     */
    protected static void closeConnection() throws Exception{
        try {
            if (connection == null) {
                connection.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
