let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do Desafio - 2';

function dizerOla(){
    console.log('Olá, mundo!')
}

let nome = prompt ('Digite um nome: ');
let num1 = prompt ('Digite o primeiro número: ');
let num2 = prompt ('Digite o segundo  número: ');
let num3 = prompt ('Digite o terceiro número: ');

function dizerOlaNome(nome){
    console.log(`Olá, ${nome}!`);
}

function dobro(num1) {
    let nDobro = num1 * 2;
    console.log(nDobro);
    return nDobro;
}

function media (num1, num2, num3) {
    let nMedia = (parseInt(num1)+
                    parseInt(num2)+
                    parseInt(num3)) / 3;
    console.log(nMedia);
    return nMedia;
}

function maior (num1, num3){
    let nMax = Math.max(num1, num3);
    console.log(nMax);
    return nMax;
}

function elev2(num2){
    let nElev2 = Math.pow(num2, 2);
    console.log(nElev2);
    return nElev2;
}
