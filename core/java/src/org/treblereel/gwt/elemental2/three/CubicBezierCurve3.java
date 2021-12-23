package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.CubicBezierCurve3", namespace = JsPackage.GLOBAL)
public class CubicBezierCurve3 extends Curve {
  public String type;
  public Vector3 v0;
  public Vector3 v1;
  public Vector3 v2;
  public Vector3 v3;

  public CubicBezierCurve3(Vector3 v0, Vector3 v1, Vector3 v2, Vector3 v3) {}
}
