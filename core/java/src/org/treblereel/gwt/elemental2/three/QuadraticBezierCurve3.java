package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.QuadraticBezierCurve3", namespace = JsPackage.GLOBAL)
public class QuadraticBezierCurve3 extends Curve {
  public String type;
  public Vector3 v0;
  public Vector3 v1;
  public Vector3 v2;

  public QuadraticBezierCurve3(Vector3 v0, Vector3 v1, Vector3 v2) {}
}
