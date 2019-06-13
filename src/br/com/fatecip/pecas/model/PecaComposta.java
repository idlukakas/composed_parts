package br.com.fatecip.pecas.model;

import java.util.ArrayList;
import java.util.List;

public class PecaComposta extends Pe�a  {
	
	private static class Par{
		public final Pe�a peca;
		public final int quantidade;
		public Par(Pe�a peca, int quantidade) {
			this.peca = peca;
			this.quantidade = quantidade;
		}
	}	

		
	private List<Par> pe�as;
	

	public List<Par> addSubPe�a(Par par){
		this.pe�as.add(par);
		return this.pe�as;
	}
	public PecaComposta(String nome) {
		super(nome);
		this.pe�as = new ArrayList<>(); 
		}
	
}
