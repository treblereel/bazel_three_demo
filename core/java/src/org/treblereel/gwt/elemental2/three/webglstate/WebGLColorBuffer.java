package org.treblereel.gwt.elemental2.three.webglstate;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLState.WebGLColorBuffer", namespace = JsPackage.GLOBAL)
public class WebGLColorBuffer {
  public native void reset();

  public native void setClear(double r, double g, double b, double a, boolean premultipliedAlpha);

  public native void setLocked(boolean lock);

  public native void setMask(boolean colorMask);
}
