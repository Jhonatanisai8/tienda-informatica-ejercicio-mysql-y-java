package com.jhonatan.tiendainformatica.ImplementacioDao;

import com.jhonatan.tiendainformatica.dao.Conexion;
import com.jhonatan.tiendainformatica.dao.ProductoDao;
import com.jhonatan.tiendainformatica.datos.Producto;
import java.util.List;
import java.sql.*;

public class DaoImpleProducto implements ProductoDao {
    //llamamos a la instancia de la conexion

    private final Conexion conexion = Conexion.getInstance();
    private final String INSERT_PRODUCTO = "INSERT INTO producto (nombre,precio,id_fabricante) VALUES (?,?,?)";

    @Override
    public List<Producto> listarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insertarProducto(Producto producto) {
        int registros = 0;
        try {
            Connection conectar = conexion.conectarBaseDatos();
            PreparedStatement consultaPreparada = conectar.prepareStatement(INSERT_PRODUCTO);
            consultaPreparada.setString(1, producto.getNombre());
            consultaPreparada.setDouble(2, producto.getPrecio());
            consultaPreparada.setInt(3, producto.getIdFabricante());
            registros = consultaPreparada.executeUpdate();
            System.out.println("producto registrado");
            conexion.desconectarBaseDatos();
        } catch (SQLException e) {
            System.out.println("error al insertar producto: " + e.getMessage());
        }
        return registros;
    }

    @Override
    public int modificarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto obtenerInformacionProducto(int idProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
