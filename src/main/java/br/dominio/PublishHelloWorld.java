package br.dominio;

import javax.xml.ws.Endpoint;

public class PublishHelloWorld {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/servico/helloworld?wsdl", new HelloWorldImpl());
		System.out.println("Serviço publicado com sucesso! Dattebayoooooo!!!");
	}

}
