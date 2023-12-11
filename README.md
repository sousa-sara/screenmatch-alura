# ScreenMatch - Sistema de Avaliação e Recomendação de Filmes e Séries
O projeto fornece uma estrutura para organizar e analisar informações relacionadas a filmes e séries, conforme proposto pela plataforma Alura.


# Descrição

A aplicação foi desenvolvida utilizando princípios fundamentais de programação orientada a objetos. Com isso, possui encapsulamento para controlar o acesso a atributos e métodos, getters e setters para manipulação segura dos dados, herança para evitar duplicação de código, interfaces para promover polimorfismo e sobrescrita de métodos para personalizar comportamentos.


# Conceitos Aplicados

## Classe, Atributo e Método

**Classe:** Modelo que encapsula dados (atributos) e comportamentos (métodos) relacionados.

**Atributo:** Variáveis que representam características ou propriedades da classe.

- _Exemplo:_ Atributos como `nome` e `totalDeVisualizacoes` na classe `Episodio`.

**Método:** Funções associadas a uma classe que definem seu comportamento.

- _Exemplo:_ Métodos como `getDuracaoEmMinutos()` ou `getClassificacao()` na classe `Serie`.



## Encapsulamento, Getters e Setters

**Encapsulamento:** Princípio fundamental que controla o acesso a atributos e métodos, preservando a implementação interna.

**Getters e Setters:** Métodos de leitura (getters) e modificação (setters) que permitem acesso controlado aos atributos da classe.


## Modificadores de Acesso (public e private)

`public`: Permite acesso irrestrito;

`private`: Restringe o acesso à própria classe.


## Herança e Extends

**Herança:** Resolve duplicação de código, permitindo que uma classe herde atributos e métodos de outra.

`extends`: Indica a extensão (herança) de uma classe por outra.

- _Exemplo:_ `Filme` e `Serie` herdam os atributos da superclasse `Titulo`.


## Polimorfismo e Interfaces

**Polimorfismo:** Permite tratar objetos de diferentes classes como objetos da mesma classe por meio de interfaces comuns.

`interface`: Contrato que define métodos a serem implementados, promovendo o polimorfismo.

- _Exemplo:_ `Classificavel` como uma interface comum para as classes `Filme`, `Serie` e `Episodio`.


## Sobrescrita de Métodos e @Override

**Sobrescrita:** Permite que uma subclasse forneça uma implementação específica para um método herdado da superclasse.

`@Override`: Notação que indica explicitamente que um método está sendo sobrescrito.


# Funcionalidades

**Avaliação e Classificação**

As classes `Filme` e `Serie` têm métodos avalia que permitem atribuir avaliações (notas) ao conteúdo.
As avaliações são usadas para calcular a média e determinar uma classificação para o filme ou série.


**Filtro de Recomendação**

A classe `FiltroRecomendacao` possui um método `filtra(Classificavel classificavel)` que recebe um objeto do tipo `Filme` ou `Serie` e imprime uma recomendação com base na classificação.
A recomendação é exibida com base em uma escala específica para filmes e outra para séries.

**Cálculos de Tempo**

A classe `CalculadoraDeTempo` é utilizada para calcular o tempo total de duração de todos os filmes e séries incluídos nela.
Os objetos de filmes e séries são adicionados à calculadora através do método `inclui(Titulo titulo)`.

**Instâncias e Exibições**

No método main da classe `TesteSistema`, são criadas instâncias de filmes, séries e episódios, e seus atributos são definidos.
São exibidas informações detalhadas sobre cada filme, série e episódio, incluindo avaliações, classificações e recomendações.

**Exemplo de Recomendação**

Com base na classificação, o sistema fornece recomendações específicas, como "Está entre os preferidos do momento" ou "Muito bem avaliado no momento".

**Informações de Episódios**

Para episódios, o código calcula uma classificação com base no número total de visualizações.

**Exemplo de Saída**

Ao final do código, são exibidas informações resumidas de todas as instâncias, como ficha técnica, avaliações, classificações e recomendações.
Também é mostrado o tempo total de duração de todos os filmes e séries.

# Retorno de Dados
```
FICHA TÉCNICA

Nome: O Grande Gatsby
Ano: 2013
Duração do filme em minutos: 143

INFORMAÇÕES DE AVALIAÇÃO

Total das Avaliações: 3
Soma das Avaliações: 30.0
Média das Avaliações: 10.0

INFORMAÇÃO DE CLASSIFICAÇÃO

Classificação do Filme (5 como classificação máxima): 5

RECOMENDAÇÃO: Está entre os preferidos do momento.

---------------------------------------------------------

FICHA TÉCNICA

Nome: Interestelar
Ano: 2014
Duração do filme em minutos: 169

INFORMAÇÕES DE AVALIAÇÃO

Total das Avaliações: 3
Soma das Avaliações: 13.0
Média das Avaliações: 4.333333333333333

INFORMAÇÃO DE CLASSIFICAÇÃO

Classificação do Filme (5 como classificação máxima): 2

RECOMENDAÇÃO: Muito bem avaliado no momento.

---------------------------------------------------------

FICHA TÉCNICA

Nome: Dark
Ano: 2017

INFORMAÇÕES DE TEMPORADAS

Quantidade de Temporadas: 3
Episódios por Temporada: 8
Minutos por Episódio: 60
Duração em minutos para maratonar a série: 1440

INFORMAÇÕES DE AVALIAÇÃO

Total das Avaliações: 3
Soma das Avaliações: 27.5
Média das Avaliações: 9.166666666666666

INFORMAÇÃO DE CLASSIFICAÇÃO

Classificação da série (100 como classificação máxima): 90

RECOMENDAÇÃO: Está entre os preferidos do momento.

INFORMAÇÕES SOBRE EPISÓDIO DE DARK

Número do Episódio: 1
Nome: Secrets
Total de Visualizações: 3000000
Classificação do episódio com base nas visualizações (10 como classificação máxima): 10

---------------------------------------------------------

FICHA TÉCNICA

Nome: Black Mirror
Ano: 2011

INFORMAÇÕES DE TEMPORADAS

Quantidade de Temporadas: 5
Episódios por Temporada: 6
Minutos por Episódio: 60
Duração em minutos para maratonar a série: 1800

INFORMAÇÕES DE AVALIAÇÃO

Total das Avaliações: 3
Soma das Avaliações: 9.0
Média das Avaliações: 3.0

INFORMAÇÃO DE CLASSIFICAÇÃO

Classificação da série (100 como classificação máxima): 30

RECOMENDAÇÃO: Está entre os preferidos do momento.

INFORMAÇÕES SOBRE EPISÓDIO DE BLACK MIRROR

Número do Episódio: 1
Nome do Episódio: The National Anthem
Total de Visualizações: 2800
Classificação do episódio com base nas visualizações (10 como classificação máxima): 5

===========================================================

Tempo total (em minutos) de duração de todos os filmes e séries incluídos: 3552
```
