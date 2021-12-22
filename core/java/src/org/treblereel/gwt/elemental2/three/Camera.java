package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.Camera", namespace = JsPackage.GLOBAL)
public class Camera extends Object3D {
  public boolean isCamera;
  public Matrix4 matrixWorldInverse;
  public Matrix4 projectionMatrix;
  public Matrix4 projectionMatrixInverse;

  public native Vector3 getWorldDirection(Vector3 target);

  public native void updateMatrixWorld();

  public native void updateMatrixWorld(boolean force);
}
