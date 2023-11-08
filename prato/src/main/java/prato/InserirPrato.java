import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InserirPrato extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // Obter os dados do formulário
    String nome = request.getParameter("nome");
    String tipo = request.getParameter("tipo");
    String ingredientes = request.getParameter("ingredientes");

    // Inserir o prato na tabela
    Connection conexao = Conexao.getConexao();
    Statement stmt = conexao.createStatement();
    stmt.executeUpdate(
        "INSERT INTO prato (nome, tipo, ingredientes) VALUES ('" + nome + "', '" + tipo + "', '" + ingredientes + "')");

    // Retornar uma mensagem de sucesso
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>Prato inserido com sucesso!</h1>");
  }
}
