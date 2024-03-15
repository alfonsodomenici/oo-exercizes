package ex;

public class Circle {

    public static final float PI = 3.14f;

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float area() {
        return radius * radius * PI;
    }

    public float circonferenza() {
        return radius * 2 * PI;
    }

    /* getters etc.. */
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(radius);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (Float.floatToIntBits(radius) != Float.floatToIntBits(other.radius))
            return false;
        return true;
    }

}
