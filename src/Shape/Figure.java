package Shape;

import java.lang.Math;
public class Figure {
    float side, radius, height, x, y, z;
    String name;

    public Figure(float side){
        name = "Cube";
        this.side = side;
    }

    public Figure(float radius, float height){
        name = "Cylinder";
        this.radius = radius;
        this.height = height;
    }

    public Figure(float x, float y, float z){
        name = "Cuboid";
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float calculateVolume(){
        if(name.equals("Cube"))
            return (float) Math.pow(this.side, 3.0);
        else if(name.equals("Cylinder"))
            return (float) ((1.0/3.0)*Math.PI*Math.pow(this.radius, 2.0)*this.height);
        else if(name.equals("Cuboid"))
            return (float) this.x*this.y*this.z;
        else
            return 0.0f;
    }
}
