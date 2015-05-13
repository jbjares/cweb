package br.com.cweb.core.persistence.util;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Category;

public class JdbcUtils {
	private static final Category LOG=Category.getInstance(JdbcUtils.class);

	public static void fecharEmSilencio(ResultSet rs){
		if(rs==null){
			return;
		}
		try{
			rs.close();
		}
		catch(SQLException e){
			LOG.error("Erro ao tentar fechar ResultSet",e);
		}
	}

	public static void fecharEmSilencio(PreparedStatement ps){
		if(ps==null){
			return;
		}
		try{
			ps.close();
		}
		catch(SQLException e){
			LOG.error("Erro ao tentar fechar PreparedStatement",e);
		}
	}
}