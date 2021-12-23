package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLCubeMaps", namespace = JsPackage.GLOBAL)
public class WebGLCubeMaps {
  public WebGLCubeMaps(WebGLRenderer renderer) {}

  public native void dispose();

  public native double get(double texture);
}
