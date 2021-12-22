package org.treblereel.gwt.elemental2.three.webglstate;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLState.WebGLStencilBuffer", namespace = JsPackage.GLOBAL)
public class WebGLStencilBuffer {
  public native void reset();

  public native void setClear(double stencil);

  public native void setFunc(double stencilFunc, double stencilRef, double stencilMask);

  public native void setLocked(boolean lock);

  public native void setMask(double stencilMask);

  public native void setOp(double stencilFail, double stencilZFail, double stencilZPass);

  public native void setTest(boolean stencilTest);
}
