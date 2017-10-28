//package com.gnw.po.t2.simuladordememoria;

//import com.gnw.po.t2.simuladordememoria.EspacoMemoria;
//import com.gnw.po.t2.simuladordememoria.Processos;

//import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class Memoria
{
	protected int clock;
	protected int sizeKb;
	protected ArrayList < Processos > memoria;
	protected ArrayList < Processos > processos;
	protected ArrayList < ArrayList < Processos > > ciclos;
	
	public Memoria ()
	{
		memoria = new ArrayList < Processos >();
		processos = new ArrayList < Processos >();
		ciclos = new ArrayList < ArrayList < Processos > >();
		clock = 0;
		sizeKb = 1024;
		Processos nullp = new Processos (0, 0, 0, 0);
		for (int i = 0; i < sizeKb; i++)
		{
			memoria.add (nullp);
		}
		ciclos.add (memoria);
	}

	public  Memoria (int sizeKb)
	{
		memoria = new ArrayList < Processos > ();
		processos = new ArrayList < Processos > ();
		ciclos = new ArrayList < ArrayList < Processos > > ();
		clock = 0;
		this.sizeKb = sizeKb;
		Processos nullp = new Processos (0, 0, 0, 0);
		for (int i = 0; i < sizeKb; i++)
		{
			memoria.add (nullp);
		}
		ciclos.add (memoria);
	}	

	public void mergeProcessos (int begin, int middle, int end)
	{//problemas aqui <--------------------------------------------------------@
		ArrayList < Processos > aux1 = new ArrayList < Processos >();

		aux1 = this.processos;

		int i1 = begin, i2 = middle, i3 = middle - 1, au = 0, i = 0;

		while (i1 <= i3 && i2 <= end )
		{
			if (processos.get(i1).getClock() < processos.get(i2).getClock())
			{
				aux1.set(au, processos.get(i1));
				i1++;
			}
			else
			{
				aux1.set(au, processos.get(i2));
				i2++;
			}
			au++;
		}

		while (i1 <= i3)
		{
			aux1.set(au, processos.get(i1));
			au++;
			i1++;
		}
		while (i2 <= end)
		{
			aux1.set(au, processos.get(i2));
			au++;
			i2++;
		}	

		for (i = 0; i < au; i++)
		{
			processos.set((i+begin), aux1.get(i));
		}
	}
		
	public void mergeSortProcessos (int begin, int end)
	{
		if (begin < end)
		{
			int middle = ((begin + end)/2);
			mergeSortProcessos (begin, middle);
			mergeSortProcessos (middle + 1, end);
			mergeProcessos (begin, middle + 1, end);
		}
	}

	public void aloca (Processos p, int begin)
	{
		for (int i = begin; i < begin + p.getSizeKb(); i++)
		{
			memoria.add(i, p);
		}
	}

	public void executa ()
	{
		for (int i = 0; i < memoria.size(); i++)
		{
			memoria.get(i).setTimeRun (memoria.get(i).getTimeRun() - 1);
			if (memoria.get(i).getTimeRun() == 0)
			{
				memoria.get(i).setName (0);
			}
		}
	}

	public boolean testeMemoria ()
	{
		for (int i = 0; i < this.memoria.size(); i++)
		{
			if (this.memoria.get(i).getName() > 0)
			{
				return false;
			}
		}
		return true;
	}
		
	public void pushFileSetProcessos (String nameOfFile)
	{
		File file = new File (nameOfFile);
		if (file.exists())
		{
			try 
			{
				FileReader arq = new FileReader(nameOfFile);
				BufferedReader lerArq = new BufferedReader(arq);
				String linha = new String ();
				linha = lerArq.readLine();
				String [] numElementos = new String [1];
				numElementos = linha.split(" ");
				for (int i = 0; i < Integer.parseInt(numElementos[0]); i++) 
				{
					String linha2 = new String ();
					linha2 = lerArq.readLine();
					String [] s = new String [4];
					s = linha2.split(" ");
					Processos aux = new Processos ();
					aux.setProcessos(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
					this.processos.add (aux);
				}
 
				arq.close();
			} 
			catch (IOException e) 
			{
				System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			}	
		}
	}

	abstract void heuristica ();

	public void printMemoria ()
	{
		int i = 0;
		for (i = 0; i < this.memoria.size(); i++)
		{
			System.out.println (this.memoria.get(i).getName());
		}
	}

	public void printProcessos ()
	{
		this.mergeSortProcessos (0, this.processos.size()-1);
		for (int i = 0; i < this.processos.size(); i++)
		{
			System.out.println (this.processos.get(i).getName());
		}
	}
}
