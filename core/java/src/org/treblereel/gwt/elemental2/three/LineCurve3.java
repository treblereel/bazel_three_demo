package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.LineCurve3", namespace = JsPackage.GLOBAL)
public class LineCurve3 extends Curve {
  public String type;
  public Vector3 v1;
  public Vector3 v2;

  public LineCurve3(Vector3 v1, Vector3 v2) {}
}
