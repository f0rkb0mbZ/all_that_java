class volFuncs {
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

public class calcVolumeCmd {
    public static void main(String[] args) {
        if(args.length  < 6){
            System.out.println("Usage: java calcVolumeCmd <side> <radius> <height> <a> <b> <c>");
        } else {
            float side = Float.parseFloat(args[0]);
            float radius = Float.parseFloat(args[1]);
            float height = Float.parseFloat(args[2]);
            float a = Float.parseFloat(args[3]);
            float b = Float.parseFloat(args[4]);
            float c = Float.parseFloat(args[5]);
            volFuncs vol = new volFuncs();
            System.out.println("Volume of cube: " + vol.calcVolume(side));
            System.out.println("Volume of cylinder: " + vol.calcVolume(radius, height));
            System.out.println("Volume of ellipsoid: " + vol.calcVolume(a, b, c));
        }
    }
}
