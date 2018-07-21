package main.java;

public class SCurveNode {
  private double abscissa;
  private double ordinate;

  public SCurveNode(double time, double percentage) {
    this.abscissa = time;
    this.ordinate = percentage;
  }

  public double getAbscissa() {
    return abscissa;
  }

  public double getOrdinate() {
    return ordinate;
  }
}
