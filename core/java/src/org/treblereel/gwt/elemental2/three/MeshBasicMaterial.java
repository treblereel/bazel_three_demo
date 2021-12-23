package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.MeshBasicMaterial", namespace = JsPackage.GLOBAL)
public class MeshBasicMaterial extends Material {
  public Texture alphaMap;
  public Texture aoMap;
  public double aoMapIntensity;
  public Color color;
  public double combine;
  public Texture envMap;
  public Texture lightMap;
  public double lightMapIntensity;
  public Texture map;
  public double reflectivity;
  public double refractionRatio;
  public Texture specularMap;
  public String type;
  public boolean wireframe;
  public String wireframeLinecap;
  public String wireframeLinejoin;
  public double wireframeLinewidth;

  public MeshBasicMaterial() {}

  public MeshBasicMaterial(MeshBasicMaterialParameters parameters) {}

  public native void setValues(MeshBasicMaterialParameters parameters);
}
