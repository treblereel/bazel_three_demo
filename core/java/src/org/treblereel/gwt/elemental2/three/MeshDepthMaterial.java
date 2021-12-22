package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.MeshDepthMaterial", namespace = JsPackage.GLOBAL)
public class MeshDepthMaterial extends Material {
  public Texture alphaMap;
  public double depthPacking;
  public double displacementBias;
  public Texture displacementMap;
  public double displacementScale;
  public boolean fog;
  public Texture map;
  public String type;
  public boolean wireframe;
  public double wireframeLinewidth;

  public MeshDepthMaterial() {}

  public MeshDepthMaterial(MeshDepthMaterialParameters parameters) {}

  public native void setValues(MeshDepthMaterialParameters parameters);
}
