/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.modelo.dao;

import edu.co.sena.ejemplodao.modelo.dto.*;
import edu.co.sena.ejemplodao.modelo.exceptions.*;

public interface ProductoDao
{
	/** 
	 * Inserts a new row in the producto table.
	 */
	public ProductoPk insert(Producto dto) throws ProductoDaoException;

	/** 
	 * Updates a single row in the producto table.
	 */
	public void update(ProductoPk pk, Producto dto) throws ProductoDaoException;

	/** 
	 * Deletes a single row in the producto table.
	 */
	public void delete(ProductoPk pk) throws ProductoDaoException;

	/** 
	 * Returns the rows from the producto table that matches the specified primary-key value.
	 */
	public Producto findByPrimaryKey(ProductoPk pk) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'ID_PRODUCTO = :idProducto'.
	 */
	public Producto findByPrimaryKey(String idProducto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria ''.
	 */
	public Producto[] findAll() throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CATALOGO_ID_CATALOGO = :catalogoIdCatalogo'.
	 */
	public Producto[] findByCatalogo(int catalogoIdCatalogo) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CATEGORIA_ID_CATEGORIA = :categoriaIdCategoria'.
	 */
	public Producto[] findByCategoria(int categoriaIdCategoria) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'ID_PRODUCTO = :idProducto'.
	 */
	public Producto[] findWhereIdProductoEquals(String idProducto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'NOMBRE_PRODUCTO = :nombreProducto'.
	 */
	public Producto[] findWhereNombreProductoEquals(String nombreProducto) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'PRECIO_DETAl = :precioDetal'.
	 */
	public Producto[] findWherePrecioDetalEquals(double precioDetal) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'IMAGEN = :imagen'.
	 */
	public Producto[] findWhereImagenEquals(byte[] imagen) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public Producto[] findWhereCantidadEquals(float cantidad) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'ACTIVO = :activo'.
	 */
	public Producto[] findWhereActivoEquals(short activo) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CATEGORIA_ID_CATEGORIA = :categoriaIdCategoria'.
	 */
	public Producto[] findWhereCategoriaIdCategoriaEquals(int categoriaIdCategoria) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the criteria 'CATALOGO_ID_CATALOGO = :catalogoIdCatalogo'.
	 */
	public Producto[] findWhereCatalogoIdCatalogoEquals(int catalogoIdCatalogo) throws ProductoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the producto table that match the specified arbitrary SQL statement
	 */
	public Producto[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProductoDaoException;

	/** 
	 * Returns all rows from the producto table that match the specified arbitrary SQL statement
	 */
	public Producto[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProductoDaoException;

}
