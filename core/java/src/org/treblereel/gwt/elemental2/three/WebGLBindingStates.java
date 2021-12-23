package org.treblereel.gwt.elemental2.three;

import elemental2.webgl.WebGLRenderingContext;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.WebGLBindingStates", namespace = JsPackage.GLOBAL)
public class WebGLBindingStates {
  public WebGLBindingStates(
      WebGLRenderingContext gl,
      WebGLExtensions extensions,
      WebGLAttributes attributes,
      WebGLCapabilities capabilities) {}

  public native void disableUnusedAttributes();

  public native void dispose();

  public native void enableAttribute(double attribute);

  public native void initAttributes();

  public native void releaseStatesOfGeometry();

  public native void releaseStatesOfProgram();

  public native void reset();

  public native void resetDefaultState();

  public native void setup(
      Object3D object,
      Material material,
      WebGLProgram program,
      BufferGeometry geometry,
      BufferAttribute index);
}
