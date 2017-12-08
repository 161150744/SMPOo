public class Process
{
    private int pid;
    private int size;
    private int time;
    private int clock;

    public Process(){}

    public Process(int pid, int size, int time, int clock)
    {
        this.pid = pid;
        this.size = size;
        this.time = time;
        this.clock = clock;
    }

    public void setPid (int pid)
    {
        this.pid = pid;
    }

    public void setSize (int size)
    {
        this.size = size;
    }

    public void setTime (int time)
    {
        this.time = time;
    }

    public int getPid ()
    {
        return this.pid;
    }

    public int getSize ()
    {
        return this.size;
    }

    public int getTime ()
    {
        return this.time;
    }

    public int getClock()
    {
        return this.clock;
    }

    public void setClock()
    {
        this.clock = clock;
    }

}
