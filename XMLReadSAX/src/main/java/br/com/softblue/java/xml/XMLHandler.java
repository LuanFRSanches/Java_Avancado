package br.com.softblue.java.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler extends DefaultHandler {

	private StringBuilder texto;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Começo o parse!");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("Terminou o parse!");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("usuario")) {
			String id = attributes.getValue("id");
			System.out.println("LEu o ID" + id);
		} else {
			texto = new StringBuilder();
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("nome")) {
			System.out.println("Nome: " + texto);
		} else if (qName.equals("idade")) {
			System.out.println("Idade: " + texto);
		} else if (qName.equals("email")) {
			System.out.println("Email: " + texto);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		texto.append(ch, start, length);
	}

	@Override
	public void error(SAXParseException e) throws SAXException {

	}

}
