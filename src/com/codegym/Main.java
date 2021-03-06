package com.codegym;

import Colorable.Colorable;
import Colorable.ColorableSquare;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square cSquare = new ColorableSquare();

        Shape[] shapes = new Shape[]{rectangle, cSquare};

        for (Shape shape : shapes) {
            System.out.println(shape);

            // những shape nào implement Colorable thì mới được gọi howToColor()
            // nếu không có if ==> lỗi vì một số shape không implement Colorable, không có PT howToColor()
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

        }
    }
}