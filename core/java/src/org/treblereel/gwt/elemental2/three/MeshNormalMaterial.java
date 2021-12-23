package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.MeshNormalMaterial", namespace = JsPackage.GLOBAL)
public class MeshNormalMaterial extends Material {
  public Texture bumpMap;
  public double bumpScale;
  public double displacementBias;
  public Texture displacementMap;
  public double displacementScale;
  public boolean flatShading;
  public Texture normalMap;
  public double normalMapType;
  public Vector2 normalScale;
  public String type;
  public boolean wireframe;
  public double wireframeLinewidth;

  public MeshNormalMaterial() {}

  public MeshNormalMaterial(MeshNormalMaterialParameters parameters) {}

  public native void setValues(MeshNormalMaterialParameters parameters);
}
