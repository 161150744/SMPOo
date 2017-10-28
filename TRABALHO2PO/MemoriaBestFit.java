//package com.gnw.po.t2.simuladordememoria;

//import com.gnw.po.t2.simuladordememoria.Memoria;
//import com.gnw.po.t2.simuladordememoria.EspacoMemoria;
//import com.gnw.po.t2.simuladordememoria.Processos;

//import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class MemoriaBestFit extends Memoria
{
	private ArrayList < EspacoMemoria > espacosVazios;

	public MemoriaBestFit ()
	{
		super ();
		this.espacosVazios = new ArrayList < EspacoMemoria > ();
		EspacoMemoria memoriaNull = new EspacoMemoria (0, super.memoria.size()-1, super.memoria.size());
		this.espacosVazios.add (memoriaNull);
	}

	public MemoriaBestFit (int sizeKb)
	{
		super (sizeKb);
		this.espacosVazios = new ArrayList < EspacoMemoria > ();
		EspacoMemoria memoriaNull = new EspacoMemoria (0, super.memoria.size()-1, super.memoria.size());
		this.espacosVazios.add (memoriaNull);
	}

	public void heuristica () 
	{

	}

	public void mergeHeuristica () 
	{

	}

	public void mergeSortHeuristica () 
	{

	}
}
