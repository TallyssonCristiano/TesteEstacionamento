package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import entities.Veiculo;

public class ConexaoBancoDeDados {
	
	static String driverJDBC = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/SistemaEstacionamento";
	static String usuario = "root";
	static String senha = "root";
		
		Connection conexao = null;
		Connection con = conexao;
		Statement st = null;
		ResultSet result = null;
		
		ArrayList<Veiculo> tabelaVeiculo = new ArrayList<Veiculo>();
		
		public ArrayList<Veiculo> AtualizarEstacionamento() {
			
			String instrucaoSQL = "SELECT * from tbl_movimentacao";
			
			try{
				Class.forName(driverJDBC);
				conexao = DriverManager.getConnection(url, usuario, senha);
				System.out.println("Atualizando veículos estacionados... ");
				st = conexao.createStatement();
				result = st.executeQuery(instrucaoSQL);
				while (result.next()) {
					int i = 0;
					Veiculo veiculo = new Veiculo(result.getInt(1),
					result.getString(2),
					result.getString(3),
					result.getDate(4),
					result.getDate(5),
					result.getFloat(6),
					result.getFloat(7));
						
					tabelaVeiculo.add(i, veiculo);
					i++;
				}
				result.close();
				st.close();conexao.close();
				
			}catch (Exception ex) {
				System.out.println("Erro: " + ex.toString());
			}
			return tabelaVeiculo;
		}
		
		public boolean checkLogin(String usuario, String senha) {
			String instrucaoSQL = "SELECT login, senha from tbl_usuario";
			
				try{
					Class.forName(driverJDBC);
					conexao = DriverManager.getConnection(url, usuario, senha);
					System.out.println("Verificando usuário... ");
					st = conexao.createStatement();
					result = st.executeQuery(instrucaoSQL);
					if (result.getString(3) == usuario && result.getString(4) == senha)
						return true;
				result.close();
				st.close();conexao.close();
		
				}catch (Exception ex) {
					System.out.println("Erro: " + ex.toString());
				}
				return false;
		
		}

}
