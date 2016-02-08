/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.modelo.factory;

import java.sql.Connection;
import edu.co.sena.ejemplodao.modelo.dao.*;
import edu.co.sena.ejemplodao.modelo.jdbc.*;

public class CuentaDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CuentaDao
	 */
	public static CuentaDao create()
	{
		return new CuentaDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CuentaDao
	 */
	public static CuentaDao create(Connection conn)
	{
		return new CuentaDaoImpl( conn );
	}

}