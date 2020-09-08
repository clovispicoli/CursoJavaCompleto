package entidades;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Postar {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer gostos;

	private List<Comentario> comentarios = new ArrayList<>();

	public Postar() {
	}

	public Postar(Date momento, String titulo, String conteudo, Integer gostos) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.gostos = gostos;
	}


	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getGostos() {
		return gostos;
	}

	public void setGostos(Integer gostos) {
		this.gostos = gostos;
	}

	public List<Comentario> getComentarios(){
		return comentarios;
	}

	public void addComente(Comentario comente) {
		comentarios.add(comente);
	}
	public void removeComente(Comentario comente) {
		comentarios.remove(comente);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n ");
		sb.append(gostos);
		sb.append(" Likes  - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentario: \n");
		for(Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");

		}
		return sb.toString();
	}


}








