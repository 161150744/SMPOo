//package com.gnw.po.t2.simuladordememoria;

public class Processos
{
	private int name;
	private int clock;
	private int timeRun;
	private int sizeKb;
	
	public Processos (){}

	public Processos (int name, int clock, int timeRun, int sizeKb)
	{
		this.name = name;
		this.clock = clock;
		this.timeRun = timeRun;
		this.sizeKb = sizeKb;
	}

	public void setProcessos (int name, int clock, int timeRun, int sizeKb)
	{
		this.setName (name);
		this.setClock (clock);
		this.setTimeRun (timeRun);
		this.setSizeKb (sizeKb);
	}
	
	public void setName (int name)
	{
		this.name = name;
	}
	
	public void setClock (int clock)
	{
		this.clock = clock;
	}

	public void setTimeRun (int timeRun)
	{
		this.timeRun = timeRun;
	}

	public void setSizeKb (int sizeKb)
	{
		this.sizeKb = sizeKb;
	}

	public int getName ()
	{
		return this.name;
	}

	public int getClock ()
	{
		return this.clock;
	}

	public int getTimeRun ()
	{
		return this.timeRun;
	}

	public int getSizeKb ()
	{
		return this.sizeKb;
	}
}
