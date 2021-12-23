package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsEnum;
import jsinterop.annotations.JsPackage;

@JsEnum(isNative = true, name = "THREE.MOUSE", namespace = JsPackage.GLOBAL)
public enum MOUSE {
  DOLLY,
  LEFT,
  MIDDLE,
  PAN,
  RIGHT,
  ROTATE;
}
