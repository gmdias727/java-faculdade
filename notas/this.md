# Referência: this

É uma referência ao **objeto** presente dentro do objeto.

Como toda referência, permite acesso a métodos e atributos do objeto.

Normalmente não é necessário o uso do `this` para acessar *métodos* e *atributos* dentro da classe.

A não ser quando existe algum conflito de **nomes** entre os **atributos** e **parâmetros** de um método.

Nesse caso o `this` é necessário para resolver o conflito.

---

Exemplo 1:
```java
Aluno a = new Aluno(...);
x.faltou();
```

Exemplo 2:

```java
public class Aluno 
{
    private String nome;
    
    public void setNome(String nome)
    {
        // GERA CONFLITO DE NOMES SE NADA FOR ESPECIFICADO

        this.nome; // referencia o atributo privado "nome"
    }
}
```

O ***this*** pode ser usado também para chamar **construtores** a partir de outros **construtores** para aproveitar o código já escrito em outro construtor.

O ***this*** é usado no lugar do nome do construtor.

Exemplo 3:
```java
public class Pessoa
{
    private String nome, rg;
    public Pessoa(String nome, String rg)
    {
        // Exemplo correto.
        this.nome = nome;
        this.rg = rg;
    }
}
```

Exemplo 4:
```java
public Pessoa(Pessoa p)
{
    nome = p.nome;
    rg = p.rg;
}

public Pessoa(Pessoa p)
{
    this(p.nome, p.rg);
}


```

