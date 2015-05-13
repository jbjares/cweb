package br.com.cweb.cadastro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cweb.cadastro.persistence.dao.PerfilComissaoDAO;
import br.com.cweb.cadastro.persistence.entity.PerfilComissao;
import br.com.cweb.core.persistence.exception.DaoException;

@Service("comissaoService")
public class ComissaoServiceImpl implements ComissaoService{

	@Autowired
	private PerfilComissaoDAO perfilComissaoDAO;

	public List<PerfilComissao> recuperarPerfisComissao() {
		try {
			return perfilComissaoDAO.findAll();
		} catch (DaoException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
	}

	
}
