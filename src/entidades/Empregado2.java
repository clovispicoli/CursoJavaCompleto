package entidades;

public class Empregado2 {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Empregado2() {
	}

	public Empregado2(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void  aumentarSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
