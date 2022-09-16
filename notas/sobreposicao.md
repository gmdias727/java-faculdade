# Sobreposição

Ocorre quando a classe **descendente** reescreve um método que já existe na classe ancestral, usando exatamente a mesma assinatura. Nesse caso, a versão **descendente** do método irá se sobrepor à versão ancestral para os objetos criados a partir da classe descendente. No entanto, dentro da classe descendente ainda é possível acessar a versão ancestral usando a referência **super**.

```java
public class Pessoa 
{
    private String nome, rg;
    
    public void print()
    {
        System.out.println(
            "Nome: " + nome + "\n";
            "Rg: " + rg + "\n";
        );
    }
}
```

Exemplo:

```Java
public class Aluno extends Pessoa
{
    private String ra;
    
    public void print()
    {
        super.print();
        System.out.println(
            "RA: " + ra + "\n";
        );
    }
}
```

