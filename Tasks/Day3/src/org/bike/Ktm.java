package org.bike;
public class Ktm implements Bike {
@Override
public void cost() {
System.out.println("on road cost is 250000");
}
@Override
public void speed() {
System.out.println("speed is 140km/h");
}
public static void main(String[] args) {
Ktm k = new Ktm();
k.cost();
k.speed();
}
}