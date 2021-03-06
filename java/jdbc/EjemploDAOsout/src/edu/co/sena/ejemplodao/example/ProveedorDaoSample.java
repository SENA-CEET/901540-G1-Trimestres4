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
import edu.co.sena.ejemplodao.dao.ProveedorDao;
import edu.co.sena.ejemplodao.dto.Proveedor;
import edu.co.sena.ejemplodao.exceptions.ProveedorDaoException;
import edu.co.sena.ejemplodao.factory.ProveedorDaoFactory;

public class ProveedorDaoSample
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
		// findByTipoDocumento("");
		// findWhereTipoDocumentoTipoDocumentoEquals("");
		// findWhereNumDocumentoEquals("");
		// findWhereNombreProveedorEquals("");
		// findWhereCorreoEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ProveedorDao _dao = getProveedorDao();
			Proveedor _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByTipoDocumento'
	 * 
	 * @param tipoDocumentoTipoDocumento
	 */
	public static void findByTipoDocumento(String tipoDocumentoTipoDocumento)
	{
		try {
			ProveedorDao _dao = getProveedorDao();
			Proveedor _result[] = _dao.findByTipoDocumento(tipoDocumentoTipoDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTipoDocumentoTipoDocumentoEquals'
	 * 
	 * @param tipoDocumentoTipoDocumento
	 */
	public static void findWhereTipoDocumentoTipoDocumentoEquals(String tipoDocumentoTipoDocumento)
	{
		try {
			ProveedorDao _dao = getProveedorDao();
			Proveedor _result[] = _dao.findWhereTipoDocumentoTipoDocumentoEquals(tipoDocumentoTipoDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNumDocumentoEquals'
	 * 
	 * @param numDocumento
	 */
	public static void findWhereNumDocumentoEquals(String numDocumento)
	{
		try {
			ProveedorDao _dao = getProveedorDao();
			Proveedor _result[] = _dao.findWhereNumDocumentoEquals(numDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNombreProveedorEquals'
	 * 
	 * @param nombreProveedor
	 */
	public static void findWhereNombreProveedorEquals(String nombreProveedor)
	{
		try {
			ProveedorDao _dao = getProveedorDao();
			Proveedor _result[] = _dao.findWhereNombreProveedorEquals(nombreProveedor);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCorreoEquals'
	 * 
	 * @param correo
	 */
	public static void findWhereCorreoEquals(String correo)
	{
		try {
			ProveedorDao _dao = getProveedorDao();
			Proveedor _result[] = _dao.findWhereCorreoEquals(correo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getProveedorDao'
	 * 
	 * @return ProveedorDao
	 */
	public static ProveedorDao getProveedorDao()
	{
		return ProveedorDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Proveedor dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getTipoDocumentoTipoDocumento() );
		buf.append( ", " );
		buf.append( dto.getNumDocumento() );
		buf.append( ", " );
		buf.append( dto.getNombreProveedor() );
		buf.append( ", " );
		buf.append( dto.getCorreo() );
		System.out.println( buf.toString() );
	}

}
