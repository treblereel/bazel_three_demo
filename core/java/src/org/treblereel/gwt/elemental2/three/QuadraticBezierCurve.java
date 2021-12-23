package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.QuadraticBezierCurve", namespace = JsPackage.GLOBAL)
public class QuadraticBezierCurve extends Curve {
  public String type;
  public Vector2 v0;
  public Vector2 v1;
  public Vector2 v2;

  public QuadraticBezierCurve(Vector2 v0, Vector2 v1, Vector2 v2) {}
}
