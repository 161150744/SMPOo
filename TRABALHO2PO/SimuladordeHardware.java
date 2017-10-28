//package com.gnw.po.t2.sinuladordehardware;

//import com.gnw.po.t2.silumadordememoria.*;

public class SimuladordeHardware
{
	public static void main (String[] args)
	{
		//SimuladordeMemoria simuladorMemo = new SimuladordeMemoria ();
		MemoriaWorstFit memoria = new MemoriaWorstFit ();
		memoria.pushFileSetProcessos (args[0]);
		memoria.printProcessos();
		//memoria.heuristica();
	}

}
