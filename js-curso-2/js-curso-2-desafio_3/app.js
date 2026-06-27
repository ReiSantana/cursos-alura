function IMC (altura, peso) {
    return imc = Math.pow(altura, 2) / peso;
}

function fatorar(num) {
    if (num < 0) 
        return -1;
    else if (num == 0) 
        return 1;
    else {
        return (num * fatorar(num - 1));
    }
}

function fatorar2(num){
  var result = num;
  if (num === 0 || num === 1) 
    return 1; 
  while (num > 1) { 
    num--;
    result *= num;
  }
  return result;
}

function fatorar3(num) {
    if (num === 0 || num === 1)
        return 1;
    for (var i = num - 1; i >= 1; i--) {
        num *= i;
    }
    return num;
}

/*
let teste = fatorar(-5);
alert(`teste = ${teste}`);
console.log(`teste = ${teste}`);
*/

function conversao(qtdeDolares) {
    return qtdeDolares * 4.80;
}

let valorReais = conversao(1000);
alert(`você tem R$${valorReais}`);

function medRetangulo (altura, largura) {
    let perimetroRet = 2 * (altura + largura);
    let areaRet = altura * largura;
    alert(`Retângulo de altura = ${altura} e largura = ${largura} ==> área = ${areaRet} e perimetro = ${perimetroRet}`);
}

let altura = 4;
let largura = 5;
medRetangulo(altura, largura);


function medCirculo (raio) {
    let Pi = 3.14;
    let perimetroCirculo = 2 * Pi * raio;
    //ou
    let perimetroCirculo2 = 2 * Math.Pi * raio;
    let areaCirculo = Pi * Math.pow(raio, 2);
    alert(`Círculo de raio = ${raio} ==> área = ${areaCirculo} e perimetro = ${perimetroCirculo}`);
}

let raio = 5;
medCirculo(raio);

function tabuada (num) {
    i = 1;
    let valor;
    let texto = '';
    while (i < 11) {
        valor = i * num;
        texto = texto + `${num} x ${i} = ${parseFloat(valor)}\n`;
        i++;
    };    
    alert(`${texto}`);
}

tabuada(9);