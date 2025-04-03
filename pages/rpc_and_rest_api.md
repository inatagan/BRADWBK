
# RPC e REST a diferenca entre as APIs


RPC (Chamada de Procedimento Remoto) e REST (Representational State Transfer) são estilos arquitetônicos usados no design de APIs, permitindo a comunicação entre componentes de software. 
Enquanto a RPC permite que desenvolvedores chamem funções remotas em servidores como se fossem locais, a REST foca em operações de dados específicas em um servidor remoto, utilizando métodos HTTP para criar, ler, atualizar ou excluir recursos. 

Ambas as abordagens abstraem as comunicações de rede, permitindo que desenvolvedores se concentrem nas funcionalidades. A RPC é baseada em chamadas de função, enquanto a REST se concentra em recursos identificados por URLs.

A RPC pode ser com ou sem estado, enquanto a REST deve ser sempre sem estado. 

A REST é mais comum atualmente devido à sua facilidade de implementação e entendimento, embora a RPC ainda seja utilizada em casos específicos, como cálculos complexos. Implementações modernas de RPC, como gRPC, oferecem desempenho superior em alguns contextos. 

Em resumo, a RPC é ideal para executar ações em servidores remotos, enquanto a REST é mais adequada para operações CRUD em objetos de dados.
