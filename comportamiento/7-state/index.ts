
/**
 * Aplicaciones
 * En servidores para saber que hacer en funcion de la cantidad de peticiones recibidas
 * Un estado de un documento o usuario 
 */

/**
 * contrato que tienen que implementar para un cambio de estado
 */
interface State {
	handle(context: Context): void;
}


/**
 * cada clase concreta va a ser ejecutada y cambiara su estado a una nueva operacion
 */
class ConcreteStateA implements State {
	public handle(context: Context): void {
		console.log(
			"`handle` method of ConcreteStateA is being called!"
		);
		context.State = new ConcreteStateB();
	}
}

class ConcreteStateB implements State {
	public handle(context: Context): void {
		console.log(
			"`handle` method of ConcreteStateB is being called!"
		);
		context.State = new ConcreteStateA();
	}
}


/**
 * el contexto es nuestro apuntador para saber en que estado estamos y 
 * tambien para llamar las operaciones que hará ese estado
 */
class Context {
	private state: State;

	constructor(state: State) {
		this.state = state;
	}

	get State(): State {
		return this.state;
	}

	set State(state: State) {
		this.state = state;
	}

	public request(): void {
		console.log("request is being called!");
		this.state.handle(this);
	}
}

function show(): void {
    //Empezamos con un concreto de A que ira intercambiandose por su implementación interna
	var context: Context = new Context(new ConcreteStateA());
	context.request();
	context.request();
	context.request();
	context.request();
	context.request();
	context.request();
	context.request();
	context.request();
}
show();
