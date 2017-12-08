public class MemoryFirstFit extends Memory
{
    public MemoryFirstFit ()
    {
        super();
    }

    public MemoryFirstFit (int size)
    {
        super (size);
    }
    public void memoryManager(Process newProcess)
    {
        super.searchPartNull();
        this.sortPartMemo();
        for (int i = 0; i < partNull.size(); i++)
        {
            if(newProcess.getSize() <= partNull.get(i).getSize())
            {
                super.allocate(newProcess, partNull.get(i).getBegin());
                return;
            }
        }
    }

    public void printPartMemo()
    {
      for (int i = 0; i < partNull.size(); i++)
      {
        System.out.println ("partnull" + partNull.get(i).getSize() );
      }
    }

    public void sortPartMemo()
    {
        int flag = 0;
        while (flag == 0)
        {
            flag = 1;
            for (int i = 1; i < partNull.size(); i++)
            {
                if (partNull.get(i-1).getBegin() > partNull.get(i).getBegin())
                {
                    PartMemo aux = new PartMemo();
                    aux = partNull.get(i-1);
                    partNull.set(i-1, partNull.get(i));
                    partNull.set(i, aux);
                    flag = 0;
                }
            }
        }
    }
}
