import java.util.ArrayList;
public abstract class ListProcess
{
    protected ArrayList < Process > listProcess;

    protected ListProcess ()
    {
        listProcess = new ArrayList < Process > ();
    }

    public void print()
    {
      for (int i = 0; i < listProcess.size(); i++)
      {
        System.out.println(listProcess.get(i).getPid());
      }
    }

    public Process exec ()
    {
      Process aux = new Process (0,0,0,0);
      Process aux2 = new Process (0,0,0,0);
      if (listProcess.size() > 0)
      {
        aux = listProcess.get(0);

        if (listProcess.get(0).getTime() > 0)
        {
          aux2 = aux;
          aux2.setTime(aux.getTime()-1);
          listProcess.set(0, aux2);
        }
        else
        {
          listProcess.remove (aux);
        }
      }
      return aux;
    }

    public void addProcess (Process newProcess)
    {
      int flag = 1;

      for (int i = 0; i < listProcess.size(); i++)
      {
        if (newProcess.getPid() == listProcess.get(i).getPid())
        {
          flag = 0;
        }
      }
      if (newProcess.getPid() > 0 && flag == 1)
      {
        listProcess.add(newProcess);
      }
    }

    public void addProcess (int index, Process newProcess)
    {
      int flag = 1;

      for (int i = 0; i < listProcess.size(); i++)
      {
        if (newProcess.getPid() == listProcess.get(i).getPid())
        {
          flag = 0;
        }
      }
      if (newProcess.getPid() > 0 && flag == 1)
      {
        listProcess.add(index, newProcess);
      }


    }

    public void clearProgram ()
    {
        listProcess.clear();
    }

    public void setProcess (int index, Process newProcess)
    {
        listProcess.set(index, newProcess);
    }

    public void removeBegin ()
    {
        listProcess.remove(0);
    }

    public void removeEnd ()
    {
        listProcess.remove(listProcess.size()-1);
    }

    public void remove (Process process)
    {
        listProcess.remove(process);
    }

    public void remove (int index)
    {
        listProcess.remove(index);
    }

    public Process getProcess (int index)
    {
        return listProcess.get(index);
    }

    public int size()
    {
      return this.listProcess.size();
    }

    public boolean test(int sizeMemory)
    {
      for (int i = 0; i < listProcess.size(); i++)
      {
        if (listProcess.get(i).getSize() <= sizeMemory && listProcess.get(i).getTime() > 0)
        {
          return true;
        }
      }
      return false;
    }

    public boolean testProcess (Process process)
    {
      for (int i = 0; i < listProcess.size(); i++)
      {
        if (listProcess.get(i).getPid() == process.getPid())
        {
          return true;
        }
      }
      return false;
    }

    public abstract void sortReady();

    public void sort ()
    {
        int flag = 0;
        while (flag == 0)
        {
            flag = 1;
            for (int i = 1;i < listProcess.size(); i++)
            {
                if (listProcess.get(i - 1).getClock() > listProcess.get(i).getClock())
                {
                    Process aux = new Process();
                    aux = listProcess.get(i-1);
                    listProcess.set((i-1), listProcess.get(i));
                    listProcess.set((i), aux);
                    flag = 0;
                }
            }
        }
    }

}
