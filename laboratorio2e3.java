<!DOCTYPE html>
<html lang="pt-PT">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>REST-API e Conexão com Java (Frontend & Backend)</title>
  <style>
    body {
      margin: 0;
      font-family: Arial, Helvetica, sans-serif;
      background: #fff7f0;
      color: #333;
      line-height: 1.6;
    }

    header {
      background: linear-gradient(135deg, #ff8c00, #ff6a00);
      color: white;
      text-align: center;
      padding: 40px 20px;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
    }

    section {
      background: white;
      max-width: 900px;
      margin: 30px auto;
      padding: 25px;
      border-radius: 12px;
      box-shadow: 0 3px 8px rgba(0, 0, 0, 0.1);
    }

    h1, h2 {
      margin-top: 0;
      color: #d35400;
    }

    ul li {
      margin-bottom: 10px;
    }

    a {
      display: inline-block;
      margin: 20px auto;
      text-align: center;
      background: #ff6a00;
      padding: 12px 20px;
      color: white;
      text-decoration: none;
      border-radius: 8px;
      transition: 0.3s;
    }

    a:hover {
      background: #cc5500;
    }
  </style>
</head>
<body>

  <header>
    <h1>REST-API e Conexão com Java</h1>
  </header>

  <section id="introducao">
    <h2>1. O que é uma REST-API?</h2>
    <p>
      Uma <strong>REST-API<\/strong> constitui uma interface que permite a comunicação entre diferentes sistemas através do protocolo <strong>HTTP<\/strong>. Segue os princípios da arquitetura REST e recorre, habitualmente, ao formato <strong>JSON<\/strong> para a transmissão de informação, assegurando uma comunicação clara, estruturada e eficiente.
    </p>
  </section>

  <section id="principios">
    <h2>2. Princípios da Arquitetura REST</h2>
    <ul>
      <li><strong>Separação Cliente-Servidor:</strong> responsabilidades independentes.</li>
      <li><strong>Independência de Estado:</strong> cada requisição carrega tudo que é necessário.</li>
      <li><strong>Cache:</strong> respostas podem ser reutilizadas.</li>
      <li><strong>Interface Uniforme:</strong> URLs e métodos consistentes.</li>
      <li><strong>Camadas:</strong> pode haver proxies e firewalls sem afetar o funcionamento.</li>
    </ul>
  </section>

  <section id="backend-java">
    <h2>3. REST API no Back-end com Java</h2>
    <p>
      O <strong>back-end em Java<\/strong> é responsável pelo processamento de regras de negócio, pela gestão de bases de dados e pela resposta a solicitações provenientes do cliente. Frameworks como o <strong>Spring Boot<\/strong> simplificam a criação e manutenção de APIs REST, promovendo soluções robustas, seguras e escaláveis.
    </p>
    <ul>
      <li>Uso de <strong>Spring Boot</strong> ou Jakarta EE.</li>
      <li>Anotações como <code>@RestController</code> e <code>@GetMapping</code>.</li>
      <li>Respostas estruturadas em <strong>JSON</strong>.</li>
      <li>Integração com base de dados usando <strong>JPA/Hibernate</strong>.</li>
    </ul>
  </section>

  <section id="frontend-java">
    <h2>4. REST API no Front-end com Java</h2>
    <p>
      As aplicações Java podem igualmente atuar como clientes REST, consumindo APIs através de bibliotecas como <strong>HttpClient<\/strong> ou <strong>Retrofit<\/strong>. Esta integração facilita a comunicação estruturada entre a interface e o servidor, garantindo um fluxo de dados eficiente e dinâmico.
    </p>
    <ul>
      <li>Consumo de endpoints via HTTP.</li>
      <li>Uso de JSON para troca de dados.</li>
      <li>Atualização dinâmica da interface.</li>
      <li>Separação entre lógica visual e de negócio.</li>
    </ul>
  </section>

  <p style="text-align:center;"><a href="index.html">Voltar à página inicial</a></p>

</body>
</html>
