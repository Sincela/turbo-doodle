package com.company;

public class dsda {
    public interface Printable {
        void squarePrinting();
        void trianglePrinting();
        void circlePrinting();

    }
    public interface Square extends Printable {
        int angles = 4;
    }
    public interface Triangle extends Printable {
        int angles = 3;
    }
    public interface Circle extends Printable {
        int angles = 0;
    }
    public static class Printing implements Printable {
        @Override
        public void squarePrinting() {
            System.out.println("Рисуем квадрат");
        }

        @Override
        public void trianglePrinting() {
            System.out.println("Рисуем квадрат");
        }

        @Override
        public void circlePrinting() {
            System.out.println("Рисуем квадрат");
        }

    }
}
