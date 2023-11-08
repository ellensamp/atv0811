<html>
<head>
  <title>Listar Pratos</title>
</head>
<body>
  <table>
    <thead>
      <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Tipo</th>
        <th>Ingredientes</th>
      </tr>
    </thead>
    <tbody>
      <%
        for (Prato prato : pratos) {
      %>
        <tr>
          <td><%= prato.getId() %></td>
          <td><%= prato.getNome() %></td>
          <td><%= prato.getTipo() %></td>
          <td><%= prato.getIngredientes() %></td>
        </
