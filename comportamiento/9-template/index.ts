/**
 * Aplicaciones
 * Extender la funcionalidad por medio de herencia
 * Para un conjunto de usuarios cada uno va a tener comportamientos diferentes, de lo contrario serán los establecidos
 */
abstract class AbstractClass {

    //metodo que puede ser sobre escrito
	stepOne(): void {}

    //metodo que debe ser implementado
	abstract stepTwo(): void;

    //metodo que puede ser sobre escrito
	stepThree(): void {
		console.log(
			"Step Three is a hook that prints this line by default."
		);
	}

    //metodo que llama a los otros metodos y siempre sera llamado por las clases concretas
	templateMethod() {
		this.stepOne();
		this.stepTwo();
		this.stepThree();
	}
}

//cada una de las clases concretas va a implementar si quiere las opcionales
//pero todas tienen que implementar el paso 2
class ConcreteClassA extends AbstractClass {
	stepTwo() {
		console.log("Class_A : Step Two (overridden)");
	}
}

class ConcreteClassB extends AbstractClass {
	stepOne() {
		console.log("Class_B : Step One (overridden)");
	}

	stepTwo() {
		console.log("Class_B : Step Two. (overridden)");
	}

	stepThree() {
		console.log("Class_B : Step Three. (overridden)");
	}
}

//llamamos el template methodo y dependiendo de como se hayan construido va a ejecutar los metodos
// la primera va a ejecutar el paso 1 pero como no devuelve nada, no se va a ver ya que por default es asi
const CLASS_A = new ConcreteClassA();
CLASS_A.templateMethod();

//en cambio la b sobrescribe hasta la primera y ultima
const CLASS_B = new ConcreteClassB();
CLASS_B.templateMethod();
