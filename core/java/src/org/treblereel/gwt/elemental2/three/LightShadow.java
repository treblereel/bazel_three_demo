package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.LightShadow", namespace = JsPackage.GLOBAL)
public class LightShadow {
  public boolean autoUpdate;
  public double bias;
  public double blurSamples;
  public Camera camera;
  public WebGLRenderTarget map;
  public WebGLRenderTarget mapPass;
  public Vector2 mapSize;
  public Matrix4 matrix;
  public boolean needsUpdate;
  public double normalBias;
  public double radius;

  public LightShadow(Camera camera) {}

  public native LightShadow clone(boolean recursive);

  @JsMethod(name = "clone")
  public native LightShadow clone_();

  public native LightShadow copy(LightShadow source);

  public native void dispose();

  public native Vector2 getFrameExtents();

  public native double getFrustum();

  public native Vector4 getViewport(double viewportIndex);

  public native Object toJSON();

  public native Object toJSON(String key);

  public native void updateMatrices(Light light, double viewportIndex);

  public native void updateMatrices(Light light);
}
