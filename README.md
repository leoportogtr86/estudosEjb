### **Seção 1: Introdução ao EJB**

1. O que é Enterprise JavaBeans (EJB)?
2. Arquitetura EJB: visão geral.
3. Diferenças entre EJB 2.x e EJB 3.x.
4. Componentes do EJB (Cliente, Container, Servidor).
5. Tipos de EJB: Session Beans, Message-driven Beans, Entity Beans.
6. Requisitos para rodar EJB.
7. Ferramentas e servidores de aplicação compatíveis com EJB.
8. Instalando e configurando um servidor de aplicação para EJB (GlassFish ou JBoss).
9. Ciclo de vida de um Session Bean.
10. Ciclo de vida de um Message-Driven Bean.

### **Seção 2: Session Beans**

11. O que são Session Beans?
12. Stateless Session Bean: conceitos e uso.
13. Stateful Session Bean: conceitos e uso.
14. Singleton Session Bean: quando e como utilizá-los.
15. Diferença entre Stateless e Stateful Session Beans.
16. Anotações @Stateless e @Stateful.
17. Métodos de ciclo de vida de um Stateless Session Bean.
18. Métodos de ciclo de vida de um Stateful Session Bean.
19. Anotação @PostConstruct e @PreDestroy.
20. Exemplo prático de Stateless Session Bean.

### **Seção 3: Message-Driven Beans**

21. O que são Message-Driven Beans?
22. Integração com sistemas de mensagens (JMS).
23. Ciclo de vida de um Message-Driven Bean.
24. Anotação @MessageDriven.
25. Configuração de filas JMS no servidor.
26. Exemplo prático de Message-Driven Bean.
27. Diferença entre Message-Driven Beans e Session Beans.
28. Uso de MDBs para processamento assíncrono.
29. Configurações de entrega e consumo de mensagens em MDB.
30. Transações em Message-Driven Beans.

### **Seção 4: Entity Beans e JPA**

31. O que são Entity Beans?
32. Diferenças entre Entity Beans e JPA.
33. Introdução ao Java Persistence API (JPA).
34. Anotação @Entity.
35. Ciclo de vida de um Entity Bean.
36. Mapeamento objeto-relacional com JPA.
37. Relacionamentos em JPA: @OneToOne, @OneToMany, @ManyToOne, @ManyToMany.
38. Consultas JPA com JPQL.
39. Gerenciamento de transações com Entity Beans.
40. Exemplo prático de Entity Bean com JPA.

### **Seção 5: Transações em EJB**

41. Gerenciamento de transações no EJB.
42. Tipos de transações: CMT (Container Managed Transaction) vs BMT (Bean Managed Transaction).
43. Configurando transações usando anotações (@TransactionAttribute).
44. Propagação de transações no EJB.
45. Tipos de propagação de transações (@Required, @RequiresNew, etc.).
46. Rollbacks automáticos e manuais em EJB.
47. Exemplo prático de transações com EJB.
48. Gerenciamento de transações em Stateful Session Beans.
49. Timeout de transação e otimizações.
50. Exemplo de transações distribuídas com EJB.

### **Seção 6: Segurança em EJB**

51. Gerenciamento de segurança no EJB.
52. Uso de anotações para controle de acesso (@RolesAllowed, @PermitAll, @DenyAll).
53. Definindo roles no deployment descriptor.
54. Autenticação e autorização com EJB.
55. Exemplo prático de segurança em EJB.
56. Controle de acesso por método em EJB.
57. Contexto de segurança e APIs de segurança no EJB.
58. Proteção de recursos e dados confidenciais.
59. Configurando segurança em servidores de aplicação.
60. Exemplo de integração com JAAS.

### **Seção 7: Interceptores e Callbacks**

61. O que são interceptores em EJB?
62. Interceptores de ciclo de vida e de métodos de negócios.
63. Uso da anotação @AroundInvoke.
64. Uso de interceptores para logging e auditoria.
65. Exemplo prático de interceptor de ciclo de vida.
66. Exemplo prático de interceptor de negócios.
67. Interceptores globais e por bean.
68. Métodos de callback no EJB.
69. Exemplo prático de callbacks (PostConstruct e PreDestroy).
70. Uso avançado de interceptores e callbacks para manipulação de estados.

### **Seção 8: Timer Service**

71. O que é o EJB Timer Service?
72. Agendamento de tarefas com EJB.
73. Anotação @Schedule e @Timeout.
74. Timer programático vs timer automático.
75. Exemplo prático de um Timer Service.
76. Tipos de temporizadores: intervalos e execução única.
77. Configuração de timers no deployment descriptor.
78. Gerenciamento de estados de timers.
79. Timer Service com Stateful Session Beans.
80. Exemplo prático de tarefas recorrentes usando Timer Service.

### **Seção 9: Exceções e Tratamento de Erros**

81. Gerenciamento de exceções no EJB.
82. Exceções verificadas vs não verificadas.
83. Exceções de aplicativo (@ApplicationException).
84. Exceções do container (EJBException).
85. Exemplo de tratamento de exceções em EJB.
86. Tratamento de rollback de transações em caso de exceções.
87. Boas práticas para tratamento de exceções em EJB.
88. Logging e auditoria de exceções em EJB.
89. Exceções personalizadas no EJB.
90. Testando e depurando exceções em EJB.

### **Seção 10: Melhores Práticas e Avanços no EJB**

91. Boas práticas no uso de Stateless e Stateful Session Beans.
92. Boas práticas de segurança em EJB.
93. Otimizações de desempenho com EJB.
94. Monitoramento e profiling de EJBs.
95. Escalabilidade e clustering com EJB.
96. Gerenciamento de recursos em EJB.
97. EJB 3.1: Novidades e melhorias em relação ao EJB 3.0.
98. Integração com outros frameworks (Spring, CDI).
99. Testando EJBs com ferramentas de teste automatizado.
100. Preparação para certificação Java EE 6 e EJB.

---

Este guia foi organizado para proporcionar uma progressão natural no entendimento do EJB, começando pelos fundamentos e
indo até conceitos mais avançados e melhores práticas.