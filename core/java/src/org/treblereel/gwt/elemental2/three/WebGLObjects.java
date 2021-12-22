package org.treblereel.gwt.elemental2.three;

import elemental2.webgl.WebGLRenderingContext;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLObjects", namespace = JsPackage.GLOBAL)
public class WebGLObjects {
  public WebGLObjects(
      WebGLRenderingContext gl, double geometries, double attributes, double info) {}

  public native void dispose();

  public native double update(double object);
}
