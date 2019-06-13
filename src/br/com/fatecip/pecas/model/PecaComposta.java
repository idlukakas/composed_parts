package br.com.fatecip.pecas.model;

import java.util.ArrayList;
import java.util.List;

public class PecaComposta extends Peça  {
	
	private static class Par{
		public final Peça peca;
		public final int quantidade;
		public Par(Peça peca, int quantidade) {
			this.peca = peca;
			this.quantidade = quantidade;
		}
	}	

		
	private List<Par> peças;
	

	public List<Par> addSubPeça(Par par){
		this.peças.add(par);
		return this.peças;
	}
	public PecaComposta(String nome) {
		super(nome);
		this.peças = new ArrayList<>(); 
		}
	
}
