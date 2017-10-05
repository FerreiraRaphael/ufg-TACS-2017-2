## Atividades de Técnicas Avançadas de Construção de Software

### Dependências
- JDK 1.8
- Maven

### Instalação
- Clonar repositório `git clone https://github.com/FerreiraRaphael/ufg-TACS-2017-2.git`
- Instalar dependências `mvn install`

### Comandos
- Testes `mvn test`
- Cobertura de Tests `mvn package` ou `mvn clean package`
 - Cobertura pode ser vista em `$PROJECT_HOME/target/site/jacoco/index.html`

### [Leilão - TDD com Java](https://github.com/FerreiraRaphael/ufg-TACS-2017-2/pull/3)
Assista TDD com Java - Aula 1 (http://youtu.be/Dyls2ljtAZQ), implemente as regras de negócio e os testes automatizados apresentados no vídeo.
Entregue o endereço do repositório no GitHub com o seu projeto Maven.

### [Palíndromo - Testes automatizados](https://github.com/FerreiraRaphael/ufg-TACS-2017-2/pull/4)
Um palíndromo é uma palavra ou uma frase que é igual quando se lê da esquerda para a direita quanto da direita para a esquerda. Exemplos de palíndromos: "Socorram-me subi no onibus em Marrocos", "Anotaram a data da maratona".
O código abaixo diz se uma frase é palíndromo, então escreva os testes para esta classe e verifique que há um erro no algoritmo. Descubra qual o erro, corrija e repita os testes:
```
public class Palindromo {
  public boolean ehPalindromo(String frase) {
    String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "");
    for(int i = 0; i < fraseFiltrada.length(); i++) {
      if(fraseFiltrada.charAt(i) != fraseFiltrada.charAt(fraseFiltrada.length() -i)) {
        return false;
      }
    }
    return true;
  }
}
```
Entregue o endereço do repositório GitHub do seu projeto Maven.

### [Bizz buzz - Testes automatizados](https://github.com/FerreiraRaphael/ufg-TACS-2017-2/pull/1)

Bizz buzz é uma brincadeira em grupo. Os jogadores jogam em turnos incrementais, onde cada um fala um número substituindo números divisíveis por três pela palavra "fizz", e números divisíveis por cinco pela palavra "buzz". Sendo que você precisa falar "fizz buzz" quando o número for múltiplo de três e de cinco. Faça um software que permite ao computador nunca perder este jogo.
Entregue o endereço do repositório GitHub do seu projeto Maven com mais de 90% de cobertura de teste.

### [Número é bissexto - Testes automatizados](https://github.com/FerreiraRaphael/ufg-TACS-2017-2/pull/2)

Faça um programa que verifique se um número é bissexto.
Entregue o endereço do repositório GitHub do seu projeto Maven com mais de 90% de cobertura de teste.
