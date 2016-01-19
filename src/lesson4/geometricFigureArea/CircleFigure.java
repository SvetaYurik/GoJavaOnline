package lesson4.geometricFigureArea;


public class CircleFigure extends GeometricFigure {
    public double radiusR;
    public double pi = 3.14;
    public double getRadiusR() {
        return radiusR;
    }

    public void setRadiusR(double radiusR) {
        this.radiusR = radiusR;
    }


    public void setPi(double pi) {
        this.pi = pi;
    }
    public double circleArea(){
        double circleArea = pi * radiusR * radiusR;
        return circleArea;
    }


}
