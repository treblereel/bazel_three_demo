package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLMultisampleRenderTarget", namespace = JsPackage.GLOBAL)
public class WebGLMultisampleRenderTarget {
  public boolean isWebGLMultisampleRenderTarget;
  public double samples;

  public WebGLMultisampleRenderTarget(
      double width, double height, WebGLRenderTargetOptions options) {}

  public WebGLMultisampleRenderTarget(double width, double height) {}
}
