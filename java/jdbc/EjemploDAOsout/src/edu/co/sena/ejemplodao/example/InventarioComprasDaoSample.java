/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.ejemplodao.dao.InventarioComprasDao;
import edu.co.sena.ejemplodao.dto.InventarioCompras;
import edu.co.sena.ejemplodao.exceptions.InventarioComprasDaoException;
import edu.co.sena.ejemplodao.factory.InventarioComprasDaoFactory;

public class InventarioComprasDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByProducto("");
		// findByProveedor("", "");
		// findWhereIdInventarioEquals(0);
		// findWhereProductoIdProductoEquals("");
		// findWhereProveedorTipoDocumentoTipoDocumentoEquals("");
		// findWhereProveedorNumDocumentoEquals("");
		// findWhereFechaCompraEquals(null);
		// findWhereCanProCompradoEquals(0);
		// findWherePrecioPorMayorEquals(0);
		// findWhereObservacionesEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByProducto'
	 * 
	 * @param productoIdProducto
	 */
	public static void findByProducto(String productoIdProducto)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findByProducto(productoIdProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByProveedor'
	 * 
	 * @param proveedorTipoDocumentoTipoDocumento
	 * @param proveedorNumDocumento
	 */
	public static void findByProveedor(String proveedorTipoDocumentoTipoDocumento, String proveedorNumDocumento)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findByProveedor(proveedorTipoDocumentoTipoDocumento, proveedorNumDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdInventarioEquals'
	 * 
	 * @param idInventario
	 */
	public static void findWhereIdInventarioEquals(int idInventario)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findWhereIdInventarioEquals(idInventario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProductoIdProductoEquals'
	 * 
	 * @param productoIdProducto
	 */
	public static void findWhereProductoIdProductoEquals(String productoIdProducto)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findWhereProductoIdProductoEquals(productoIdProducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProveedorTipoDocumentoTipoDocumentoEquals'
	 * 
	 * @param proveedorTipoDocumentoTipoDocumento
	 */
	public static void findWhereProveedorTipoDocumentoTipoDocumentoEquals(String proveedorTipoDocumentoTipoDocumento)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findWhereProveedorTipoDocumentoTipoDocumentoEquals(proveedorTipoDocumentoTipoDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProveedorNumDocumentoEquals'
	 * 
	 * @param proveedorNumDocumento
	 */
	public static void findWhereProveedorNumDocumentoEquals(String proveedorNumDocumento)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findWhereProveedorNumDocumentoEquals(proveedorNumDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFechaCompraEquals'
	 * 
	 * @param fechaCompra
	 */
	public static void findWhereFechaCompraEquals(Date fechaCompra)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findWhereFechaCompraEquals(fechaCompra);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCanProCompradoEquals'
	 * 
	 * @param canProComprado
	 */
	public static void findWhereCanProCompradoEquals(int canProComprado)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findWhereCanProCompradoEquals(canProComprado);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePrecioPorMayorEquals'
	 * 
	 * @param precioPorMayor
	 */
	public static void findWherePrecioPorMayorEquals(float precioPorMayor)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findWherePrecioPorMayorEquals(precioPorMayor);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereObservacionesEquals'
	 * 
	 * @param observaciones
	 */
	public static void findWhereObservacionesEquals(String observaciones)
	{
		try {
			InventarioComprasDao _dao = getInventarioComprasDao();
			InventarioCompras _result[] = _dao.findWhereObservacionesEquals(observaciones);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getInventarioComprasDao'
	 * 
	 * @return InventarioComprasDao
	 */
	public static InventarioComprasDao getInventarioComprasDao()
	{
		return InventarioComprasDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(InventarioCompras dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdInventario() );
		buf.append( ", " );
		buf.append( dto.getProductoIdProducto() );
		buf.append( ", " );
		buf.append( dto.getProveedorTipoDocumentoTipoDocumento() );
		buf.append( ", " );
		buf.append( dto.getProveedorNumDocumento() );
		buf.append( ", " );
		buf.append( dto.getFechaCompra() );
		buf.append( ", " );
		buf.append( dto.getCanProComprado() );
		buf.append( ", " );
		buf.append( dto.getPrecioPorMayor() );
		buf.append( ", " );
		buf.append( dto.getObservaciones() );
		System.out.println( buf.toString() );
	}

}