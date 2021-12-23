package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.AxesHelper", namespace = JsPackage.GLOBAL)
public class AxesHelper {
  public String type;

  public AxesHelper() {}

  public AxesHelper(double size) {}

  public native void dispose();

  public native AxesHelper setColors(Color xAxisColor, Color yAxisColor, Color zAxisColor);
}
