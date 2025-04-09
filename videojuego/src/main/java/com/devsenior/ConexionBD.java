package com.devsenior;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:postgresql://localhost:5432/videoJuego";
    private static final String USUARIO = "postgres";
    private static final String CONTRASENA = "admin123";


    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}
