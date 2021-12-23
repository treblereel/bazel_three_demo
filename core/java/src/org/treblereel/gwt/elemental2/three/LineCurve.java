package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.LineCurve", namespace = JsPackage.GLOBAL)
public class LineCurve extends Curve {
  public String type;
  public Vector2 v1;
  public Vector2 v2;

  public LineCurve(Vector2 v1, Vector2 v2) {}
}
