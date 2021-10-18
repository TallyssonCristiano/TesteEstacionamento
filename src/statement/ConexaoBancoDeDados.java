package statement;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entities.Usuario;
import entities.Veiculo;

public class ConexaoBancoDeDados {
	
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
		ArrayList<Usuario> tabelaUsuario = new ArrayList<Usuario>();
		
		public ArrayList<Veiculo> AtualizarEstacionamento() {
			
			String instrucaoSQL = "SELECT * from tbl_movimentacao";
			
			try{
				AbrirConexao();
				System.out.println("Atualizando veículos estacionados... ");
				st = conexao.createStatement();
				result = st.executeQuery(instrucaoSQL);
				int i = 0;
				while (result.next()) {
					Veiculo veiculo = new Veiculo(result.getInt(1),
					result.getString(2),
					result.getString(3),
					result.getDate(4),
					result.getDate(5),
					result.getFloat(6),
					result.getFloat(7));
					System.out.println("teste 1 " + veiculo);
					tabelaVeiculo.add(i, veiculo);
					System.out.println("teste 2 " + tabelaVeiculo);
					System.out.println(i);
					i++;
					System.out.println(i);
				}
				FecharConexao();
				
			}catch (Exception ex) {
				System.out.println("Erro: " + ex.toString());
			}
			return tabelaVeiculo;
		}
		
		
		public boolean checkLogin(String login, String senha) {
			String instrucaoSQL = "SELECT * from tbl_usuario";
			
				try{
					AbrirConexao();
					System.out.println("Conectando ao sistema... ");
					st = conexao.createStatement();
					result = st.executeQuery(instrucaoSQL);
					
					while(result.next()) {
						System.out.println("entrou no while");
						System.out.println(login);
						System.out.println(senha);
						String check1 = result.getString(3).intern();
						String check2 = result.getString(4).intern();
						System.out.println(check1);
						System.out.println(check2);
					if (login.intern() == check1 && senha.intern() == check2) {
						System.out.println("entrou no if");
						return true;
					}
					}
				FecharConexao();
				
				}catch (Exception ex) {
					System.out.println("Erro: " + ex.toString());
				}
				return false;
		
		}
		
		public boolean checkAdmin(String login, String senha) {
			String instrucaoSQL = "SELECT * from tbl_usuario";
			
				try{
					AbrirConexao();
					System.out.println("Verificando credencial... ");
					st = conexao.createStatement();
					result = st.executeQuery(instrucaoSQL);
					
					while(result.next()) {
					if (login.intern() == "admin" && senha.intern() == result.getString(4).intern()) {
						return true;
					}
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
			String instrucaoSQL = "insert into tbl_usuario('usuario', 'login', 'senha') VALUES (";
			
			try{
				AbrirConexao();
				System.out.println("Inserindo novo usuário... ");
				st = conexao.createStatement();
				instrucaoSQL = instrucaoSQL + "'" + usuario.toString() + "', '" + login.toString() + "', '" + senha.toString() + "')";
				result = st.executeQuery(instrucaoSQL);
				
			FecharConexao();
			}catch (Exception ex) {
				System.out.println("Erro: " + ex.toString());
			}
			
		}	
		
		public void CadastrarNovoVeiculo(Veiculo veiculo) {
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
			Date date = new Date();
			try{
				AbrirConexao();
				System.out.println("Inserindo novo veículo... ");
				st = conexao.createStatement();
				String instrucaoSQL = "insert into tbl_movimentacao('placa', 'modelo', 'data_entrada') VALUES ('"
									  +  veiculo.getPlaca()
									  + "', '" + veiculo.getModelo()
									  + "', '" + dateFormat.format(date)
									  + "')";
				result = st.executeQuery(instrucaoSQL + "'" + veiculo.getPlaca() );
				
			FecharConexao();
			}catch (Exception ex) {
				System.out.println("Erro: " + ex.toString());
			}
			
		}


}
