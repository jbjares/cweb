package br.com.cweb.cadastro.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cweb.cadastro.persistence.dao.CidadeDAO;
import br.com.cweb.cadastro.persistence.dao.EstadoDAO;
import br.com.cweb.cadastro.persistence.entity.Atribuicao;
import br.com.cweb.cadastro.persistence.entity.Cidade;
import br.com.cweb.cadastro.persistence.entity.Estado;
import br.com.cweb.core.persistence.exception.DaoException;

@Service("localizacaoService")
public class LocalizacaoServiceImpl implements LocalizacaoService{

	@Autowired
	private EstadoDAO estadoDAO;
	
	@Autowired
	private CidadeDAO cidadeDAO;
	
	public List<Estado> recuperarEstados() {
		try {
			return estadoDAO.findAll();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
	}
	
	public List<Cidade> recuperarCidades() {
		try {
			return cidadeDAO.findAll();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
	}
	
	public List<Cidade> recuperarCidades(Estado estado) {
		try {
			return cidadeDAO.findAll(estado);
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
	}

	public List<Cidade> recuperarCidadesPorEstado(Long idEstado) {
		try {
			return cidadeDAO.findAll(estadoDAO.findById(idEstado));
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
	}

	public List<Estado> recuperarEstados(String query) {
		
		List<Estado> result;
		
		try {
			
			if(!StringUtils.isBlank(query)){
				result = estadoDAO.findAll(query);
			}
			else{
				result = estadoDAO.findAll();
			}
		} catch (DaoException e) {
			throw new RuntimeException(e);
		}
		return result;
	}


}
