public class PartMemo 
{
    private int begin;
    private int end;
    private int size;

    public PartMemo(){}

    public PartMemo (int begin, int end, int size)
    {
        this.begin = begin;
        this.end = end;
        this.size = size;
    }

    public int getBegin()
    {
        return this.begin;
    }

    public int getEnd()
    {
        return this.end;
    }

    public int getSize()
    {
        return this.size;
    }
}
