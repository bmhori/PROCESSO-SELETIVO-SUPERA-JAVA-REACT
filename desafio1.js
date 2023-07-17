// Função para ordenar os valores
function ordenarParesImpares(valores) {
    const pares = [];
    const impares = [];
  
    // Separar os valores em pares e ímpares
    for (let i = 0; i < valores.length; i++) {
      const valor = valores[i];
      if (valor % 2 === 0) {
        pares.push(valor);
      } else {
        impares.push(valor);
      }
    }
  
    // Ordenar os pares em ordem crescente
    pares.sort((a, b) => a - b);
  
    // Ordenar os ímpares em ordem decrescente
    impares.sort((a, b) => b - a);
  
    // Imprimir os valores na ordem especificada
    pares.forEach(valor => console.log(valor));
    impares.forEach(valor => console.log(valor));
  }
  
  // Entrada de dados
  const readline = require('readline');
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  
  let n;
  const valores = [];
  
  const readLines = () => {
    rl.question('Digite o número de linhas de entrada: ', line => {
      n = parseInt(line);
      if (isNaN(n) || n <= 0 || n > 105) {
        console.log('Número inválido. Tente novamente.');
        readLines();
      } else {
        readValues(0);
      }
    });
  };
  
  const readValues = (count) => {
    if (count < n) {
      rl.question(`Digite o valor ${count + 1}: `, value => {
        const num = parseInt(value);
        if (isNaN(num) || num < 0) {
          console.log('Valor inválido. Tente novamente.');
          readValues(count);
        } else {
          valores.push(num);
          readValues(count + 1);
        }
      });
    } else {
      rl.close();
      ordenarParesImpares(valores);
    }
  };
  
  readLines();
  