package it.polito.tdp.lab04.model;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import java.util.*;
public class Model {
	
	CorsoDAO corsodao=new CorsoDAO();
	List<Corso>listaCorsi=new LinkedList<Corso>();
	
	public List<Corso> tuttiCorsi(){
		return this.corsodao.getTuttiICorsi();
	}
	public List<String>tuttiCorsiStringhe(){
		List<String>temp=new LinkedList<>();
		for(Corso c:this.corsodao.getTuttiICorsi()) {
			temp.add(c.getNome());
		}
		String s=" ";
		temp.add(s);
		Collections.sort(temp);
		return temp;
		
	}
	public void riempimentoAutomatico(int matricola) {
		
	}

}
