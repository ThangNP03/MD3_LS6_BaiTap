package Point2dAnd3d;

public class Point3d {
    private float z;

    public Point3d(float x, float y, float z) {
        super();
        this.z = z;
    }

    public Point3d() {
        super();
        this.z = 50;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x,y);
        this.z = z;
    }

    private void setXY(float x, float y) {
    }

    public float[] getXYZ(){
        return new float[] {getX(),getY(),z};
    }

    private float getY() {
        return 0;
    }

    private float getX() {
        return 0;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                "} " + super.toString();
    }
}
