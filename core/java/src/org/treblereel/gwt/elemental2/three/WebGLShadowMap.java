package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "THREE.WebGLShadowMap", namespace = JsPackage.GLOBAL)
public class WebGLShadowMap {
  public boolean autoUpdate;
  public double cullFace;
  public boolean enabled;
  public boolean needsUpdate;
  public double type;

  public WebGLShadowMap(
      WebGLRenderer _renderer, WebGLObjects _objects, WebGLCapabilities _capabilities) {}

  public native void render(JsArray<Light> shadowsArray, Scene scene, Camera camera);

  @JsOverlay
  public final void render(Light[] shadowsArray, Scene scene, Camera camera) {
    render(Js.<JsArray<Light>>uncheckedCast(shadowsArray), scene, camera);
  }
}
