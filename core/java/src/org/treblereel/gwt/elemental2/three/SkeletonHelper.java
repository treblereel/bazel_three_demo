package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.SkeletonHelper", namespace = JsPackage.GLOBAL)
public class SkeletonHelper extends LineSegments {
  public JsArray<Bone> bones;
  public boolean isSkeletonHelper;
  public Matrix4 matrix;
  public boolean matrixAutoUpdate;
  public Object3D root;
  public String type;

  public SkeletonHelper(Object3D object) {}

  public native JsArray<Bone> getBoneList(Object3D object);

  public native void update();
}
