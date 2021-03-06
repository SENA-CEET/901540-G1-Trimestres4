/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.modelo.dto;

import edu.co.sena.ejemplodao.modelo.dao.*;
import edu.co.sena.ejemplodao.modelo.factory.*;
import edu.co.sena.ejemplodao.modelo.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Municipio implements Serializable
{
	/** 
	 * This attribute maps to the column ID_MUNICIPIO in the municipio table.
	 */
	protected int idMunicipio;

	/** 
	 * This attribute maps to the column NOMNBRE_MUNICIPIO in the municipio table.
	 */
	protected String nomnbreMunicipio;

	/** 
	 * This attribute maps to the column DEPARTAMENTO_ID_DEPARTAMENTO in the municipio table.
	 */
	protected int departamentoIdDepartamento;

	/**
	 * Method 'Municipio'
	 * 
	 */
	public Municipio()
	{
	}

	/**
	 * Method 'getIdMunicipio'
	 * 
	 * @return int
	 */
	public int getIdMunicipio()
	{
		return idMunicipio;
	}

	/**
	 * Method 'setIdMunicipio'
	 * 
	 * @param idMunicipio
	 */
	public void setIdMunicipio(int idMunicipio)
	{
		this.idMunicipio = idMunicipio;
	}

	/**
	 * Method 'getNomnbreMunicipio'
	 * 
	 * @return String
	 */
	public String getNomnbreMunicipio()
	{
		return nomnbreMunicipio;
	}

	/**
	 * Method 'setNomnbreMunicipio'
	 * 
	 * @param nomnbreMunicipio
	 */
	public void setNomnbreMunicipio(String nomnbreMunicipio)
	{
		this.nomnbreMunicipio = nomnbreMunicipio;
	}

	/**
	 * Method 'getDepartamentoIdDepartamento'
	 * 
	 * @return int
	 */
	public int getDepartamentoIdDepartamento()
	{
		return departamentoIdDepartamento;
	}

	/**
	 * Method 'setDepartamentoIdDepartamento'
	 * 
	 * @param departamentoIdDepartamento
	 */
	public void setDepartamentoIdDepartamento(int departamentoIdDepartamento)
	{
		this.departamentoIdDepartamento = departamentoIdDepartamento;
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
		
		if (!(_other instanceof Municipio)) {
			return false;
		}
		
		final Municipio _cast = (Municipio) _other;
		if (idMunicipio != _cast.idMunicipio) {
			return false;
		}
		
		if (nomnbreMunicipio == null ? _cast.nomnbreMunicipio != nomnbreMunicipio : !nomnbreMunicipio.equals( _cast.nomnbreMunicipio )) {
			return false;
		}
		
		if (departamentoIdDepartamento != _cast.departamentoIdDepartamento) {
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
		_hashCode = 29 * _hashCode + idMunicipio;
		if (nomnbreMunicipio != null) {
			_hashCode = 29 * _hashCode + nomnbreMunicipio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + departamentoIdDepartamento;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return MunicipioPk
	 */
	public MunicipioPk createPk()
	{
		return new MunicipioPk(idMunicipio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.modelo.dto.Municipio: " );
		ret.append( "idMunicipio=" + idMunicipio );
		ret.append( ", nomnbreMunicipio=" + nomnbreMunicipio );
		ret.append( ", departamentoIdDepartamento=" + departamentoIdDepartamento );
		return ret.toString();
	}

}
