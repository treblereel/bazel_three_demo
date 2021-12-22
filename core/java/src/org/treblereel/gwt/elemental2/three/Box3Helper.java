package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.Box3Helper", namespace = JsPackage.GLOBAL)
public class Box3Helper extends LineSegments {
  public Box3 box;
  public String type;

  public Box3Helper(Box3 box, Color color) {}

  public Box3Helper(Box3 box) {}
}
