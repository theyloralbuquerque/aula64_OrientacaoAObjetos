package entities;

public class Triangle {
	
		public double a; //
		public double b; // Atributos
		public double c; //
		
		
		public double area() {  // M�todo (se retorna um valor tem que colocar o tipo, (double, por exemplo), se n�o retorna nenhum valor coloca-se "void". 
			double p = (a + b + c) / 2.0;
			double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			return result;      // Retornar� o valor de result � chamada do m�todo.
		}
		
		

	}

