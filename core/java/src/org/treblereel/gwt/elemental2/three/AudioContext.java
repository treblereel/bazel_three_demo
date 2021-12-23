package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.AudioContext", namespace = JsPackage.GLOBAL)
public class AudioContext {
  public static native Object getContext();

  public static native void setContext();
}
