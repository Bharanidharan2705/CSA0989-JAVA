
 class shape {
	double radius;
    shape(double r) { radius = r; }
}

class Sphere extends shape {
    Sphere(double r) { super(r); }
    double area() { return 4 * 3.14 * radius * radius; }
    double volume() { return (4/3) * 3.14 * radius * radius * radius; }

    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        System.out.println("Area: " + s.area());
        System.out.println("Volume: " + s.volume());
    }

}
