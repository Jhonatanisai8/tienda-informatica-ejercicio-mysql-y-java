package com.jhonatan.tiendainformatica.dao;

import com.jhonatan.tiendainformatica.datos.Producto;
import java.util.List;

public interface ProductoDao {

    public List<Producto> listarProductos();

    public int insertarProducto(Producto producto);

    public int modificarProducto(Producto producto);

    public int eliminarProducto(Producto producto);

    public Producto obtenerInformacionProducto(int idProducto);
}
