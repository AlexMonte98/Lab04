package it.polito.tdp.lab04.model;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import java.util.*;
public class Model {
	
	CorsoDAO corsodao=new CorsoDAO();
	List<Corso>listaCorsi=new LinkedList<Corso>();
	
	public List<Corso> tuttiCorsi(){
		return this.corsodao.getTuttiICorsi();
	}

}
