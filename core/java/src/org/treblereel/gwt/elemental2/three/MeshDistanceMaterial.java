package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.MeshDistanceMaterial", namespace = JsPackage.GLOBAL)
public class MeshDistanceMaterial extends Material {
  public Texture alphaMap;
  public double displacementBias;
  public Texture displacementMap;
  public double displacementScale;
  public double farDistance;
  public boolean fog;
  public Texture map;
  public double nearDistance;
  public Vector3 referencePosition;
  public String type;

  public MeshDistanceMaterial() {}

  public MeshDistanceMaterial(MeshDistanceMaterialParameters parameters) {}

  public native void setValues(MeshDistanceMaterialParameters parameters);
}
