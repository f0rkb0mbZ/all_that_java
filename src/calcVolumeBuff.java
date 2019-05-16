import java.io.*;

class volFunc {
    float calcVolume(float side) {
        return (float) Math.pow(side, 3.0);
    }

    float calcVolume(float radius, float height) {
        return (float) Math.PI * (float) Math.pow(radius, 2.0) * height;
    }

    float calcVolume(float a, float b, float c) {
        return (float) ((4.0 * Math.PI * a * b * c) / 3.0);
    }
}

public class calcVolumeBuff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the side of cube: ");
        float side = Float.parseFloat(br.readLine());
        System.out.print("Enter the radius of cylinder: ");
        float radius = Float.parseFloat(br.readLine());
        System.out.print("Enter the height of cylinder: ");
        float height = Float.parseFloat(br.readLine());
        System.out.print("Enter a of ellipsoid: ");
        float a = Float.parseFloat(br.readLine());
        System.out.print("Enter b of ellipsoid: ");
        float b = Float.parseFloat(br.readLine());
        System.out.print("Enter c of ellipsoid: ");
        float c = Float.parseFloat(br.readLine());
        volFuncs vol = new volFuncs();
        System.out.println("Volume of cube: " + vol.calcVolume(side));
        System.out.println("Volume of cylinder: " + vol.calcVolume(radius, height));
        System.out.println("Volume of ellipsoid: " + vol.calcVolume(a, b, c));
    }
}
