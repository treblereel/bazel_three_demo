package org.treblereel.gwt.elemental2.three.webglrenderer;

import elemental2.dom.HTMLCanvasElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.elemental2.three.Camera;
import org.treblereel.gwt.elemental2.three.Object3D;

@JsType(isNative = true, name = "THREE.WebGLRenderer.Renderer", namespace = JsPackage.GLOBAL)
public interface Renderer {
  @JsProperty
  HTMLCanvasElement getDomElement();

  void render(Object3D scene, Camera camera);

  @JsProperty
  void setDomElement(HTMLCanvasElement domElement);

  void setSize(double width, double height, boolean updateStyle);

  void setSize(double width, double height);
}
