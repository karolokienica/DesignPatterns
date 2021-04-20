public interface Example1ShapeInterface {
    public double area();
}

interface SolidShapeInterface{
    public double volume();
}

interface ManageShapeInterface{
    public double calculate();
}

class Cube implements Example1ShapeInterface, SolidShapeInterface, ManageShapeInterface{
    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double volume() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements Example1ShapeInterface, ManageShapeInterface{
    @Override
    public double area() {
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}
