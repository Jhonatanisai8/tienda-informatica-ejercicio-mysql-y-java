package com.jhonatan.tiendainformatica.dao;

import com.jhonatan.tiendainformatica.datos.Fabricante;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public interface FabricanteDao {

    public void listarFabricantesTabla(DefaultTableModel modelo,JTable tabla);

    public int insertarFabricante(Fabricante fabricante);

    public int modificarFabricante(Fabricante fabricante);

    public int eliminarFabricante(Fabricante fabricante);

    public boolean tieneProductosAsocidos(int idFabricante);

    public Fabricante obtenerInformacion(int idFabricante);
}
