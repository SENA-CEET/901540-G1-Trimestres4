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

public class Producto implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PRODUCTO in the producto table.
	 */
	protected String idProducto;

	/** 
	 * This attribute maps to the column NOMBRE_PRODUCTO in the producto table.
	 */
	protected String nombreProducto;

	/** 
	 * This attribute maps to the column PRECIO_DETAl in the producto table.
	 */
	protected double precioDetal;

	/** 
	 * This attribute maps to the column IMAGEN in the producto table.
	 */
	protected byte[] imagen;

	/** 
	 * This attribute maps to the column CANTIDAD in the producto table.
	 */
	protected float cantidad;

	/** 
	 * This attribute represents whether the primitive attribute cantidad is null.
	 */
	protected boolean cantidadNull = true;

	/** 
	 * This attribute maps to the column ACTIVO in the producto table.
	 */
	protected short activo;

	/** 
	 * This attribute maps to the column CATEGORIA_ID_CATEGORIA in the producto table.
	 */
	protected int categoriaIdCategoria;

	/** 
	 * This attribute maps to the column CATALOGO_ID_CATALOGO in the producto table.
	 */
	protected int catalogoIdCatalogo;

	/**
	 * Method 'Producto'
	 * 
	 */
	public Producto()
	{
	}

	/**
	 * Method 'getIdProducto'
	 * 
	 * @return String
	 */
	public String getIdProducto()
	{
		return idProducto;
	}

	/**
	 * Method 'setIdProducto'
	 * 
	 * @param idProducto
	 */
	public void setIdProducto(String idProducto)
	{
		this.idProducto = idProducto;
	}

	/**
	 * Method 'getNombreProducto'
	 * 
	 * @return String
	 */
	public String getNombreProducto()
	{
		return nombreProducto;
	}

	/**
	 * Method 'setNombreProducto'
	 * 
	 * @param nombreProducto
	 */
	public void setNombreProducto(String nombreProducto)
	{
		this.nombreProducto = nombreProducto;
	}

	/**
	 * Method 'getPrecioDetal'
	 * 
	 * @return double
	 */
	public double getPrecioDetal()
	{
		return precioDetal;
	}

	/**
	 * Method 'setPrecioDetal'
	 * 
	 * @param precioDetal
	 */
	public void setPrecioDetal(double precioDetal)
	{
		this.precioDetal = precioDetal;
	}

	/**
	 * Method 'getImagen'
	 * 
	 * @return byte[]
	 */
	public byte[] getImagen()
	{
		return imagen;
	}

	/**
	 * Method 'setImagen'
	 * 
	 * @param imagen
	 */
	public void setImagen(byte[] imagen)
	{
		this.imagen = imagen;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return float
	 */
	public float getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(float cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadNull = false;
	}

	/**
	 * Method 'setCantidadNull'
	 * 
	 * @param value
	 */
	public void setCantidadNull(boolean value)
	{
		this.cantidadNull = value;
	}

	/**
	 * Method 'isCantidadNull'
	 * 
	 * @return boolean
	 */
	public boolean isCantidadNull()
	{
		return cantidadNull;
	}

	/**
	 * Method 'getActivo'
	 * 
	 * @return short
	 */
	public short getActivo()
	{
		return activo;
	}

	/**
	 * Method 'setActivo'
	 * 
	 * @param activo
	 */
	public void setActivo(short activo)
	{
		this.activo = activo;
	}

	/**
	 * Method 'getCategoriaIdCategoria'
	 * 
	 * @return int
	 */
	public int getCategoriaIdCategoria()
	{
		return categoriaIdCategoria;
	}

	/**
	 * Method 'setCategoriaIdCategoria'
	 * 
	 * @param categoriaIdCategoria
	 */
	public void setCategoriaIdCategoria(int categoriaIdCategoria)
	{
		this.categoriaIdCategoria = categoriaIdCategoria;
	}

	/**
	 * Method 'getCatalogoIdCatalogo'
	 * 
	 * @return int
	 */
	public int getCatalogoIdCatalogo()
	{
		return catalogoIdCatalogo;
	}

	/**
	 * Method 'setCatalogoIdCatalogo'
	 * 
	 * @param catalogoIdCatalogo
	 */
	public void setCatalogoIdCatalogo(int catalogoIdCatalogo)
	{
		this.catalogoIdCatalogo = catalogoIdCatalogo;
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
		
		if (!(_other instanceof Producto)) {
			return false;
		}
		
		final Producto _cast = (Producto) _other;
		if (idProducto == null ? _cast.idProducto != idProducto : !idProducto.equals( _cast.idProducto )) {
			return false;
		}
		
		if (nombreProducto == null ? _cast.nombreProducto != nombreProducto : !nombreProducto.equals( _cast.nombreProducto )) {
			return false;
		}
		
		if (precioDetal != _cast.precioDetal) {
			return false;
		}
		
		if (imagen == null ? _cast.imagen != imagen : !imagen.equals( _cast.imagen )) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadNull != _cast.cantidadNull) {
			return false;
		}
		
		if (activo != _cast.activo) {
			return false;
		}
		
		if (categoriaIdCategoria != _cast.categoriaIdCategoria) {
			return false;
		}
		
		if (catalogoIdCatalogo != _cast.catalogoIdCatalogo) {
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
		if (idProducto != null) {
			_hashCode = 29 * _hashCode + idProducto.hashCode();
		}
		
		if (nombreProducto != null) {
			_hashCode = 29 * _hashCode + nombreProducto.hashCode();
		}
		
		long temp_precioDetal = Double.doubleToLongBits(precioDetal);
		_hashCode = 29 * _hashCode + (int) (temp_precioDetal ^ (temp_precioDetal >>> 32));
		if (imagen != null) {
			_hashCode = 29 * _hashCode + imagen.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(cantidad);
		_hashCode = 29 * _hashCode + (cantidadNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) activo;
		_hashCode = 29 * _hashCode + categoriaIdCategoria;
		_hashCode = 29 * _hashCode + catalogoIdCatalogo;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ProductoPk
	 */
	public ProductoPk createPk()
	{
		return new ProductoPk(idProducto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.dto.Producto: " );
		ret.append( "idProducto=" + idProducto );
		ret.append( ", nombreProducto=" + nombreProducto );
		ret.append( ", precioDetal=" + precioDetal );
		ret.append( ", imagen=" + imagen );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", activo=" + activo );
		ret.append( ", categoriaIdCategoria=" + categoriaIdCategoria );
		ret.append( ", catalogoIdCatalogo=" + catalogoIdCatalogo );
		return ret.toString();
	}

}
