/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.GradoDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface GradoManager {

    public void registrarGrado(GradoDTO grado);

    public void eliminarGrado(int idGrado);

    public GradoDTO consultarGrado(int idGrado);

    public ArrayList<GradoDTO> traerListaGrados();

}
