/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploejb1.negocio.ejb;

import javax.ejb.Asynchronous;
import javax.ejb.Local;

/**
 *
 * @author hernando
 */
@Local
@Asynchronous
public interface NewSessionBeanLocal {
     public String hola();
}
