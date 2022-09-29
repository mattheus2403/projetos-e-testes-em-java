package anotações;

/*
   
   Boas práticas para nomeação de pacotes
   
Quando você cria um novo pacote, se você colocar qualquer nome, mesmo que fora das boas práticas de programação Java, não dará erro. Contudo, essas boas práticas existem e é muito importante segui-las para sempre termos uma programação limpa, robusta e de fácil manutenção. 

Alguns pontos são importantes na hora de nomear os pacotes (Teruel):

Não utilizar espaços (o NetBeans já não lhe permite fazer isso pelo assistente de criação de pacotes)
Utilizar apenas letras minúsculas
Se o nome do pacote tiver mais de uma palavra, utilizar pontos para separa-las. Por exemplo: cadastro.clientes
 

Embora o Java, hoje, pertença a Oracle, a Sun Microsystems, criadora da linguagem, usava um padrão de nomenclatura muito interessante, que muitos programadores seguem até hoje e existem recomendações de boas práticas de programação para que este padrão seja seguido. Utilizar o nome relativo da empresa para nomear o pacote, mas de trás para frente. Para facilitar, veja alguns exemplos de nomes:

br.uninove.poo.sistema
br.uninove.poo.exemplos
br.uninove.poo.exemplos.polimorfismo
br.com.josefinocorp.erp.modulos.clientes
etc...
 

Pode parecer estranho, mas os desenvolvedores da Sun diziam que isso ajuda a identificar quando você está trabalhando com classe criadas pela sua empresa (ou por você) e quando se está trabalhando com classes de terceiros, pois o nome do pacote iria ser diferente. De qualquer forma, isso é apenas uma recomendação. No mercado, essa prática é muito comum. 

Classes em pacotes diferentes podem conversar
Isso mesmo, todas as classes em Java podem “enxergar” umas ás outras (dependendo da visibilidade das classes, claro, mas isso será tratado noutro tópico).

Por padrão, as classes que estão no mesmo pacote “se enxergam” diretamente, ou seja, bata referencia-las. 

Contudo, se você está trabalhando com classes que estão em pacotes diferentes, é preciso importar as classes ou o pacote inteiro dentro da classe a qual você está referenciando a outra.

Neste caso, usamos a palavra reservada: import.

Se você quer importar apenas uma classe daquele pacote, é preciso acrescentar no inicio de seu código a instrução import {nome completo do pacote}.{nome da classe};

Contudo, se você quer importar todas as classes daquele pacote, pode-se utilizar o “*” (asterisco) para importa-las, com a instrução: import {nome do pacote completo}.*;

Em seguida, alguns exemplos serão mostrados para cada um destes cenários.  
   
   
   
   
   
   
*/
