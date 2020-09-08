package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalho;

public class Trabalhador {

	private String nome;
	private NivelTrabalho nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	
	private List<ContratoHora> contratos = new ArrayList<>();

	public Trabalhador() {

	}

	public Trabalhador(String nome, NivelTrabalho nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

//	public Trabalhador(String nome2, String valueOf, double salarioBase2, Departamento departamento2) {
//		// TODO Auto-generated constructor stub
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double rendimento(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (ContratoHora c : contratos ) {
			cal.setTime(c.getData());
			int c_anos = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_anos && mes == c_mes) {
				soma += c.valorTotal();
				
			}
			
		}
		
		return soma;
		
	}
	
	
}
