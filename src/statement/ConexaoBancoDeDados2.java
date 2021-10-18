package statement;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entities.Veiculo;

public class ConexaoBancoDeDados2 {
	
		Connection conexao = null;
		Connection con = conexao;
		Statement st = null;
		ResultSet result = null;
		
		public void AbrirConexao() throws ClassNotFoundException, SQLException {
			String driverJDBC = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/truepark";
			String usuario = "root";
			String senha = "root";
			Class.forName(driverJDBC);
			conexao = DriverManager.getConnection(url, usuario, senha);
		}
		
		public void FecharConexao() throws SQLException {
			
			result.close();
			st.close();
			conexao.close();
			
		}
		
		ArrayList<Veiculo> tabelaVeiculo = new ArrayList<Veiculo>();
		
		public ArrayList<Veiculo> AtualizarEstacionamento() {
			
			String instrucaoSQL = "SELECT * from tbl_movimentacao";
			
			try{
				AbrirConexao();
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
				FecharConexao();
				
			}catch (Exception ex) {
				System.out.println("Erro: " + ex.toString());
			}
			return tabelaVeiculo;
		}
		
			
		public boolean checkLogin(String login, String senha) {
			String instrucaoSQL = "SELECT * FROM tbl_usuario";
				try{
					AbrirConexao();
					System.out.println("Verificando usuário... ");
					st = conexao.createStatement();
					result = st.executeQuery(instrucaoSQL);
					
					while (result.next()) {
						System.out.println("a");
						if (login == result.getString(3) && senha == result.getString(4)) {
							System.out.println("b");
						return true;
						}
					}
					System.out.println("d");
				FecharConexao();
				}catch (Exception ex) {
					System.out.println("Erro: " + ex.toString());
				}
				System.out.println("e");
				return false;
		
		}
		
		
		
		public boolean checkLogin2(String login, String senha) {
			String instrucaoSQL = "SELECT * FROM tbl_usuario";
				try{
					AbrirConexao();
					System.out.println("Verificando usuário... ");
					st = conexao.createStatement();
					result = st.executeQuery(instrucaoSQL);
					
					while (result.next()) {
						System.out.println("------- a ------");
						System.out.println(result.getString(1));
						System.out.println(result.getString(2));
						System.out.println(result.getString(3));
						System.out.println(result.getString(4));
						
						String login1 = result.getString(3);
						String senha1 = result.getString(4);
						
						System.out.println(login1);
						System.out.println(senha1);
						if (login == login1) {
							if (senha == senha1) {
								return true;
							}
						}
					}
					System.out.println("d");
				FecharConexao();
				}catch (Exception ex) {
					System.out.println("Erro: " + ex.toString());
				}
				System.out.println("e");
				return false;
		
		}
		
		public boolean checkAdmin(String login, String senha) {
			String instrucaoSQL = "SELECT * from tbl_usuario";
			
				try{
					AbrirConexao();
					System.out.println("Verificando credencial... ");
					st = conexao.createStatement();
					result = st.executeQuery(instrucaoSQL);
					
					if (result.getString(3) == "admin" && result.getString(4) == senha) {
						return true;
					}
				FecharConexao();
				
				}catch (Exception ex) {
					System.out.println("Erro: " + ex.toString());
				}
				return false;
		
		}
		
		public void CheckBDD() {
			String instrucaoSQL = "SELECT*FROM tbl_usuario";
			
			try{
				AbrirConexao();
				st = conexao.createStatement();
				result = st.executeQuery(instrucaoSQL);
				
				while (result.next()) {
				System.out.println(result.getInt(1));	
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
				}
			FecharConexao();
			
			}catch (Exception ex) {
				System.out.println("Erro: " + ex.toString());
			}
			
		}
		
		public void CadastrarNovoUsuario(String usuario, String login, String senha) {
			
			
		}
		

}
