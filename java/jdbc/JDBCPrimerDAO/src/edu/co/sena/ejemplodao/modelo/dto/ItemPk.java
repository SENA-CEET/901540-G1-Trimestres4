/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.modelo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the item table.
 */
public class ItemPk implements Serializable
{
	protected String productoIdProducto;

	protected int pedidoFacturaIdFactura;

	/** 
	 * This attribute represents whether the primitive attribute pedidoFacturaIdFactura is null.
	 */
	protected boolean pedidoFacturaIdFacturaNull;

	/** 
	 * Sets the value of productoIdProducto
	 */
	public void setProductoIdProducto(String productoIdProducto)
	{
		this.productoIdProducto = productoIdProducto;
	}

	/** 
	 * Gets the value of productoIdProducto
	 */
	public String getProductoIdProducto()
	{
		return productoIdProducto;
	}

	/** 
	 * Sets the value of pedidoFacturaIdFactura
	 */
	public void setPedidoFacturaIdFactura(int pedidoFacturaIdFactura)
	{
		this.pedidoFacturaIdFactura = pedidoFacturaIdFactura;
	}

	/** 
	 * Gets the value of pedidoFacturaIdFactura
	 */
	public int getPedidoFacturaIdFactura()
	{
		return pedidoFacturaIdFactura;
	}

	/**
	 * Method 'ItemPk'
	 * 
	 */
	public ItemPk()
	{
	}

	/**
	 * Method 'ItemPk'
	 * 
	 * @param productoIdProducto
	 * @param pedidoFacturaIdFactura
	 */
	public ItemPk(final String productoIdProducto, final int pedidoFacturaIdFactura)
	{
		this.productoIdProducto = productoIdProducto;
		this.pedidoFacturaIdFactura = pedidoFacturaIdFactura;
	}

	/** 
	 * Sets the value of pedidoFacturaIdFacturaNull
	 */
	public void setPedidoFacturaIdFacturaNull(boolean pedidoFacturaIdFacturaNull)
	{
		this.pedidoFacturaIdFacturaNull = pedidoFacturaIdFacturaNull;
	}

	/** 
	 * Gets the value of pedidoFacturaIdFacturaNull
	 */
	public boolean isPedidoFacturaIdFacturaNull()
	{
		return pedidoFacturaIdFacturaNull;
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
		
		if (!(_other instanceof ItemPk)) {
			return false;
		}
		
		final ItemPk _cast = (ItemPk) _other;
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (pedidoFacturaIdFactura != _cast.pedidoFacturaIdFactura) {
			return false;
		}
		
		if (pedidoFacturaIdFacturaNull != _cast.pedidoFacturaIdFacturaNull) {
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
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + pedidoFacturaIdFactura;
		_hashCode = 29 * _hashCode + (pedidoFacturaIdFacturaNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.modelo.dto.ItemPk: " );
		ret.append( "productoIdProducto=" + productoIdProducto );
		ret.append( ", pedidoFacturaIdFactura=" + pedidoFacturaIdFactura );
		return ret.toString();
	}

}
