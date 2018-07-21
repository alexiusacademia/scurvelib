# scurve
SCurve is a java library that can be used in project management projects to deal with s-curve status verifications.

### Creating and S-Curve object
```java
SCurve scurve = new SCurve();
```

### Adding nodes to the s-curve object
```java
scurve.addSCurveNode(new SCurveNode(0, 0));
scurve.addSCurveNode(new SCurveNode(30, 25));
scurve.addSCurveNode(new SCurveNode(60, 45));
scurve.addSCurveNode(new SCurveNode(90, 75));
scurve.addSCurveNode(new SCurveNode(120, 90));
scurve.addSCurveNode(new SCurveNode(150, 100));
```

### Setting the time elapsed and getting a sample corresponding progress
```
double timeElapsed = 100;    // 100 days for example

// Now get the corresponding progress (ordinate)
double progress = scurve.getOrdinate(time);
```