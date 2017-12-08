import java.util.ArrayList;

public abstract class Memory
{
    protected int size;
    ArrayList < PartMemo > partNull;
    ArrayList < Process > memory;


    public Memory ()
    {
        partNull = new ArrayList < PartMemo > ();
        memory = new ArrayList < Process > ();
        this.size = 1024;
        PartMemo firstPart = new PartMemo (0, 1023, 1024);
        partNull.add(firstPart);
        Process processNull = new Process (0, 0, 0, 0);
        for (int i = 0; i < 1024; i++)
        {
            memory.add(processNull);
        }
    }

    public Memory (int size)
    {
        partNull = new ArrayList < PartMemo > ();
        memory = new ArrayList < Process > ();
        this.size = size;
        PartMemo firstPart = new PartMemo (0, size-1, size);
        partNull.add(firstPart);
        Process processNull = new Process (0, 0, 0, 0);
        for (int i = 0; i < size; i++)
        {
            memory.add(processNull);
        }
    }

    public int size()
    {
      return this.size;
    }

    public boolean testMemoryNull()
    {
      for (int i = 0; i < memory.size(); i++)
      {
        if (memory.get(i).getPid() > 0)
        {
          return true;
        }
      }
      return false;
    }

    public void print()
    {
      for (int i = 0; i < memory.size(); i++)
      {
        System.out.println(memory.get(i).getPid());
      }
    }

    public Process get(int index)
    {
        return this.memory.get(index);
    }

    public abstract void memoryManager (Process newProcess);

    public abstract void sortPartMemo ();

    public void removeNull (Process process)
    {
        partNull.remove(process);
    }

    public void allocate (Process newProcess, int begin)
    {
        int sizeProcess = newProcess.getSize();
        for (int i = 0; i < sizeProcess; i++)
        {
            memory.set (begin + i, newProcess);
        }
        searchPartNull();
    }

    public void exec (int pid, int time)
    {
        Process aux = new Process (0,0,0,0);
        for (int i = 0; i < memory.size(); i++)
        {
            if(memory.get(i).getPid() == pid)
            {
                aux = memory.get(i);
                aux.setTime(time - 1);
                memory.set(i, aux);
                if (memory.get(i).getTime() <= 0)
                {
                  aux = memory.get(i);
                  aux.setPid(0);
                  memory.set(i, aux);
                  searchPartNull();
                }
            }

        }
    }

    public int porcent()
    {
      int cont = 0;
      for (int i = 0; i < memory.size(); i++)
      {
        if (memory.get(i).getPid() > 0)
        {
          cont++;
        }
      }
      return cont;
    }

    public void searchPartNull()
    {
        partNull.clear();
        int nullBegin = -1;
        int nullEnd = -1;
        int nullSize = 0;

        for (int i = 0; i < this.size; i++)
        {
            if(memory.get(i).getPid() == 0)
            {
                nullSize++;
                if(i - 1 >= 0)
                {
                    if(memory.get(i-1).getPid() > 0)
                    {
                        nullBegin = i;
                        nullSize = 1;
                    }
                }

                else
                {
                    nullBegin = i;
                    nullSize = 1;
                }

                if (i + 1 <= memory.size()-1)
                {
                    if(memory.get(i+1).getPid() > 0)
                    {
                        nullEnd = i;
                        PartMemo partMemo = new PartMemo (nullBegin, nullEnd, nullSize);
                        partNull.add (partMemo);
                        nullSize = 0;
                        nullBegin = -1;
                        nullEnd = -1;

                    }
                }

                if (i == memory.size()-1)
                {
                    nullEnd = i;
                    PartMemo partMemo = new PartMemo (nullBegin, nullEnd, nullSize);
                    partNull.add (partMemo);
                    nullSize = 0;
                    nullBegin = -1;
                    nullEnd = -1;
                }
            }
            else
            {
                if(i - 1 > 0)
                {
                    if (memory.get(i-1).getPid() == 0)
                    {
                        nullEnd = i -1;
                        PartMemo partMemo = new PartMemo (nullBegin, nullEnd, nullSize);
                        partNull.add (partMemo);
                        nullSize = 0;
                        nullBegin = -1;
                        nullEnd = -1;
                    }
                }
            }

        }
    }

}
