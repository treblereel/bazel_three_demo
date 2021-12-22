package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.PointLightShadow", namespace = JsPackage.GLOBAL)
public class PointLightShadow extends LightShadow {
  public PerspectiveCamera camera;

  public PointLightShadow() {
    // This super call is here only for the code to compile; it is never executed.
    super((Camera) null);
  }
}
