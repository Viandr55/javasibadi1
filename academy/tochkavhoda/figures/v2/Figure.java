package academy.tochkavhoda.figures.v2;

import academy.tochkavhoda.iface.v2.Movable;
import academy.tochkavhoda.iface.v2.Resizable;
import academy.tochkavhoda.iface.v2.HasArea;

public abstract class Figure implements Movable, Resizable, HasArea {
    // общие абстрактные методы для всех фигур
    public abstract double getPerimeter();
    // getArea() объявлен в HasArea
    // moveTo(int,int) и moveRel(int,int) объявлены в Movable
    // resize(double) объявлен в Resizable
}

