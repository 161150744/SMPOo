//package com.gnw.po.t2.simuladordememoria;

//import com.gnw.po.t2.simuladordememoria.Memoria;
//import com.gnw.po.t2.simuladordememoria.EspacoMemoria;
//import com.gnw.po.t2.simuladordememoria.Processos;

//import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class MemoriaWorstFit extends Memoria
{
	private EspacoMemoria espacoMaior;	

	public MemoriaWorstFit ()
	{
		super ();
		this.espacoMaior = new EspacoMemoria ();
		this.espacoMaior.setEspacoMemoria (0, super.memoria.size()-1, super.memoria.size());
	}

	public MemoriaWorstFit (int sizeKb)
	{
		super (sizeKb);
		this.espacoMaior = new EspacoMemoria ();
		this.espacoMaior.setEspacoMemoria (0, super.memoria.size()-1, super.memoria.size());
	}

	public void heuristica ()
	{
		super.mergeSortProcessos(0, super.processos.size()-1);
		this.searchEspacoMaior ();
		int flag = 0;
		clock++;
		ArrayList < Processos > processosaux = new ArrayList < Processos > ();
		ArrayList < Processos > processosaux2 = new ArrayList < Processos > ();
		Processos aux = new Processos ();
		//System.out.println ("c++ eh melhor!");
		while(super.processos.get(0).getClock() <= clock && super.processos.size() > 0)//aqui
		{
			flag = 0;
			//System.out.println(super.processos.get(0).getName());
			//System.out.println(flag);
			for (int k = 0; k < processosaux.size(); k++)
			{
				if (super.processos.get(0).getName() == processosaux.get(k).getName())//aqui tbm
				{
					flag = 1;	
					//System.out.println("Estou aqui!");	
				}
			}
			if (flag == 0)
			{
				//System.out.println("vxkwegfiuhwrkgwrkuy");
				processosaux.add (super.processos.get(0));
				super.processos.remove(0);
			}
		}

		for (int i = 0; i < processosaux.size(); i++)
		{
			flag = 0;
			if (processosaux.get(i).getSizeKb() <= this.espacoMaior.getEspacoSize())
			{
				super.aloca (processosaux.get(i), espacoMaior.getEspacoBegin());
				flag = 1;
			}
			this.searchEspacoMaior();
			if (this.espacoMaior.getEspacoSize() == memoria.size() && flag == 0)
			{
				flag = 1;
			}
			if (flag == 0)
			{
				processosaux2.add (processosaux.get(i));
			}
		}
		for (int y = 0; y < processosaux2.size(); y++)
		{
			super.processos.add (0, processosaux2.get(y));
		}

		if (super.processos.size() == 0)//fazer
		{
			if (super.testeMemoria())
			{
				return;
			}
		}

		super.ciclos.add (super.memoria);
		super.executa();
		super.printMemoria ();
		this.heuristica();
	}

	public void searchEspacoMaior () 
	{
		int iBegin = 0;
		int iEnd = 0;
		int iSize = 0;
		ArrayList < EspacoMemoria > espacosVazios = new ArrayList < EspacoMemoria > ();
		for (int i = 0; i < super.memoria.size(); i++)
		{
			if (super.memoria.get(i).getName() == 0)
			{
				iSize ++;
				if (i - 1 >= 0)
				{
					if (super.memoria.get(i - 1).getName() > 0)
					{
						iBegin = i;
					}
				}
				else
				{
					iBegin = i;
				}
				if (i == super.memoria.size() - 1)
				{
					iEnd = i;
					EspacoMemoria aux = new EspacoMemoria (iBegin, iEnd, iSize);
					espacosVazios.add (aux);
					iSize = 0;
					iBegin = -1;
					iEnd = -1;
				}
			}
			else
			{
				if (i - 1 >= 0)
				{
					if (super.memoria.get (i - 1).getName() == 0)
					{
						iEnd = i - 1;
					}
				}
				else
				{
					iEnd = iBegin;
				}
				if (iBegin >= 0 && iEnd >= 0)
				{
					EspacoMemoria aux = new EspacoMemoria (iBegin, iEnd, iSize);
					espacosVazios.add(aux);
					iSize = 0;
					iBegin = 0;
					iEnd = 0;
				}
			}
		}
		this.espacoMaior.setEspacoMemoria (espacosVazios.get(0).getEspacoBegin(), espacosVazios.get(0).getEspacoEnd(), espacosVazios.get(0).getEspacoSize());
		for (int j = 0; j < espacosVazios.size(); j++)
		{
			if (this.espacoMaior.getEspacoSize() < espacosVazios.get(j).getEspacoSize())
			{
				this.espacoMaior.setEspacoMemoria (espacosVazios.get(j).getEspacoBegin(), espacosVazios.get(j).getEspacoEnd(), espacosVazios.get(j).getEspacoSize());
			}
		}
	}	
}
