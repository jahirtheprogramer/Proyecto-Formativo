package com.proyecto.marketsync.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.marketsync.service.tipo_documentoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.marketsync.model.tipo_documento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/tipo_documento")
@CrossOrigin(origins = "*")
public class tipo_documentoController {

    @Autowired
    private tipo_documentoService tipoDocumentoService;

    @GetMapping("/listar")
    public List<tipo_documento> listarTipo_documentos(@RequestParam String param) {
        return tipoDocumentoService.obtenerTodos();
    }

    @PostMapping("/crear")
    public tipo_documento crearTipoDocumento(@RequestBody tipo_documento tipoDocumento) {
        return tipoDocumentoService.guardaTipoDocumento(tipoDocumento);
    }

    @GetMapping("/id")
    public tipo_documento obtenerTipoDocumentoPorId(@RequestParam Integer id) {
        return tipoDocumentoService.obtenerTipoDocumentoPorId(id);
    }

    @PostMapping("/eliminar")
    public void eliminarTipoDocumento(@RequestBody Integer id) {
        tipoDocumentoService.eliminarTipoDocumento(id);
    }

    @PostMapping("/actualizar")
    public tipo_documento actualizarTipoDocumento(@RequestBody tipo_documento tipoDocumento) {
        return tipoDocumentoService.actualizarTipoDocumento(tipoDocumento);
    }

}
