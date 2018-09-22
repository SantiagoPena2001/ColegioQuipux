/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;
import java.util.ArrayList;

/**
 *
 * @author Verde
 */
public interface ProfesorManager {


    public void registrarProfesor(ProfesorDTO profesor);

    public ArrayList<ProfesorDTO> traerLista();

    public void eliminarProfesor(int idProfesor);

    public ProfesorDTO consultarProfesor(int idProfesor);

    public ProfesorDTO consultarProfesorPorDocumento(int idDocumento, String documento);

    public ArrayList<ProfesorDTO> consultarProfesorPorNombre(String nombreProfesor);

    public ProfesorDTO consultarProfesorLogin(String correo, int numeroDocumento);

}
