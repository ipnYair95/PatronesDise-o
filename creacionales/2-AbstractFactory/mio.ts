interface AbstractAnimal{
    hacerSonido():string;
}

class Perro implements AbstractAnimal{
    hacerSonido(): string {
        return "Guau"
    }
}

class Gato implements AbstractAnimal{
    hacerSonido(): string {
        return "Miau"
    }
}

let perro: AbstractAnimal = new Perro();
let gato: AbstractAnimal = new Gato();

console.log( perro.hacerSonido() );
console.log( gato.hacerSonido() );

