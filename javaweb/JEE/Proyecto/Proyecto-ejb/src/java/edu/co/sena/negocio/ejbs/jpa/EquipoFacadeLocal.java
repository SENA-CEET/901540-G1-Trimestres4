/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.negocio.ejbs.jpa;

import edu.co.sena.integracion.entities.Equipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hernando
 */
@Local
public interface EquipoFacadeLocal {

    void create(Equipo equipo);

    void edit(Equipo equipo);

    void remove(Equipo equipo);

    Equipo find(Object id);

    List<Equipo> findAll();

    int count();
    
}
