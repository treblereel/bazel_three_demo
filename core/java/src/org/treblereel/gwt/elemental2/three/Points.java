package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "THREE.Points", namespace = JsPackage.GLOBAL)
public class Points<TGeometry, TMaterial> extends Object3D {
  public TGeometry geometry;
  public boolean isPoints;
  public TMaterial material;
  public JsPropertyMap<Double> morphTargetDictionary;
  public JsArray<Double> morphTargetInfluences;
  public String type;

  public Points() {}

  public Points(TGeometry geometry, TMaterial material) {}

  public Points(TGeometry geometry) {}

  public native void updateMorphTargets();
}
