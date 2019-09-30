package estacionamento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	public void test() {

		
		Estacionamento estacionamento = new Estacionamento();

		
		//Testes de Classes de Equivalencia para o método cadastrarCarro
		
		//1 classe de equivalência: 0 carros (lista vazia)

		assertEquals(estacionamento.getCarros().size(), 0);
		
		//1 classe de equivalência: 1 carro (guardando 1 objeto)

		estacionamento.cadastrarCarro(new Carro("AAA1111", new Especificacao("VW", "fusca", "verde")));
		
		assertEquals(estacionamento.getCarros().size(), 1);
		
		//1 classe de equivalência: n carros (utilizando a Lista para guardar n carros)

		estacionamento.cadastrarCarro(new Carro("BBB1111", new Especificacao("VW", "fusca", "amarelo")));
		estacionamento.cadastrarCarro(new Carro("CCC1111", new Especificacao("VW", "variant", "azul")));
		
		assertEquals(estacionamento.getCarros().size(), 3);
		
	}


}
