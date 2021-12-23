package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.ShadowMaterial", namespace = JsPackage.GLOBAL)
public class ShadowMaterial {
  public Color color;
  public boolean transparent;
  public String type;

  public ShadowMaterial() {}

  public ShadowMaterial(ShadowMaterialParameters parameters) {}
}
