package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.Bone", namespace = JsPackage.GLOBAL)
public class Bone extends Object3D {
  public boolean isBone;
  public String type;
}
