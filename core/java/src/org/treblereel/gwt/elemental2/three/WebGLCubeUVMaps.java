package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLCubeUVMaps", namespace = JsPackage.GLOBAL)
public class WebGLCubeUVMaps {
  public WebGLCubeUVMaps(WebGLRenderer renderer) {}

  public native void dispose();

  public native <T> double get(T texture);
}
