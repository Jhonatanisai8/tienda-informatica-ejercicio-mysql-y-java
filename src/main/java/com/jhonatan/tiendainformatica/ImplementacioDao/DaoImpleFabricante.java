package com.jhonatan.tiendainformatica.ImplementacioDao;

import com.jhonatan.tiendainformatica.dao.Conexion;
import com.jhonatan.tiendainformatica.dao.FabricanteDao;
import com.jhonatan.tiendainformatica.datos.Fabricante;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhonatan
 */
public class DaoImpleFabricante implements FabricanteDao {

    //llamamos a la instancia de la conexion
    private final Conexion conexion = Conexion.getInstance();
    private final String INSERT_FABRICANTE = "INSERT INTO fabricante(nombre) VALUES (?)";
    private final String UPDATE_FABRICANTE = "UPDATE fabricante SET nombre = ? WHERE id_fabricante = ?";
    private final String COUNT_PRODUCTS = "SELECT COUNT(*) FROM producto WHERE id_fabricante = ?";
    private final String DELETE_FABRICANTE = "DELETE FROM fabricante WHERE id_fabricante = ?";
    private final String SELECT_OBTENER_FABRICANTE = "SELECT id_fabricante,nombre FROM fabricante WHERE id_fabricante = ?";
    private final String SELECT_INNER_JOIN = "SELECT fabricante.id_fabricante, fabricante.nombre, COUNT(producto.id_producto) AS num_productos  " +
" FROM fabricante LEFT JOIN producto ON  fabricante.id_fabricante = producto.id_fabricante " +
" GROUP BY     fabricante.id_fabricante, fabricante.nombre ORDER BY fabricante.id_fabricante ASC";
    @Override
    public void listarFabricantesTabla(DefaultTableModel modelo, JTable tabla) {
        try {
            Connection conectar = conexion.conectarBaseDatos();
            PreparedStatement consultaPreparada = conectar.prepareStatement(SELECT_INNER_JOIN);
            ResultSet resultado = consultaPreparada.executeQuery();
            ResultSetMetaData datos = resultado.getMetaData();
            int cantidadColumnas = datos.getColumnCount();
            while (resultado.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = resultado.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            tabla.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("error al listar en tabla : " + e.getMessage());
        } finally {
            try {
                conexion.desconectarBaseDatos();
            } catch (SQLException ex) {
                
            }
        }

    }

    @Override
    public int insertarFabricante(Fabricante fabricante) {
        int registros = 0;
        try {
            Connection conectar = conexion.conectarBaseDatos();
            PreparedStatement consultaPreparada = conectar.prepareStatement(INSERT_FABRICANTE);
            consultaPreparada.setString(1, fabricante.getNombre());
            registros = consultaPreparada.executeUpdate();
            conexion.desconectarBaseDatos();
        } catch (SQLException e) {
            System.out.println("error al insertar fabricante: " + e.getMessage());
        }
        return registros;
    }

    @Override
    public int modificarFabricante(Fabricante fabricante) {
        int registros = 0;
        try {
            Connection conectar = conexion.conectarBaseDatos();
            PreparedStatement consultaPreparada = conectar.prepareStatement(UPDATE_FABRICANTE);
            consultaPreparada.setString(1, fabricante.getNombre());
            consultaPreparada.setInt(2, fabricante.getIdFabricante());
            registros = consultaPreparada.executeUpdate();
            conexion.desconectarBaseDatos();
        } catch (SQLException e) {
            System.out.println("error al modificar fabricante: " + e.getMessage());
        }
        return registros;
    }

    @Override
    public int eliminarFabricante(Fabricante fabricante) {
        int registros = 0;
        try {
            Connection conector = conexion.conectarBaseDatos();
            PreparedStatement consultaPreparedStatement = conector.prepareStatement(DELETE_FABRICANTE);
            if (!tieneProductosAsocidos(fabricante.getIdFabricante())) {
                registros = consultaPreparedStatement.executeUpdate();
            }
            conexion.desconectarBaseDatos();
        } catch (SQLException e) {
            System.out.println("error al eliminar fabricante " + e.getMessage());
        }
        return registros;
    }

    @Override
    public Fabricante obtenerInformacion(int idFabricante) {
        Fabricante fabricante = new Fabricante();
        try {
            Connection conectar = conexion.conectarBaseDatos();
            PreparedStatement consultPreparada = conectar.prepareStatement(SELECT_OBTENER_FABRICANTE);
            consultPreparada.setInt(1, idFabricante);
            ResultSet resultado = consultPreparada.executeQuery();

            //obtenemos los datos y los esblacemos al fabricante
            while (resultado.next()) {
                fabricante.setIdFabricante(resultado.getInt("id_fabricante"));
                fabricante.setNombre(resultado.getString("nombre"));
            }
            conexion.desconectarBaseDatos();
        } catch (SQLException e) {
            System.out.println("error al obtener la informacion del fabricante: " + e.getMessage());
        }
        return fabricante;
    }

    @Override
    public boolean tieneProductosAsocidos(int idFabricante) {
        try {
            Connection conectar = conexion.conectarBaseDatos();
            PreparedStatement consultaPreparada = conectar.prepareStatement(COUNT_PRODUCTS);
            consultaPreparada.setInt(1, idFabricante);
            ResultSet resultado = consultaPreparada.executeQuery();

            if (resultado.next()) {
                return resultado.getInt(1) > 0;
            }

            conexion.desconectarBaseDatos();
        } catch (SQLException e) {
            System.out.println("error al saber si tiene productos: " + e.getMessage());

        }
        return false;
    }

}
