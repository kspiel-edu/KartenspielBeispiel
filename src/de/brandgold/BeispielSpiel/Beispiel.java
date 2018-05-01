package de.brandgold.BeispielSpiel;

import de.brandgold.Kartenspiel.Spiel;
import de.brandgold.Kartenspiel.Hilf.Farbe;
import de.brandgold.Kartenspiel.Hilf.Punkt;

public class Beispiel extends Spiel {

	@Override
	public void beiBeginn() {
		System.out.println("Beginn.");		
	}

	@Override
	public void beiEnde() {
		System.out.println("Ende.");
	}

	@Override
	public void beiLogik() {
		
	}

	@Override
	public void beiZeichnen() {
		zeichneRechteck(new Punkt(50, 50), 50, 50, Farbe.ORANGE.dunkler(0.5));
		
		for (int i = 0; i < 30; i++)
			zeichneKreis(new Punkt(100 + (int)(Math.sin(i)*30), 50 + i*30), 20, Farbe.ROT.dunkler(0.5 * Math.sin(i)));
	}

}
