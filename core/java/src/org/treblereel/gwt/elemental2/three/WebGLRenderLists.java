package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.elemental2.three.webglrenderlists.WebGLRenderList;

@JsType(isNative = true, name = "THREE.WebGLRenderLists", namespace = JsPackage.GLOBAL)
public class WebGLRenderLists {
  public WebGLRenderLists(WebGLProperties properties) {}

  public native void dispose();

  public native WebGLRenderList get(Scene scene, double renderCallDepth);
}
