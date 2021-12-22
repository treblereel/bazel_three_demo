package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.DirectionalLightShadow", namespace = JsPackage.GLOBAL)
public class DirectionalLightShadow extends LightShadow {
  public OrthographicCamera camera;
  public boolean isDirectionalLightShadow;

  public DirectionalLightShadow() {
    // This super call is here only for the code to compile; it is never executed.
    super((Camera) null);
  }
}
