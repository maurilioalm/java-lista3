package CollectionsAndEnums;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioEventos {

	private Map<String, Evento> eventos = new HashMap<String, Evento>();

	public RepositorioEventos(ArrayList<Evento> listaEventos) {
		for (Evento evento : listaEventos) {
			if (!eventos.containsKey(evento.getNome())) {
				eventos.put(evento.getNome(), evento);
			}
		}
	}

	public Map<String, Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Map<String, Evento> eventos) {
		this.eventos = eventos;
	}

	public boolean contemEvento(String nomeEvento) {
		if (eventos.containsKey(nomeEvento)) {
			return true;
		} else
			return false;
	}

	public List<Evento> ordenarPorData() {
		List<Evento> list = new ArrayList<Evento>();
		for (Evento evento : eventos.values()) {
			list.add(evento);
		}
		Collections.sort(list); // Para o Collections funcionar, Evento precisa implementar compareTo
		return list;
	}

	public void ordenarPorLocal(List<Evento> list) {
		Collections.sort(list, new Comparator<Evento>() {
			@Override
			public int compare(Evento e1, Evento e2) {
				return e1.getNome().compareTo(e2.getNome());
			}
		});
	}

	@Override
	public String toString() {

		return eventos.toString();
	}

	public static void main(String[] args) {

		Evento e1 = new Evento("Ana_Fest", CidadeEnum.RECIFE, LocalDateTime.of(2020, 01, 01, 01, 00));
		Evento e2 = new Evento("Elton_Fest", CidadeEnum.FORTALEZA, LocalDateTime.of(2020, 01, 01, 02, 00));
		Evento e5 = new Evento("Bob_Fest", CidadeEnum.NATAL, LocalDateTime.of(2020, 01, 01, 03, 00));
		Evento e4 = new Evento("Carlos_Fest", CidadeEnum.MACEIO, LocalDateTime.of(2020, 01, 01, 04, 00));
		Evento e3 = new Evento("Dilan_Fest", CidadeEnum.SALVADOR, LocalDateTime.of(2020, 01, 01, 05, 00));

		ArrayList<Evento> listaEventos = new ArrayList<Evento>();
		listaEventos.addAll(Arrays.asList(e1, e2, e3, e4, e5));

		// Ordena a lista de eventos dentro do repositorio por data
		RepositorioEventos repo = new RepositorioEventos(listaEventos);
		System.out.println(repo.ordenarPorData());

		// Ordena a lista de eventos dentro do repositorio por local
		repo.ordenarPorLocal(listaEventos);
		System.out.println(listaEventos);

		Evento e6 = new Evento("Ana_Fest", CidadeEnum.RECIFE, LocalDateTime.of(2020, 01, 01, 01, 00));
		// Verificar se o evento está no repositorio
		System.out.println(repo.contemEvento(e6.getNome()));

	}

}
