package main.java;

import java.io.Serializable;
import java.util.ArrayList;

public class SCurve implements Serializable {
  private ArrayList<SCurveNode> nodes;

  /**
   * Constructor.
   * Initialize the list of nodes ArrayList variable.
   */
  public SCurve() {
    nodes = new ArrayList<>();
  }

  /* ************************************
   *
   * Setters
   *
   ************************************ */

  /**
   * Set the nodes of SCurve
   * @param nodes ArrayList of SCurveNodes
   */
  public void setNodes(ArrayList<SCurveNode> nodes) {
    this.nodes = nodes;
  }

  /* ************************************
   *
   * Getters
   *
   ************************************ */

  /**
   * Get the SCurve Nodes
   * @return ArrayList of SCurveNodes
   */
  public ArrayList<SCurveNode> getNodes() {
    return nodes;
  }

  /**
   * Add a node to the S-Curve
   * @param node SCurveNode
   */
  public void addSCurveNode(SCurveNode node) {
    this.nodes.add(node);
  }

  /* ************************************
   *
   * Methods
   *
   ************************************ */

  public double getAbscissa(double ordinate) {
    double abscissa = 0;

    for (int i = 1; i < this.nodes.size(); i++) {
      if (ordinate <= this.nodes.get(i).getOrdinate()) {
        abscissa = interpolate(this.nodes.get(i-1).getAbscissa(), this.nodes.get(i).getAbscissa(),
                this.nodes.get(i-1).getOrdinate(), ordinate, this.nodes.get(i).getOrdinate());
        break;
      }
    }

    return abscissa;
  }

  public double getOrdinate(double abscissa) {
    double ordinate = 0;
    for (int i = 1; i < this.nodes.size(); i++) {
      if (abscissa <= this.nodes.get(i).getAbscissa()) {
        ordinate = interpolate(this.nodes.get(i-1).getOrdinate(), this.nodes.get(i).getOrdinate(),
                this.nodes.get(i-1).getAbscissa(), abscissa, this.nodes.get(i).getAbscissa());
        break;
      }
    }

    return ordinate;
  }

  private double interpolate(double x1, double x3, double y1, double y2, double y3) {
    return (y2 - y3) / (y1 - y3) * (x1 - x3) + x3;
  }
}
