package q4;

public class Vector
{
    private double x, y, z;

    public Vector(double xcoord, double ycoord, double zcoord)
    {
        x = xcoord;
        y = ycoord;
        z = zcoord;
    }

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getZ()
    {
        return z;
    }
    public Vector add(Vector v)
    {
        return new Vector(x + v.getX(), y + v.getY(), z + v.getZ());
    }
    public double dotProduct(Vector v)
    {
        return x * v.getX() + y * v.getY() + z * v.getZ();
    }
    public double computeMagnitude()
    {
        return Math.sqrt(x*x + y*y + z*z);
    }
    public void normalize()
    {
        double mag = this.computeMagnitude();
        if(mag == 0)
            return;
        x /= mag;
        y /= mag;
        z /= mag;
    }

    public Vector scaleVector(double factor)
    {
        return new Vector(x * factor, y* factor, z * factor);
    }
}
