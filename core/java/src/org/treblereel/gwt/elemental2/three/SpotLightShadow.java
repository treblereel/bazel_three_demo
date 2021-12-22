package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.SpotLightShadow", namespace = JsPackage.GLOBAL)
public class SpotLightShadow extends LightShadow {
  public PerspectiveCamera camera;
  public double focus;
  public boolean isSpotLightShadow;

  public SpotLightShadow() {
    // This super call is here only for the code to compile; it is never executed.
    super((Camera) null);
  }
}
