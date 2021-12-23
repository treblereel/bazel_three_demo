package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.PlaneHelper", namespace = JsPackage.GLOBAL)
public class PlaneHelper extends LineSegments {
  public Plane plane;
  public double size;
  public String type;

  public PlaneHelper(Plane plane, double size, double hex) {}

  public PlaneHelper(Plane plane, double size) {}

  public PlaneHelper(Plane plane) {}

  public native void updateMatrixWorld();

  public native void updateMatrixWorld(boolean force);
}
