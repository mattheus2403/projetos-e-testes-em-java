package anota��es;

/*
   
   Boas pr�ticas para nomea��o de pacotes
   
Quando voc� cria um novo pacote, se voc� colocar qualquer nome, mesmo que fora das boas pr�ticas de programa��o Java, n�o dar� erro. Contudo, essas boas pr�ticas existem e � muito importante segui-las para sempre termos uma programa��o limpa, robusta e de f�cil manuten��o. 

Alguns pontos s�o importantes na hora de nomear os pacotes (Teruel):

N�o utilizar espa�os (o NetBeans j� n�o lhe permite fazer isso pelo assistente de cria��o de pacotes)
Utilizar apenas letras min�sculas
Se o nome do pacote tiver mais de uma palavra, utilizar pontos para separa-las. Por exemplo: cadastro.clientes
 

Embora o Java, hoje, perten�a a Oracle, a Sun Microsystems, criadora da linguagem, usava um padr�o de nomenclatura muito interessante, que muitos programadores seguem at� hoje e existem recomenda��es de boas pr�ticas de programa��o para que este padr�o seja seguido. Utilizar o nome relativo da empresa para nomear o pacote, mas de tr�s para frente. Para facilitar, veja alguns exemplos de nomes:

br.uninove.poo.sistema
br.uninove.poo.exemplos
br.uninove.poo.exemplos.polimorfismo
br.com.josefinocorp.erp.modulos.clientes
etc...
 

Pode parecer estranho, mas os desenvolvedores da Sun diziam que isso ajuda a identificar quando voc� est� trabalhando com classe criadas pela sua empresa (ou por voc�) e quando se est� trabalhando com classes de terceiros, pois o nome do pacote iria ser diferente. De qualquer forma, isso � apenas uma recomenda��o. No mercado, essa pr�tica � muito comum. 

Classes em pacotes diferentes podem conversar
Isso mesmo, todas as classes em Java podem �enxergar� umas �s outras (dependendo da visibilidade das classes, claro, mas isso ser� tratado noutro t�pico).

Por padr�o, as classes que est�o no mesmo pacote �se enxergam� diretamente, ou seja, bata referencia-las. 

Contudo, se voc� est� trabalhando com classes que est�o em pacotes diferentes, � preciso importar as classes ou o pacote inteiro dentro da classe a qual voc� est� referenciando a outra.

Neste caso, usamos a palavra reservada: import.

Se voc� quer importar apenas uma classe daquele pacote, � preciso acrescentar no inicio de seu c�digo a instru��o import {nome completo do pacote}.{nome da classe};

Contudo, se voc� quer importar todas as classes daquele pacote, pode-se utilizar o �*� (asterisco) para importa-las, com a instru��o: import {nome do pacote completo}.*;

Em seguida, alguns exemplos ser�o mostrados para cada um destes cen�rios.  
   
   
   
   
   
   
*/
