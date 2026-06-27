let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do Desafio';

function verConsole() {
    console.log('O botão foi clicado');
}

function verAlerta() {
    alert('Eu amo JS');
}

function verCidade() {
    let cidade = prompt('Digite o nome de uma cidade do Brasil: ');
    alert(`Estive em ${cidade} e lembrei de você`)
}

function verSoma() {
    let valor1 = prompt('Digite um número inteiro: ');
    let valor2 = prompt('Digite um segundo número inteiro: ');
    let soma = parseInt(valor1) + parseInt(valor2);
    alert(`A soma de ${valor1} e ${valor2} é igual a ${soma}`);
}