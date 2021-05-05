package br.dominio;

import javax.jws.WebService;

@WebService(endpointInterface = "br.dominio.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	
	@Override
	public String sayHelloWorld(String content) {
		return "Hello" + content + " !";
	}

}
