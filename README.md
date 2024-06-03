# Programa de Seleção de Candidatos

Este programa em Java avalia uma lista de candidatos para uma posição de trabalho com base em seus salários esperados. Ele seleciona candidatos aleatoriamente da lista e determina se atendem ao requisito mínimo de salário. Além disso, simula o contato com os candidatos selecionados por meio de uma ligação telefônica.

## Recursos

- **Seleção de Candidatos:** O programa itera por uma lista de candidatos e avalia seus salários esperados em relação a um limite mínimo predefinido. Se o salário esperado do candidato exceder o limite, ele é selecionado para uma consideração adicional.

- **Geração de Salário Aleatório:** O salário esperado para cada candidato é gerado aleatoriamente dentro de uma faixa especificada usando `ThreadLocalRandom`.

- **Simulação de Contato com Candidato:** Após selecionar os candidatos, o programa simula o contato com eles por meio de uma ligação telefônica. Ele tenta entrar em contato com o candidato, com um máximo de três tentativas. Se a ligação for bem-sucedida ou não é determinada aleatoriamente.

## Uso

1. Compile e execute o arquivo `Main.java`.
2. Visualize a saída para ver os candidatos selecionados e o resultado das tentativas de contato.

## Explicação do Código

- O programa define um array de nomes de candidatos e um array para armazenar os candidatos selecionados.
- Ele itera pela lista de candidatos, gerando um salário esperado aleatório para cada candidato.
- Se o salário esperado exceder um limite mínimo predefinido, o candidato é selecionado.
- O programa então simula o contato com cada candidato selecionado por meio de uma ligação telefônica, com um máximo de três tentativas.
- O resultado de cada tentativa de contato é exibido no console.

## Requisitos

- Java Development Kit (JDK)

## Exemplo de Saída

