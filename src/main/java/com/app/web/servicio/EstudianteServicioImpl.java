package com.app.web.servicio;

import com.app.web.entidad.Estudiante;

import java.util.List;

public class EstudianteServicioImpl implements EstudianteServicio {
    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        return List.of();
    }

    @Override
    public Estudiante GuardarEstudiante(Estudiante estudiante) {
        return null;
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return null;
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return null;
    }

    @Override
    public void eliminarEstudiante(Long id) {

    }
}
