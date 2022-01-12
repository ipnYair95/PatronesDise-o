
/**
 * Ejemplos de aplicacion
 * Poner tareas en cola
 * Realizar el siguimiento de operaciones 
 */

function add(x, y) { return x + y; }
function sub(x, y) { return x - y; }
function mul(x, y) { return x * y; }
function div(x, y) { return x / y; }

var Command = function (execute, undo, value) {
    this.execute = execute;
    this.undo = undo;
    this.value = value;
}
/**
 * Declaralos los comandos dependiendo su combinacion 
 * 1) Lo que debe hacer
 * 2) La accion para deshacer
 * 3) el valor
 */
var AddCommand = function (value) {
    return new Command(add, sub, value);
};

var SubCommand = function (value) {
    return new Command(sub, add, value);
};

var MulCommand = function (value) {
    return new Command(mul, div, value);
};

var DivCommand = function (value) {
    return new Command(div, mul, value);
};

/**
 * Es nuestro receptor y realiza las operaciones asociadas al comando
 * Tambien mantiene un historico, obtiene valores y hace como un rollback
 * o deshace cambios de cierto comando
 * 
 */
var Calculator = function () {
    var current = 0;
    var commands = [];

    function action(command) {
        var name = command.execute.toString().substr(9, 3);
        return name.charAt(0).toUpperCase() + name.slice(1);
    }

    /**
     * dependiendo la accion ejecutara la operacion de cada comando o bien
     * solamente va a mandar el valor actual
     */
    return {
        execute: function (command) {
            current = command.execute(current, command.value);
            commands.push(command);
            console.log(action(command) + ": " + command.value);
        },

        undo: function () {
            var command = commands.pop();
            current = command.undo(current, command.value);
            console.log("Undo " + action(command) + ": " + command.value);
        },

        getCurrentValue: function () {
            return current;
        }
    }
}

/**
 * cliente que va consumir y ejecutar los comandos
 */
function run() {

    var calculator = new Calculator();

    // ejecutamos los siguientes comandos

    calculator.execute(new AddCommand(100));
    calculator.execute(new SubCommand(24));
    calculator.execute(new MulCommand(6));
    calculator.execute(new DivCommand(2));

    // deshacemos cambios de 2 pasos

    calculator.undo();
    calculator.undo();

    console.log("\nValue: " + calculator.getCurrentValue());
}

run()