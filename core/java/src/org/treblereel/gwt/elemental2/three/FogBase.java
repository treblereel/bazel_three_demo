package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.FogBase", namespace = JsPackage.GLOBAL)
public interface FogBase {
  @JsMethod(name = "clone")
  FogBase clone_();

  @JsProperty
  Color getColor();

  @JsProperty
  String getName();

  @JsProperty
  void setColor(Color color);

  @JsProperty
  void setName(String name);

  Object toJSON();

  Object toJSON(String key);
}
