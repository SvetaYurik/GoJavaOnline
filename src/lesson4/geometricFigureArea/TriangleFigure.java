package lesson4.geometricFigureArea;


public class TriangleFigure extends GeometricFigure {
    public double sideA;
    public double heightH;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getHeightH() {
        return heightH;
    }

    public void setHeightH(double heightH) {
        this.heightH = heightH;
    }

    public double triandleArea() {
        double triandleArea = sideA * heightH * 0.5;
        return triandleArea;
    }
}
