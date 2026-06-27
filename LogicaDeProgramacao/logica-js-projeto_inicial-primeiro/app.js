/*

// alert("Boas vindas ao nosso site!");

let nome = "lua";

let idade = 25;

let numeroDeVendas = 50;

let saldoDisponivel = 1000;

let texto = 'nome: ' + nome + ' / idade: ' + idade + ' / vendas: ' + numeroDeVendas + ' / saldo: ' + saldoDisponivel;

// alert(texto);

console.log(texto);

// alert("Erro! Preencha todos os campos");

let mensagemDeErro = "Erro! Preencha todos os campos";

// alert(mensagemDeErro);

nome = prompt("Digite o seu nome: ");

// texto = 'nome informado: ' + nome;

idade = prompt("Informe a sua idade: ");

let texto2 = '';
if (idade >= 18) {
  texto2 = " --> pode tirar habilitação!";
};

alert("(1) nome: " + nome + " / idade: " + idade + texto2);

alert(`(2) nome: ${nome} / idade: ${idade} ${texto2}`);
*/

/*
let diaDaSemana = prompt('Informe qual dia da semana é hoje: ');

if ((diaDaSemana == 'sábado') || (diaDaSemana =='domingo')) {
  alert('Bom fim de semana!');
} else {
  alert('Boa semana!') 
};

let numero = prompt('Informe um número: ');
let tipoNumero = 'neutro';

if (numero < 0) {
  tipoNumero = 'negativo'; 
} else if (numero > 0) {
   tipoNumero = 'positivo'; 
}

alert(`O número informado é ${tipoNumero} (${numero})`);

*/
const diasDaSemana = ['segunda', 'terça', 'quarta','quinta','sexta','sábado','domingo'];
let numDS = diasDaSemana.length;
let achou = 'N';

let diaInformado = prompt('Informe qual dia da semana é hoje: ');

diaInformado = diaInformado.toLowerCase();

for (let i=0; i < numDS; i++) {
  if (diasDaSemana[i] == diaInformado) {
    achou = 'S';
    break;
  }
}

let msg = '';
if (achou == 'N') {
  alert('O dia informado não é válido');
} else {

  if ((diaInformado == 'sábado') || (diaInformado =='domingo')) {
    msg = msg + 'bom fim de semana';
  } else {
     msg = msg + 'boa semana';
  }

  let nome = prompt('Digite o seu nome:');
  const nomes = nome.split(" ");

  for (let i = 0; i < nomes.length; i++) {
    nomes[i] = nomes[i][0].toUpperCase() + nomes[i].substring(1).toLowerCase();
  }

  nome = nomes.join(" ");

  msg = `Hoje é ${diaInformado}. Seja bem-vindo(a) e ` + msg + ', ' + nome + '!';

  alert(msg);

  hoje = Date.now();

  alert(`data de hoje = ${hoje}`);

}
