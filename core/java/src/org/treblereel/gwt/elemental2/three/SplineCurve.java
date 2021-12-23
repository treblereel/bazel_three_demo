package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.SplineCurve", namespace = JsPackage.GLOBAL)
public class SplineCurve extends Curve {
  public JsArray<Vector2> points;
  public String type;

  public SplineCurve() {}

  public SplineCurve(JsArray<Vector2> points) {}

  public SplineCurve(Vector2[] points) {}
}
