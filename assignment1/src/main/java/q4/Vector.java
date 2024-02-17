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

    public final double getX()
    {
        return x;
    }

    public final double getY()
    {
        return y;
    }

    public final double getZ()
    {
        return z;
    }

    // The task asks to "return a new vector", so I assumed that this method would NOT change the object it's called from
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
        return Math.sqrt(x * x + y * y + z * z);
    }

    public void normalize()
    {
        double mag = this.computeMagnitude();
        if (mag == 0)
            return;
        x /= mag;
        y /= mag;
        z /= mag;
    }

    // The task asks to "scale the vector", so I assumed that this method would change the object it's called from
    public Vector scaleVector(double factor)
    {
        x *= factor;
        y *= factor;
        z *= factor;
        return this;
    }
}
