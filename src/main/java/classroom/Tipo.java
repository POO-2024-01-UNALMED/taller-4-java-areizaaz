package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	//private String nombre;,String nombre
	 Tipo(int codigo) {
		this.codigo = codigo;
		//this.nombre = nombre;
	}
}
