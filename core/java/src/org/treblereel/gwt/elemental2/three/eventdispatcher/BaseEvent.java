package org.treblereel.gwt.elemental2.three.eventdispatcher;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "THREE.EventDispatcher.BaseEvent", namespace = JsPackage.GLOBAL)
public interface BaseEvent {
  @JsOverlay
  static BaseEvent create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsProperty
  String getType();

  @JsProperty
  void setType(String type);
}
