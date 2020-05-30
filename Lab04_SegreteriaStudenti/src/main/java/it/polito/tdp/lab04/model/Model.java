package it.polito.tdp.lab04.model;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import java.util.*;
public class Model {
	
	CorsoDAO corsodao=new CorsoDAO();
	List<Corso>listaCorsi=new LinkedList<Corso>();
	
	public List<Corso> tuttiCorsi(){
		for (Corso c:corsodao.getTuttiICorsi()) {
			if(c!=null) {
				listaCorsi.add(new Corso(c.getCodins(),c.getCrediti(),
						c.getNome(),c.getPd()));				
			}			
		}
		return listaCorsi;		
	}

}
