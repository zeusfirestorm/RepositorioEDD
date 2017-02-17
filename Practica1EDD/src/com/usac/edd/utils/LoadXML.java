package com.usac.edd.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import com.usac.edd.interfaz.PrincipalMenu;

public class LoadXML {
	public boolean cargarXML() {
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("C:\\Users\\christiangarrido\\Desktop\\Test12.xml");
		boolean succes = false;
		try {
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();

			String dimensionValue = rootNode.getChildTextTrim("dimension");
			System.out.println("Dimension Value: " + dimensionValue);

			List dobles = rootNode.getChildren("dobles");
			// System.out.println("Listas lenght: " + dobles.size());
			for (int doble_i = 0; doble_i < dobles.size(); doble_i++) {
				Element doble = (Element) dobles.get(doble_i);
				List casillasDobles = doble.getChildren("casilla");
				// System.out.println("CasillasX lenght: "+ casillas.size());
				for (int casillaDoble_i = 0; casillaDoble_i < casillasDobles.size(); casillaDoble_i++) {
					Element casillaDoble = (Element) casillasDobles.get(casillaDoble_i);
					String xValue = casillaDoble.getChildTextTrim("x");
					String yValue = casillaDoble.getChildTextTrim("y");
					System.out.println("Dobles value X: " + xValue);
					System.out.println("Dobles value Y: " + yValue);
				}
			}

			List triples = rootNode.getChildren("triples");
			for (int triple_i = 0; triple_i < triples.size(); triple_i++) {
				Element triple = (Element) triples.get(triple_i);
				List casillasTriples = triple.getChildren("casilla");
				for (int casillaTriple_i = 0; casillaTriple_i < casillasTriples.size(); casillaTriple_i++) {
					Element casillaTriple = (Element) casillasTriples.get(casillaTriple_i);
					String xValue = casillaTriple.getChildTextTrim("x");
					String yValue = casillaTriple.getChildTextTrim("y");
					System.out.println("Triple value X: " + xValue);
					System.out.println("Triple value Y: " + yValue);
				}
			}

			List diccionarios = rootNode.getChildren("diccionario");
			for (int diccionario_i = 0; diccionario_i < diccionarios.size(); diccionario_i++) {
				Element diccionario = (Element) diccionarios.get(diccionario_i);
				List palabras = diccionario.getChildren("palabra");
				for (int palabra_i = 0; palabra_i < palabras.size(); palabra_i++) {
					Element palabra = (Element) palabras.get(palabra_i);
					String palabraValue = palabra.getText();
					// System.out.println("Palabra: " + palabraValue);
					PrincipalMenu.listaPalabras.agregarAlInicio(palabraValue);
				}
			}
			if (dimensionValue != null) {
				if (Integer.parseInt(dimensionValue) == 0) {
					succes = false;
				}
			}
			return true;
		} catch (IOException io) {
			System.out.println(io.getMessage());
			return false;
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
			return false;
		}
	}
}
