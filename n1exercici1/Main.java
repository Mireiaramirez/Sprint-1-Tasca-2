package t2n1exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Producte> colProductes = new ArrayList<Producte>();

		Producte producte1 = new Producte("Mac", 520);
		Producte producte2 = new Producte("Asus", 1000);
		colProductes.add(producte1);
		colProductes.add(producte2);
		Venda venta = new Venda(colProductes);

		try {
			venta.calcularTotal(colProductes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

/*
 * Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra
 * classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de
 * productes i el preu total de la venda.
 * 
 * La classe "Venda", té un mètode anomenat calcularTotal() que llança
 * l’excepció personalitzada VendaBuidaException i mostra per pantalla “Per fer
 * una venda primer has d’afegir productes” si la col·lecció de productes està
 * buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i
 * guardar la suma de tots els preus dels productes a l’atribut preu total de la
 * venda.
 * 
 * L’excepció personalitzada VendaBuidaException ha de ser filla de la classe
 * Exception. Al seu constructor li hem de passar el missatge “Per fer una venda
 * primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar
 * per pantalla amb el mètode getMessage() de l’excepció.
 * 
 * Escriu el codi necessari per a generar i capturar una excepció de tipus
 * ArrayIndexOutOfBoundsException.
 */
