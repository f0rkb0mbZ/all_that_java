import Shape.Figure;

public class packageDemo {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java packageDemo side radius height x y z");
        } else {
            float side = Float.parseFloat(args[0]);
            float radius = Float.parseFloat(args[1]);
            float height = Float.parseFloat(args[2]);
            float x = Float.parseFloat(args[3]);
            float y = Float.parseFloat(args[4]);
            float z = Float.parseFloat(args[5]);

            Figure cube = new Figure(side);
            Figure cylinder = new Figure(radius, height);
            Figure cuboid = new Figure(x, y, z);

            System.out.println("Volume of - \nCube = " + cube.calculateVolume() + "\nCylinder = " + cylinder.calculateVolume() + "\nCuboid = " + cuboid.calculateVolume());
        }
    }
}
