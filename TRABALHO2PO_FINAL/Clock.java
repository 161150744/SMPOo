public class Clock
{
  private int porcentMemory;
  public Clock(){}

  public Clock(int porcentMemory)
  {
    this.porcentMemory = porcentMemory;
  }

  public int get()
  {
    return this.porcentMemory;
  }
}
