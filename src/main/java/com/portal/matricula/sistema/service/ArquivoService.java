package com.portal.matricula.sistema.service;

import com.portal.matricula.sistema.model.Arquivo;
import com.portal.matricula.sistema.repository.ArquivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArquivoService {

    private final ArquivoRepository arquivoRepository;

    @Autowired
    public ArquivoService(ArquivoRepository arquivoRepository) {
        this.arquivoRepository = arquivoRepository;
    }

    public Arquivo getArquivoById(Integer id) {
        Optional<Arquivo> optionalArquivo = arquivoRepository.findById(id);
        return optionalArquivo.orElse(null);
    }

    public List<Arquivo> getAllArquivos() {
        return arquivoRepository.findAll();
    }

    public Arquivo uploadArquivo(String nome, String tipo, Integer alunoId, byte[] conteudo) {
        Arquivo arquivo = new Arquivo();
        arquivo.setNome(nome);
        arquivo.setTipo(tipo);
        arquivo.setAlunoId(alunoId);
        arquivo.setConteudo(conteudo);
        return arquivoRepository.save(arquivo);
    }

    public void deleteArquivo(Integer id) {
        arquivoRepository.deleteById(id);
    }
}

