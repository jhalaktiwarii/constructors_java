
class Constructors
{
    Constructors()
    {
        System.out.println("this is zero argument constructor");
    }
    Constructors(int i)
    {
        System.out.println(i);
    }
    Constructors(int i, String str)
    {
        System.out.println(i);
        System.out.println(str);
    }
public static void main(String[] args)
    {
        Constructors t1=new Constructors();
        Constructors t2=new Constructors(67);
        Constructors t3=new Constructors(100,"Hello");
    }
}