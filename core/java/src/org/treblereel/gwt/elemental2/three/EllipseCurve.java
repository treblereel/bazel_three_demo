package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.EllipseCurve", namespace = JsPackage.GLOBAL)
public class EllipseCurve extends Curve {
  public boolean aClockwise;
  public double aEndAngle;
  public double aRotation;
  public double aStartAngle;
  public double aX;
  public double aY;
  public String type;
  public double xRadius;
  public double yRadius;

  public EllipseCurve(
      double aX,
      double aY,
      double xRadius,
      double yRadius,
      double aStartAngle,
      double aEndAngle,
      boolean aClockwise,
      double aRotation) {}
}
