package com.portal.matricula.sistema.controller;

import com.portal.matricula.sistema.model.Arquivo;
import com.portal.matricula.sistema.service.ArquivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/arquivos")
public class ArquivoController {

    private final ArquivoService arquivoService;

    @Autowired
    public ArquivoController(ArquivoService arquivoService) {
        this.arquivoService = arquivoService;
    }

    @GetMapping("/{id}")
    public Arquivo getArquivoById(@PathVariable Integer id) {
        return arquivoService.getArquivoById(id);
    }

    @GetMapping("/all")
    public List<Arquivo> getAllArquivos() {
        return arquivoService.getAllArquivos();
    }

    @PostMapping("/upload")
    public Arquivo uploadArquivo(@RequestParam("file") MultipartFile file,
                                 @RequestParam("nome") String nome,
                                 @RequestParam("tipo") String tipo,
                                 @RequestParam("alunoId") Integer alunoId) throws IOException {
        byte[] conteudo = file.getBytes();
        return arquivoService.uploadArquivo(nome, tipo, alunoId, conteudo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteArquivo(@PathVariable Integer id) {
        arquivoService.deleteArquivo(id);
    }
}
