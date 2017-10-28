//package com.gnw.po.t2.simuladordememoria;

public class EspacoMemoria
{
	private int espacoBegin;
	private int espacoEnd;
	private int espacoSize;

	public EspacoMemoria (){}

	public EspacoMemoria (int espacoBegin, int espacoEnd, int espacoSize)
	{
		this.setEspacoBegin (espacoBegin);
		this.setEspacoEnd (espacoEnd);
		this.setEspacoSize (espacoSize);
	}

	public void setEspacoBegin (int espacoBegin)
	{
		this.espacoBegin = espacoBegin;
	}

	public void setEspacoEnd (int espacoEnd)
	{
		this.espacoEnd = espacoEnd;
	}

	public void setEspacoSize (int espacoSize)
	{
		this.espacoSize = espacoSize;
	}

	public void setEspacoMemoria (int espacoBegin, int espacoEnd, int espacoSize)
	{
		this.setEspacoBegin (espacoBegin);
		this.setEspacoEnd (espacoEnd);
		this.setEspacoSize (espacoSize);
	}

	public int getEspacoBegin ()
	{
		return this.espacoBegin;
	}

	public int getEspacoEnd ()
	{
		return this.espacoEnd;
	}

	public int getEspacoSize()
	{
		return this.espacoSize;
	}
}
