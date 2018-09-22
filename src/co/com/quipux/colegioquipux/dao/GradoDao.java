/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.GradoEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface GradoDao {

    /*aunque realmente se podría considerar que los grados
    en un colegio ya estan definidos por defecto y que no es
    necesario crear una entidad como tal, ni eliminarlos ni nada
    Igual los pondre porque no se tiene toda la información sobre 
    el asunto, pero dejo esto a modo de comentario porque es una
    posibilidad
     */

    public void registrarGrado(GradoEntity grado);

    public void eliminarGrado(int idGrado);

    public GradoEntity consultarGrado(int idGrado);
    
    public ArrayList<GradoEntity> traerListaGrados();

}
