package DataAcessComponent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import DataAcessComponent.DTO.SexoDTO;

public class SexoDAO extends DataHelper implements IDAO<SexoDTO>{

    @Override
    public SexoDTO readBy(Integer id) throws Exception {
        SexoDTO sO = new SexoDTO();
        String sql = "SELECT IdSexo ,Nombre, Estado, FechaCreacion, FechaModificacion FROM SEXO WHERE Estado = 'A' AND IdSexo =" + id.toString();
        try {
            Connection connection = opConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                sO = new SexoDTO(rs.getInt(1),
                                 rs.getString(2),
                                 rs.getString(3),
                                 rs.getString(4),
                                 rs.getString(5));
            }

        } catch (Exception e) {
            throw e; //new PatException(e.getMessage(), getClass().getName(), "readAll()");
        } 
        return sO;
    }

    @Override
    public boolean create(SexoDTO entity) throws Exception {
        String sql = "INSERT INTO SEXO(Nombre) VALUES(?)";
        try {
            Connection connection = opConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, entity.getNombre());
            pstmt.executeUpdate();
            return true;

        } catch (Exception e) {
            throw e; //new PatException(e.getMessage(), getClass().getName(), "readAll()");
        } 
    }

    @Override
    public List<SexoDTO> readAll() throws Exception {
        List<SexoDTO> lst = new ArrayList<>();
        String sql = "SELECT IdSexo ,Nombre, Estado, FechaCreacion, FechaModificacion FROM SEXO WHERE Estado = 'A'";
        try {
            Connection connection = opConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                SexoDTO s = new SexoDTO(rs.getInt(1),
                                        rs.getString(2),
                                        rs.getString(3),
                                        rs.getString(4),
                                        rs.getString(5));
                lst.add(s);
            }

        } catch (Exception e) {
            throw e; //new PatException(e.getMessage(), getClass().getName(), "readAll()");
        } 
        return lst;
    }

    @Override
    public boolean update(SexoDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String sql = "UPDATE SEXO SET Nombre=?, FechaModificacion=? WHERE IdSexo=?";
        try {
            Connection connection = opConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIDSexo());
            pstmt.executeUpdate();
            return true;

        } catch (Exception e) {
            throw e; //new PatException(e.getMessage(), getClass().getName(), "readAll()");
        } 
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String sql = "UPDATE SEXO SET Estado=? WHERE IdSexo=?";
        try {
            Connection connection = opConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;

        } catch (Exception e) {
            throw e; //new PatException(e.getMessage(), getClass().getName(), "readAll()");
        } 
    }

}
