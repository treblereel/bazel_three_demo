package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLCubeRenderTarget", namespace = JsPackage.GLOBAL)
public class WebGLCubeRenderTarget {
  public CubeTexture texture;

  public WebGLCubeRenderTarget(double size, WebGLRenderTargetOptions options) {}

  public WebGLCubeRenderTarget(double size) {}

  public native void clear(WebGLRenderer renderer, boolean color, boolean depth, boolean stencil);

  public native WebGLCubeRenderTarget fromEquirectangularTexture(
      WebGLRenderer renderer, Texture texture);
}
