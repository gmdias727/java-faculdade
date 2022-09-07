# Construtores

São métodos especializados na construção de objetos.

A principal função dos construtores é deixar o objeto em um **estado válido** para que possa ser utilizado logo após a construção.

Para isso é preciso colocar **valores válidos** nos *atributos* do objeto e ester valores geralmente são obtidos através dos **parâmetros do construtor.**

Toda classe precisa ter pelo menos **1 (um) construtor** se a classe não declara nenhum, o java criará um *construtor padrão implícito para a classe.*

O **construtor padrão não tem parâmetros**, então deixa os atributos com os **valores nulos** correspondentes ao **tipo dos atributos.**

```java
TEREMOS CONSTRUTORES EM TODAS AS CLASSES QUE FIZERMOS
```

Como fazer um construtor em Java:

1. Construtores sempre tem o **mesmo nome da classe**.

2. Construtores não tem tipo de **retorno** declarado, nem mesmo **void.**

3. Construtores são **sempre públicos.**

Tipos de construtores:
    
- Padrão = não tem parâmetro.
- Parametrizado = Recebe por parâmetros os valores dos atributos.
- De cópia (Copy constructor) = Preenche os atributos copiando os valores de outro objeto que já tenha sido construído antes.

O construtor de cópia tem como único parâmetro o objeto que será copiado.


aula passada:
```java
public class Aluno
{
    private String nome, ra;
    private int faltas;
    private double nota1, note2;
}
```

---

Exemplo de construtor parametrizado:
```java
public Aluno(String valNome, String valRa)
{
    faltas = 0;
    nota1 = 0;
    nota2 = 0;

    nome = valNome;
    ra = valRa;

}
```

---

Construtor de cópia (copy constructor):
```java
public Aluno( Aluno al )
{
    nome = al.nome;
    ra = al.nome;
    faltas = al.faltas;
    nota1 = al.nota1;
    nota2 = al.nota2;
}
```

---

Padrão:

```java
public Aluno()
{
    inútil
}
```

---

Construção de objetos: 

```java
NomeDaClasse vr = new Construtor(parametros)

// vr = variável de referência
// new = operador de instanciação


```

Passos na construção dos objetos:

1. O operador **new** *aloca memória* suficiente para *conter o objeto*.
2. O **construtor** é chamado para preencher os *atributos de inicialização* do objeto.
3. A referência (endereço) do objeto é **retornada** como **resultado da operação.**

