package CollectionsAndEnums;

import java.time.LocalDateTime;

public class Evento implements Comparable<Evento> {

	private String nome;
	private CidadeEnum local;
	private LocalDateTime dataHora;

	public Evento(String nome, CidadeEnum local, LocalDateTime dataHora) {
		this.nome = nome;
		this.local = local;
		this.dataHora = dataHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CidadeEnum getLocal() {
		return local;
	}

	public void setLocal(CidadeEnum local) {
		this.local = local;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHora == null) ? 0 : dataHora.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		System.out.println(nome + " HashCode result: " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nome do Evento =" + nome + ", Cidade do Evento =" + local + ", dataHora =" + dataHora + " \n";
	}

	@Override
	public int compareTo(Evento outroEvento) {
		return this.dataHora.compareTo(outroEvento.getDataHora());
	}
}
