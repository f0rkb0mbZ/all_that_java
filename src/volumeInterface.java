import java.lang.Math;

interface Volume {
    float involume();

    float outvolume();
}

class machine implements Volume {
    private float s1, s2, s3;

    machine(float s1, float s2, float s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public float involume() {
        return (float) ((1.0 / 3.0) * Math.PI * this.s1 * this.s2 * this.s3);
    }

    @Override
    public float outvolume() {
        return (float) ((4.0 / 3.0) * Math.PI * this.s1 * this.s2 * this.s3);
    }
}

public class volumeInterface {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java volumeInterface s1 s2 s3");
        } else {
            float s1 = Float.parseFloat(args[0]);
            float s2 = Float.parseFloat(args[1]);
            float s3 = Float.parseFloat(args[2]);
            machine m = new machine(s1, s2, s3);
            System.out.println("Involume is: " + m.involume());
            System.out.println("Outvolume is: " + m.outvolume());
        }
    }
}
