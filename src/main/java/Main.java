package main.java;

public class Main {
  public static void main(String[] args) {
    SCurve scurve = new SCurve();
    scurve.addSCurveNode(new SCurveNode(0, 0));
    scurve.addSCurveNode(new SCurveNode(30, 25));
    scurve.addSCurveNode(new SCurveNode(60, 45));
    scurve.addSCurveNode(new SCurveNode(90, 75));
    scurve.addSCurveNode(new SCurveNode(120, 90));
    scurve.addSCurveNode(new SCurveNode(150, 100));

    double time = 110;

    System.out.println("Time given is " + time + " days.");
    System.out.println("Projected progress = " + scurve.getOrdinate(time) + "%.");

    for (SCurveNode node : scurve.getNodes()) {
      System.out.println("(" + node.getAbscissa() + ", " + node.getOrdinate() + ")");
    }
  }
}
