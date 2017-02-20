package com.usac.testing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Imagen implements Border {
	BufferedImage fondo;

	// ruta va a ser donde va a ir la ruta de tu imagen
	public Imagen(String ruta) {
		try {
			URL url = new URL(ruta);
			fondo= ImageIO.read(url.openStream());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}

	}

	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		g.drawImage(fondo, 0, 0, width, height, null);
	}

	public Insets getBorderInsets(Component c) {
		return new Insets(0, 0, 0, 0);
	}

	public boolean isBorderOpaque() {
		return true;
	}
}
