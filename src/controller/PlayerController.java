package controller;

import br.com.KauanPaulino.ListaObject.Lista_Object;
import model.Musica;

public class PlayerController {
	
	//adicionar musica;
	public void adicionaMusica(Lista_Object lista, String musica) {
		String vt[] = musica.split(";");
		Musica m = new Musica();
		m.nome=vt[0];
		m.nomeArtista=vt[1];
		int duracaoint = Integer.parseInt(vt[2]);
		m.duracao= duracaoint;
		boolean status = lista.isEmpty();
		if(status) {
			lista.addFirst(m);
		}else {
			try {
				lista.addLast(m);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//remover musica;
	
	public void removeMusica(Lista_Object lista, int posicao) {
		try {
			lista.remove(posicao);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//executar playlist
	
	public void executarPlaylist(Lista_Object lista) {
		int tamanho = lista.size();
		for(int i=0;i<tamanho;i++) {
			try {
				Musica m = (Musica) lista.get(i);
				System.out.println(m);
				Thread.sleep(m.duracao*1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}