package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "THREE.Line", namespace = JsPackage.GLOBAL)
public class Line extends Object3D {
  public BufferGeometry geometry;
  public boolean isLine;
  public Material material;
  public JsPropertyMap<Double> morphTargetDictionary;
  public JsArray<Double> morphTargetInfluences;
  public String type;

  public Line() {}

  public Line(BufferGeometry geometry, Material material) {}

  public Line(BufferGeometry geometry) {}

  public native Line computeLineDistances();

  public native void updateMorphTargets();
}
