package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import elemental2.core.JsObject;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.NumberKeyframeTrack", namespace = JsPackage.GLOBAL)
public class NumberKeyframeTrack extends KeyframeTrack {
  public String ValueTypeName;

  public NumberKeyframeTrack(
      String name, JsArray<JsObject> times, JsArray<JsObject> values, double interpolation) {
    // This super call is here only for the code to compile; it is never executed.
    super((String) null, (Object) null, (Object) null, 0);
  }

  public NumberKeyframeTrack(String name, JsArray<JsObject> times, JsArray<JsObject> values) {
    // This super call is here only for the code to compile; it is never executed.
    super((String) null, (Object) null, (Object) null, 0);
  }

  public NumberKeyframeTrack(
      String name, JsObject[] times, JsObject[] values, double interpolation) {
    // This super call is here only for the code to compile; it is never executed.
    super((String) null, (Object) null, (Object) null, 0);
  }

  public NumberKeyframeTrack(String name, JsObject[] times, JsObject[] values) {
    // This super call is here only for the code to compile; it is never executed.
    super((String) null, (Object) null, (Object) null, 0);
  }
}
