package com.proyecto.marketsync.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.marketsync.model.tipo_documento;
import com.proyecto.marketsync.repository.tipo_documentoRepository;

@Service
public class tipo_documentoService {

    @Autowired
    private tipo_documentoRepository tipoDocumentoRepository;

    public List<tipo_documento> obtenerTodos() {
        return tipoDocumentoRepository.findAll();
    }

    public tipo_documento guardaTipoDocumento(tipo_documento tipoDocumento) {
        return tipoDocumentoRepository.save(tipoDocumento);
    }

    public tipo_documento obtenerTipoDocumentoPorId(Integer id) {
        return tipoDocumentoRepository.findById(id).orElse(null);
    }

    public void eliminarTipoDocumento(Integer id) {
        tipoDocumentoRepository.deleteById(id);
    }

    public tipo_documento actualizarTipoDocumento(tipo_documento tipoDocumento) {
        return tipoDocumentoRepository.save(tipoDocumento);
    }
}
