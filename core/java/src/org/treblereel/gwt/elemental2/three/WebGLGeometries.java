package org.treblereel.gwt.elemental2.three;

import elemental2.webgl.WebGLRenderingContext;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLGeometries", namespace = JsPackage.GLOBAL)
public class WebGLGeometries {
  public WebGLGeometries(WebGLRenderingContext gl, WebGLAttributes attributes, WebGLInfo info) {}

  public native BufferGeometry get(Object3D object, BufferGeometry geometry);

  public native BufferAttribute getWireframeAttribute(BufferGeometry geometry);

  public native void update(BufferGeometry geometry);
}
