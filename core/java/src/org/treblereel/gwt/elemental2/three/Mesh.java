package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "THREE.Mesh", namespace = JsPackage.GLOBAL)
public class Mesh<TGeometry, TMaterial> extends Object3D {
  public TGeometry geometry;
  public boolean isMesh;
  public TMaterial material;
  public JsPropertyMap<Double> morphTargetDictionary;
  public JsArray<Double> morphTargetInfluences;
  public String type;

  public Mesh() {}

  public Mesh(TGeometry geometry, TMaterial material) {}

  public Mesh(TGeometry geometry) {}

  public native void updateMorphTargets();
}
