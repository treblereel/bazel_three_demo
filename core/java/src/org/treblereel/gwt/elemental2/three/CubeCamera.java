package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.CubeCamera", namespace = JsPackage.GLOBAL)
public class CubeCamera extends Object3D {
  public WebGLCubeRenderTarget renderTarget;
  public String type;

  public CubeCamera(double near, double far, WebGLCubeRenderTarget renderTarget) {}

  public native void update(WebGLRenderer renderer, Scene scene);
}
