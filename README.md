# 🐾 Projeto Petshop

![Java](https://img.shields.io/static/v1?label=Java&message=25&color=ED8B00&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/static/v1?label=Paradigma&message=Orienta%C3%A7%C3%A3o%20a%20Objetos&color=blue)
![Bootcamp](https://img.shields.io/static/v1?label=Bootcamp&message=ElasTech&color=8A2BE2)
![Parceria](https://img.shields.io/static/v1?label=Parceria&message=Soulcode%20%2B%20PagBank&color=00A859)
![SOLID](https://img.shields.io/static/v1?label=Princ%C3%ADpios&message=SOLID&color=teal)
![Exercicios](https://img.shields.io/static/v1?label=Exercicios&message=4%2F17&color=orange)
![Nivel](https://img.shields.io/static/v1?label=N%C3%ADvel&message=Iniciante&color=brightgreen)
![Status](https://img.shields.io/static/v1?label=Status&message=Em%20andamento&color=yellow)

Sistema de petshop construído **de forma incremental** em Java, como exercício de prática do bootcamp da **ElasTech**, parceria entre **Soulcode** e **PagBank**. Cada exercício parte do código do anterior e, no final, o programa reúne os principais conceitos da linguagem e da orientação a objetos.

---

## 📚 Sobre o projeto

A lista tem **17 questões** que evoluem um único sistema: começa com uma ficha de pet com dados fixos e termina com um petshop completo, com menu, cadastro, busca, fila de banho, serviços e herança. A última questão aplica os princípios **SOLID** ao código construído até aqui.

Cada questão traz:

- **O que fazer:** as instruções
- **Saída esperada:** para conferir o resultado sozinha
- **Referência:** a sintaxe do assunto, para consulta

---

## 🗂️ Estrutura

Cada exercício fica em seu próprio package, sem apagar o anterior:

```
src/
└── main/
    └── java/
        └── org/example/
            ├── exercicio1/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio2/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio3/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio4/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio5/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio6/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio7/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio8/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio9/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio10/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio11/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio12/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio13/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio14/
            │   ├── Petshop.java
            │   └── Main.java
            ├── exercicio15/
            │   ├── Petshop.java
            │   └── Main.java
            └── ...
```

---

## ✅ Progresso

| # | Exercício | Conceitos | Status |
|---|-----------|-----------|:------:|
| 1 | A primeira ficha | Variáveis, tipos, `printf` | ✅ |
| 2 | Perguntando os dados | `Scanner`, `nextLine`, `nextDouble` | ✅ |
| 3 | O porte do pet | `if / else if / else` | ✅ |
| 4 | Juntando tudo num objeto | Classes, atributos, objetos | ✅ |
| 5 | Tirando o porte do `main` | Métodos com retorno | 🚧 |
| 6 | Vários pets | Array de objetos | ⏳ |
| 7 | O menu | `while`, `switch` | ⏳ |
| 8 | Listando os pets | `for` com contador | ⏳ |
| 9 | Buscar pelo nome | `equalsIgnoreCase` | ⏳ |
| 10 | Trate erros do menu | `try / catch` | ⏳ |
| 11 | Quantas espécies diferentes | `HashSet`, for-each | ⏳ |
| 12 | A fila de banho | `ArrayDeque` (fila) | ⏳ |
| 13 | Os serviços do petshop | Interface, `implements`, `ArrayList` | ⏳ |
| 14 | Cachorro e gato | Herança, `extends`, `@Override` | ⏳ |
| 15 | Cada um responde do seu jeito | Polimorfismo | ⏳ |
| 16 | Duas fichas, um nome só | Sobrecarga | ⏳ |
| 17 | Aplicando o SOLID | Princípios SOLID | ⏳ |

> ✅ concluído · 🚧 em andamento · ⏳ a fazer

---

## 🧠 Conceitos praticados

- Variáveis, tipos e `printf`
- Entrada de dados com `Scanner`
- Condicionais (`if` e `switch`)
- Laços (`while`, `for` e for-each)
- Arrays e Strings
- Classes e objetos
- Métodos com parâmetro e retorno
- Tratamento de exceções
- Coleções: `HashSet`, `ArrayDeque` e `ArrayList`
- Interfaces e `implements`
- Herança, `extends` e `@Override`
- Polimorfismo e sobrecarga
- Princípios SOLID

---

## 🎓 Bootcamp ElasTech

Este projeto é uma atividade de prática do bootcamp da **ElasTech**, em parceria com a **Soulcode** e o **PagBank**. Ao longo dos 17 exercícios, o mesmo sistema vai ganhando recursos e conceitos novos.

O último exercício fecha o projeto aplicando os cinco princípios do SOLID: responsabilidade única, aberto/fechado, substituição de Liskov, segregação de interfaces e inversão de dependência.

---

## 🖥️ Exemplo de saída

```
=== FICHA DO PET ===
Nome: Mel
Espécie: Cachorro
Peso: 8.5 kg
Porte: Pequeno
```

Funcionalidades previstas ao final do projeto:

```
=== PETSHOP ===
1 - Cadastrar pet
2 - Listar pets
3 - Buscar pet
...
0 - Sair
```

---

## ▶️ Como executar

**Pré-requisitos**

- JDK 25 ou superior (os `main` sem `String[] args` usam o recurso de métodos `main` simplificados)
- Uma IDE (IntelliJ IDEA, Eclipse, VS Code) ou o terminal

**Pelo terminal**

```bash
# clone o repositório
git clone https://github.com/Milly56/java-petshop.git
cd java-petshop

# compile
javac -d out src/main/java/org/example/exercicio3/*.java

# execute
java -cp out org.example.exercicio3.Main
```

Troque `exercicio3` pelo exercício que quiser rodar.

---

## 🚀 Desafios extras

- [ ] Impedir cadastro acima do limite do array ("Cadastro cheio!")
- [ ] Opção que mostra o total de pets cadastrados
- [ ] Classe `Vacina` implementando `Servico`
- [ ] Método exclusivo em `Cachorro` (`buscarBolinha()`)
- [ ] Filtrar pets por porte
- [ ] Opção "atender todos" na fila de banho
- [ ] Tratar "cachorro" e "Cachorro" como a mesma espécie
- [ ] Trocar o array por `ArrayList<Pet>`
- [ ] Identificar no código do exercício 16 qual princípio SOLID está sendo violado

---

## 💡 Dicas de estudo

- Faça **uma questão por vez**: escreva, rode, compare com a saída esperada e só então avance.
- Leia a mensagem de erro com calma, ela quase sempre diz o que está faltando.
- Use IA apenas depois de tentar algumas vezes.

---

## 👩‍💻 Autora

**Milly**
Estudante de Ciência da Computação (Unipê) e Inteligência Artificial (UFMS) · Desenvolvedora fullstack em início de carreira

![NestJS](https://img.shields.io/badge/NestJS-E0234E?style=flat&logo=nestjs&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=springboot&logoColor=white)
![Django](https://img.shields.io/badge/Django-092E20?style=flat&logo=django&logoColor=white)
![React](https://img.shields.io/badge/React-20232A?style=flat&logo=react&logoColor=61DAFB)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat&logo=postgresql&logoColor=white)
