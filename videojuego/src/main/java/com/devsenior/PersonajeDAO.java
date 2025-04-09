package com.devsenior;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {

    public void agregarPersonaje(Personaje p){
        String sql = "INSERT INTO personaje (nombre, clase, nivel, experiencia) VALUES (?,?,?,?)";

        try {
            Connection conn = ConexionBD.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,p.getNombre()) ;
            stmt.setString(2, p.getClase());
            stmt.setInt(3, p.getNivel());
            stmt.setInt(4, p.getExperiencia());

            stmt.executeUpdate();
            System.out.println("Personaje insertado exitosamente");

        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }


    public List<Personaje> listar(){
        List<Personaje> lista = new ArrayList<>();
        String sql = "SELECT * FROM personaje";

        try {
            Connection conn = ConexionBD.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                lista.add(
                    new Personaje(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("clase"),
                        rs.getInt("nivel"),
                        rs.getInt("experiencia")
                    ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;

    }
}
