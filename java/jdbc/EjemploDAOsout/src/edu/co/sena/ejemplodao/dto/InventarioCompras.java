/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.dto;

import edu.co.sena.ejemplodao.dao.*;
import edu.co.sena.ejemplodao.factory.*;
import edu.co.sena.ejemplodao.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class InventarioCompras implements Serializable
{
	/** 
	 * This attribute maps to the column ID_INVENTARIO in the inventario_compras table.
	 */
	protected int idInventario;

	/** 
	 * This attribute maps to the column PRODUCTO_ID_PRODUCTO in the inventario_compras table.
	 */
	protected String productoIdProducto;

	/** 
	 * This attribute maps to the column PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO in the inventario_compras table.
	 */
	protected String proveedorTipoDocumentoTipoDocumento;

	/** 
	 * This attribute maps to the column PROVEEDOR_NUM_DOCUMENTO in the inventario_compras table.
	 */
	protected String proveedorNumDocumento;

	/** 
	 * This attribute maps to the column FECHA_COMPRA in the inventario_compras table.
	 */
	protected Date fechaCompra;

	/** 
	 * This attribute maps to the column CAN_PRO_COMPRADO in the inventario_compras table.
	 */
	protected int canProComprado;

	/** 
	 * This attribute represents whether the primitive attribute canProComprado is null.
	 */
	protected boolean canProCompradoNull = true;

	/** 
	 * This attribute maps to the column PRECIO_POR_MAYOR in the inventario_compras table.
	 */
	protected float precioPorMayor;

	/** 
	 * This attribute represents whether the primitive attribute precioPorMayor is null.
	 */
	protected boolean precioPorMayorNull = true;

	/** 
	 * This attribute maps to the column OBSERVACIONES in the inventario_compras table.
	 */
	protected String observaciones;

	/**
	 * Method 'InventarioCompras'
	 * 
	 */
	public InventarioCompras()
	{
	}

	/**
	 * Method 'getIdInventario'
	 * 
	 * @return int
	 */
	public int getIdInventario()
	{
		return idInventario;
	}

	/**
	 * Method 'setIdInventario'
	 * 
	 * @param idInventario
	 */
	public void setIdInventario(int idInventario)
	{
		this.idInventario = idInventario;
	}

	/**
	 * Method 'getProductoIdProducto'
	 * 
	 * @return String
	 */
	public String getProductoIdProducto()
	{
		return productoIdProducto;
	}

	/**
	 * Method 'setProductoIdProducto'
	 * 
	 * @param productoIdProducto
	 */
	public void setProductoIdProducto(String productoIdProducto)
	{
		this.productoIdProducto = productoIdProducto;
	}

	/**
	 * Method 'getProveedorTipoDocumentoTipoDocumento'
	 * 
	 * @return String
	 */
	public String getProveedorTipoDocumentoTipoDocumento()
	{
		return proveedorTipoDocumentoTipoDocumento;
	}

	/**
	 * Method 'setProveedorTipoDocumentoTipoDocumento'
	 * 
	 * @param proveedorTipoDocumentoTipoDocumento
	 */
	public void setProveedorTipoDocumentoTipoDocumento(String proveedorTipoDocumentoTipoDocumento)
	{
		this.proveedorTipoDocumentoTipoDocumento = proveedorTipoDocumentoTipoDocumento;
	}

	/**
	 * Method 'getProveedorNumDocumento'
	 * 
	 * @return String
	 */
	public String getProveedorNumDocumento()
	{
		return proveedorNumDocumento;
	}

	/**
	 * Method 'setProveedorNumDocumento'
	 * 
	 * @param proveedorNumDocumento
	 */
	public void setProveedorNumDocumento(String proveedorNumDocumento)
	{
		this.proveedorNumDocumento = proveedorNumDocumento;
	}

	/**
	 * Method 'getFechaCompra'
	 * 
	 * @return Date
	 */
	public Date getFechaCompra()
	{
		return fechaCompra;
	}

	/**
	 * Method 'setFechaCompra'
	 * 
	 * @param fechaCompra
	 */
	public void setFechaCompra(Date fechaCompra)
	{
		this.fechaCompra = fechaCompra;
	}

	/**
	 * Method 'getCanProComprado'
	 * 
	 * @return int
	 */
	public int getCanProComprado()
	{
		return canProComprado;
	}

	/**
	 * Method 'setCanProComprado'
	 * 
	 * @param canProComprado
	 */
	public void setCanProComprado(int canProComprado)
	{
		this.canProComprado = canProComprado;
		this.canProCompradoNull = false;
	}

	/**
	 * Method 'setCanProCompradoNull'
	 * 
	 * @param value
	 */
	public void setCanProCompradoNull(boolean value)
	{
		this.canProCompradoNull = value;
	}

	/**
	 * Method 'isCanProCompradoNull'
	 * 
	 * @return boolean
	 */
	public boolean isCanProCompradoNull()
	{
		return canProCompradoNull;
	}

	/**
	 * Method 'getPrecioPorMayor'
	 * 
	 * @return float
	 */
	public float getPrecioPorMayor()
	{
		return precioPorMayor;
	}

	/**
	 * Method 'setPrecioPorMayor'
	 * 
	 * @param precioPorMayor
	 */
	public void setPrecioPorMayor(float precioPorMayor)
	{
		this.precioPorMayor = precioPorMayor;
		this.precioPorMayorNull = false;
	}

	/**
	 * Method 'setPrecioPorMayorNull'
	 * 
	 * @param value
	 */
	public void setPrecioPorMayorNull(boolean value)
	{
		this.precioPorMayorNull = value;
	}

	/**
	 * Method 'isPrecioPorMayorNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioPorMayorNull()
	{
		return precioPorMayorNull;
	}

	/**
	 * Method 'getObservaciones'
	 * 
	 * @return String
	 */
	public String getObservaciones()
	{
		return observaciones;
	}

	/**
	 * Method 'setObservaciones'
	 * 
	 * @param observaciones
	 */
	public void setObservaciones(String observaciones)
	{
		this.observaciones = observaciones;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof InventarioCompras)) {
			return false;
		}
		
		final InventarioCompras _cast = (InventarioCompras) _other;
		if (idInventario != _cast.idInventario) {
			return false;
		}
		
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (proveedorTipoDocumentoTipoDocumento == null ? _cast.proveedorTipoDocumentoTipoDocumento != proveedorTipoDocumentoTipoDocumento : !proveedorTipoDocumentoTipoDocumento.equals( _cast.proveedorTipoDocumentoTipoDocumento )) {
			return false;
		}
		
		if (proveedorNumDocumento == null ? _cast.proveedorNumDocumento != proveedorNumDocumento : !proveedorNumDocumento.equals( _cast.proveedorNumDocumento )) {
			return false;
		}
		
		if (fechaCompra == null ? _cast.fechaCompra != fechaCompra : !fechaCompra.equals( _cast.fechaCompra )) {
			return false;
		}
		
		if (canProComprado != _cast.canProComprado) {
			return false;
		}
		
		if (canProCompradoNull != _cast.canProCompradoNull) {
			return false;
		}
		
		if (precioPorMayor != _cast.precioPorMayor) {
			return false;
		}
		
		if (precioPorMayorNull != _cast.precioPorMayorNull) {
			return false;
		}
		
		if (observaciones == null ? _cast.observaciones != observaciones : !observaciones.equals( _cast.observaciones )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idInventario;
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		if (proveedorTipoDocumentoTipoDocumento != null) {
			_hashCode = 29 * _hashCode + proveedorTipoDocumentoTipoDocumento.hashCode();
		}
		
		if (proveedorNumDocumento != null) {
			_hashCode = 29 * _hashCode + proveedorNumDocumento.hashCode();
		}
		
		if (fechaCompra != null) {
			_hashCode = 29 * _hashCode + fechaCompra.hashCode();
		}
		
		_hashCode = 29 * _hashCode + canProComprado;
		_hashCode = 29 * _hashCode + (canProCompradoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(precioPorMayor);
		_hashCode = 29 * _hashCode + (precioPorMayorNull ? 1 : 0);
		if (observaciones != null) {
			_hashCode = 29 * _hashCode + observaciones.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return InventarioComprasPk
	 */
	public InventarioComprasPk createPk()
	{
		return new InventarioComprasPk(idInventario, productoIdProducto, proveedorTipoDocumentoTipoDocumento, proveedorNumDocumento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.dto.InventarioCompras: " );
		ret.append( "idInventario=" + idInventario );
		ret.append( ", productoIdProducto=" + productoIdProducto );
		ret.append( ", proveedorTipoDocumentoTipoDocumento=" + proveedorTipoDocumentoTipoDocumento );
		ret.append( ", proveedorNumDocumento=" + proveedorNumDocumento );
		ret.append( ", fechaCompra=" + fechaCompra );
		ret.append( ", canProComprado=" + canProComprado );
		ret.append( ", precioPorMayor=" + precioPorMayor );
		ret.append( ", observaciones=" + observaciones );
		return ret.toString();
	}

}
