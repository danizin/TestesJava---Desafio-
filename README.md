# TestesJava---Desafio-
Desafio proposto pela empresa BlueSoft como parte do processo seletivo.


Desafio - Testes
O sistema de batalha de robôs está praticamente pronto, mas antes de enviá-lo paraprodução é necessário a implementação de testes automatizados.As características do sistema são:
●A batalha deve ter ao menos dois robôs.
●A batalha deve ter no máximo dez robôs.
●Cada robô tem um valor de ataque, defesa e uma habilidade.
●O poder do robô é a soma de seu ataque, defesa e poder adicional concedido pelahabilidade.
●O vencedor é o robô com maior poder. Em caso de empate é o robô que entrouprimeiro na batalha.
●Ao terminar a batalha é realizada uma requisição para um serviço externonotificando o vencedor.
Criando os testesUtilize seus conhecimentos sobre testes automatizados, JUnit e Mockito para implementaros testes que vão garantir o funcionamento correto do sistema.As classes de teste devem ser criadas dentro do diretório ​src/test/java​.Crie dentro desse diretório o pacote equivalente para a classe de teste. 
Exemplo:
●Classe ​MeuExemplo.java​ no pacote ​br.com.codar.exemplo ​e diretóriosrc/main/java​.
●Teste seria a classe ​MeuExemploTest.java​ no pacote ​br.com.codar.exemplo ​ediretório ​src/test/java.

Modificação e mais testes
Faça a seguinte modificação:
●Adicione uma nova habilidade chamada ​SUPER_PODER​ com poder adicional de100.
●Adicione a regra de que é necessário ao menos dois robôs com a habilidadeSUPER_PODER ​na batalha para que ela seja válida. Caso essa regra não sejaatendida lance uma exceção com a mensagem “Seria injusto apenas um robô comsuper poderes. Devem existir ao menos 2 com essa habilidade.”. Exemplos dessavalidação:

○Nenhum robô com ​SUPER_PODER​: Batalha válida
○Apenas um robô com ​SUPER_PODER​: Batalha inválida
○Dois ou mais robôs com ​SUPER_PODER​: Batalha válida
