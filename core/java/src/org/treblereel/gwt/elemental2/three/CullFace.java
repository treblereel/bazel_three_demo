package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsEnum;
import jsinterop.annotations.JsPackage;

@JsEnum(isNative = true, name = "THREE.CullFace", namespace = JsPackage.GLOBAL)
public enum CullFace {
  CullFaceBack,
  CullFaceFront,
  CullFaceFrontBack,
  CullFaceNone;
}
