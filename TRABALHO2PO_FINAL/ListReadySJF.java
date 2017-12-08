public class ListReadySJF extends ListProcess
{
    public ListReadySJF()
    {
        super();
    }

    public void sortReady()
    {
        int flag = 0;
        while (flag == 0)
        {
            flag = 1;
            for (int i = 1;i < listProcess.size(); i++)
            {
                if (listProcess.get(i - 1).getTime() > listProcess.get(i).getTime())
                {
                    Process aux;
                    aux = listProcess.get(i-1);
                    listProcess.set((i-1), listProcess.get(i));
                    listProcess.set((i), aux);
                    flag = 0;
                }
            }
        }
    }
}
