//Marcelo Aceituno R
//Full Stack JAVA 0034
//Guardia del Zoológico: Parte 2
public class Bat {
	
	private int energia = 300;

	public Bat() {
		
	}
	
	public void fly() {		
		int level = this.energia -=50; 		
		System.out.println("Murcielago chirría al despegar y volar... !!Su energia disminuye 50 pts!! >> "+level+ " pts.");	
	}
	
	public void eatHumans() {
		int level = this.energia +=25;		
		System.out.println("UFF, un humano menos... bueno, no importa... !!Aumenta su energia en 25 pts!! >> "+level+ " pts.");
	}
	
	public void attackTown() {
		int level = this.energia -=100;		
		System.out.println("Murcielago esta atacando la ciudad... !!Su energia disminuye 100 pts!! >> "+level+ " pts.");
	}
	
	public void displayEnergy() {
		System.out.println("Nivel de Energia <Murcielago>: " +this.energia+ " pts.");
	}
}
