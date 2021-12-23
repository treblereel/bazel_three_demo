package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.LineBasicMaterial", namespace = JsPackage.GLOBAL)
public class LineBasicMaterial extends Material {
  public Color color;
  public String linecap;
  public String linejoin;
  public double linewidth;
  public String type;

  public LineBasicMaterial() {}

  public LineBasicMaterial(LineBasicMaterialParameters parameters) {}

  public native void setValues(LineBasicMaterialParameters parameters);
}
