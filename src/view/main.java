package view;

import java.util.Random;

import javax.swing.JOptionPane;

import br.com.KauanPaulino.ListaObject.Lista_Object;
import controller.PlayerController;

public class main {
	public static void main(String[] args) {
		Lista_Object l = new Lista_Object();
		PlayerController p = new PlayerController();
		Random gerador = new Random();
		int opc=0;
		while(opc!=9) {
			opc=Integer.parseInt(JOptionPane.showInputDialog("1-Adicionar Musica na playlist\n2-Remover Musica PlayList\n3-ExecutarPlaylist\n9-Fechar Vitufy"));
			switch(opc) {
				case 1: String nomemusica= JOptionPane.showInputDialog("Digite o nome da musica");
						String nomeArtista= JOptionPane.showInputDialog("Digite o nome do artista");
						int duracao = gerador.nextInt(10)+1;
						String musicatxt=nomemusica+";"+nomeArtista+";"+duracao;
						p.adicionaMusica(l, musicatxt);
						break;
				case 2: int pos= Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao que deseja remover"));
						p.removeMusica(l, pos);
						break;
				case 3: p.executarPlaylist(l);
						break;
				case 9: JOptionPane.showMessageDialog(null, "Obrigado por usar Vitufy");
						break;
				default: JOptionPane.showMessageDialog(null, "Opçao invalida");
						 break;		
				
				
			}
		}
	}
}
