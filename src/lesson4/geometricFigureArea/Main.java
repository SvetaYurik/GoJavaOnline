package lesson4.geometricFigureArea;


public class Main {
    public static void main (String[] args){
        RectangleFigure rectangleFigure = new RectangleFigure();
        rectangleFigure.setSideA(5);
        rectangleFigure.setSideB(7);
        System.out.println("Rectangle area = " + rectangleFigure.rectangleArea());

        TriangleFigure triangleFigure = new TriangleFigure();
        triangleFigure.setSideA(8);
        triangleFigure.setHeightH(5);
        System.out.println("Triangle area = " + triangleFigure.triandleArea());

        CircleFigure circleFigure = new CircleFigure();
        circleFigure.setPi(3.14);
        circleFigure.setRadiusR(6);
        System.out.println("Circle area = " + circleFigure.circleArea());

    }



}
