package Model;

public class Discrimenant
{
    double _a;
    double _b;
    double _c;
    double _dscr;

    public Discrimenant(double a, double b, double c)
    {
        _a = a;
        _b = b;
        _c = c;
        _dscr = Math.pow(b, 2)-4*a*c;
    }
    public double Root1(){
        return (-_b+Math.sqrt(_dscr))/2*_a;
    }
    public double Root2(){
        return (-_b-Math.sqrt(_dscr))/2*_a;
    }
    public double get_dscr(){ return _dscr; }
}
