package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLMultipleRenderTargets", namespace = JsPackage.GLOBAL)
public class WebGLMultipleRenderTargets {
  public boolean isWebGLMultipleRenderTargets;
  public JsArray<Texture> texture;

  public WebGLMultipleRenderTargets(double width, double height, double count) {}

  @JsMethod(name = "clone")
  public native WebGLMultipleRenderTargets clone_();

  public native WebGLMultipleRenderTargets copy(WebGLMultipleRenderTargets source);

  public native void dispose();

  public native WebGLMultipleRenderTargets setSize(double width, double height, double depth);

  public native WebGLMultipleRenderTargets setSize(double width, double height);

  public native void setTexture(Texture texture);
}
