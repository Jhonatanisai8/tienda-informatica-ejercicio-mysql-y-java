package com.jhonatan.tiendainformatica.dao;

import java.sql.*;

public class Conexion {

    private Conexion() {
    }

    private static Connection conexion;
    private static Conexion instancia_MYSQL;
    private static final String URL = "jdbc:mysql://localhost:3306/computer_store";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "1234";

    public Connection conectarBaseDatos() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conectado");
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }

    public void desconectarBaseDatos() throws SQLException {
        try {
            conexion.close();
            System.out.println("Desconectado");
        } catch (SQLException e) {
            System.out.println("error al desconectar: " + e.getMessage());
            conexion.close();
        } finally {
            conexion.close();
        }
    }

    public static Conexion getInstance() {
        if (instancia_MYSQL == null) {
            instancia_MYSQL = new Conexion();
        }
        return instancia_MYSQL;
    }

}
