//ADDCN = Addition of Complex Numbers;
//different types of constructors 

class complex_numbers
{
    int real;
    double imag;
    complex_numbers()
    {
        real=5;
        imag=2.6;
    }
    complex_numbers(int r,double i)
    {
        real=r;
        imag=i;
    }
    void sum(complex_numbers t5)
    {
        real=real+t5.real;
        imag=imag+t5.imag;
        System.out.println("the addition of complex numbers is:"+real+"+"+imag+"i");
    }
    public static void main(String[] args)
    {
        complex_numbers t1=new complex_numbers();
        complex_numbers t2=new complex_numbers(8,7.5);
        t2.sum(t1);
    }
}