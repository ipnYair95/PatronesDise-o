/**
 * Aplicaciones
 * Para tratar de diferente manera ciertos archivos como txt, xml o json
 * Para acciones que tienden a ser usadas con un switch
 */

/**
 * simplemente es un contrato para ejecutar una accion 
 */
export interface Strategy {
	execute(): void;
}
/**
 * cada clase concreta implementa su manera 
 */
export class ConcreteStrategy1 implements Strategy {
	public execute(): void {
		console.log(
			"`execute` method of ConcreteStrategy1 is being called"
		);
	}
}

export class ConcreteStrategy2 implements Strategy {
	public execute(): void {
		console.log(
			"`execute` method of ConcreteStrategy2 is being called"
		);
	}
}

export class ConcreteStrategy3 implements Strategy {
	public execute(): void {
		console.log(
			"`execute` method of ConcreteStrategy3 is being called"
		);
	}
}

/**
 * el contexto va ejecutar la estrategia que decida el usuario pasandole su clase mas general
 */
export class Context {
	private strategy: Strategy;

	constructor(strategy: Strategy) {
		this.strategy = strategy;
	}

	public executeStrategy(): void {
		this.strategy.execute();
	}
}

/**
 * vamos enviando cada una de las decisiones o caminos a tomar
 */
export function show(): void {
	var context: Context = new Context(new ConcreteStrategy1());

	context.executeStrategy();

	context = new Context(new ConcreteStrategy2());
	context.executeStrategy();

	context = new Context(new ConcreteStrategy3());
	context.executeStrategy();
}
show();
