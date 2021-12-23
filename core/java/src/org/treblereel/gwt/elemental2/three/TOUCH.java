package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsEnum;
import jsinterop.annotations.JsPackage;

@JsEnum(isNative = true, name = "THREE.TOUCH", namespace = JsPackage.GLOBAL)
public enum TOUCH {
  DOLLY_PAN,
  DOLLY_ROTATE,
  PAN,
  ROTATE;
}
