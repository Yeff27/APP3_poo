package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImp implements EstudianteServicio{


    @Autowired
    private EstudianteRepositorio repositorio;
    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        return (List<Estudiante>) repositorio.findAll();
    }

    @Override
    public Estudiante GuardarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return repositorio.findById(id).get();
    }
    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }
    @Override
    public void eliminarEstudiante(Long id) {
        repositorio.deleteById(id);
    }

}
