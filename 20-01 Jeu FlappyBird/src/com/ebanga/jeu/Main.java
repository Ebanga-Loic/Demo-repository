package com.ebanga.jeu;

import javax.swing.JFrame;

public class Main {

	public static JFrame fenetre;
	public static Scene scene;

	public static void main(String[] args) {
		fenetre = new JFrame("Flappy Bird");
		scene = new Scene();

		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(300, 425);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);

		fenetre.setContentPane(scene);
		fenetre.setVisible(true);

	}

}
