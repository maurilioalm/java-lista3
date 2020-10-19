package CollectionsAndEnums;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;

public class TesteSet {

	public static void main(String[] args) {
		
		HashSet<Evento> eventos = new HashSet<Evento>();
		
		Evento e1 = new Evento("Ana_Fest", CidadeEnum.RECIFE, LocalDateTime.of(2020, 01, 01, 01, 00));
		Evento e2 = new Evento("Elton_Fest", CidadeEnum.FORTALEZA, LocalDateTime.of(2020, 01, 01, 02, 00));
		Evento e5 = new Evento("Bob_Fest", CidadeEnum.NATAL, LocalDateTime.of(2020, 01, 01, 03, 00));
		Evento e4 = new Evento("Carlos_Fest", CidadeEnum.MACEIO, LocalDateTime.of(2020, 01, 01, 04, 00));
		Evento e3 = new Evento("Dilan_Fest", CidadeEnum.SALVADOR, LocalDateTime.of(2020, 01, 01, 05, 00));
		
		eventos.addAll(Arrays.asList(e1,e2,e3,e4,e5));
		System.out.println();
		System.out.println("HashSet: " + eventos);
		System.out.println();
		eventos.add(e1);
		System.out.println();
		System.out.println("HashSet: " + eventos);

	}

}
