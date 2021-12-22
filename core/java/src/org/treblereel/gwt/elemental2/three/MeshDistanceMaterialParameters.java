package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(
    isNative = true,
    name = "THREE.MeshDistanceMaterialParameters",
    namespace = JsPackage.GLOBAL)
public interface MeshDistanceMaterialParameters extends MaterialParameters {
  @JsOverlay
  static MeshDistanceMaterialParameters create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsProperty
  Texture getAlphaMap();

  @JsProperty
  double getDisplacementBias();

  @JsProperty
  Texture getDisplacementMap();

  @JsProperty
  double getDisplacementScale();

  @JsProperty
  double getFarDistance();

  @JsProperty
  Texture getMap();

  @JsProperty
  double getNearDistance();

  @JsProperty
  Vector3 getReferencePosition();

  @JsProperty
  void setAlphaMap(Texture alphaMap);

  @JsProperty
  void setDisplacementBias(double displacementBias);

  @JsProperty
  void setDisplacementMap(Texture displacementMap);

  @JsProperty
  void setDisplacementScale(double displacementScale);

  @JsProperty
  void setFarDistance(double farDistance);

  @JsProperty
  void setMap(Texture map);

  @JsProperty
  void setNearDistance(double nearDistance);

  @JsProperty
  void setReferencePosition(Vector3 referencePosition);
}
