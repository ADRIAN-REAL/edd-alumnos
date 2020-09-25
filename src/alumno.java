public class alumno {
    private String name;
    private double edad;

    public alumno()
    {

    }
    public void setName(String n)
    {
        this.name = n;
    }
    public void setEdad(double n)
    {
        this.edad = n;
    }
    public String getName()
    {
        return this.name;
    }
    public double getEdad()
    {
        return this.edad;
    }
    public String toString()
    {
        return this.name+" "+this.edad;
    }
}

