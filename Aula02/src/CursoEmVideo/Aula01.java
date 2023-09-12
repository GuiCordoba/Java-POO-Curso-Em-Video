package CursoEmVideo;

public class Aula01 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f; *atributo privado
		c1.carga = 40;
		// c1.tampada = true;  *atributo privado
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		
	}

}
