package lesson4.geometricFigureArea;

/**
 * Created by Света on 19.01.2016.
 */
public class RectangleFigure extends GeometricFigure {
    public double sideA;
    public double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double rectangleArea(){
        double rectangleArea = sideA * sideB;
        return rectangleArea;
    }
}
