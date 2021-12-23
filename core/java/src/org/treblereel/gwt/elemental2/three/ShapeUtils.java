package org.treblereel.gwt.elemental2.three;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.treblereel.gwt.elemental2.three.shapeutils.Vec2;

@JsType(isNative = true, name = "THREE.ShapeUtils", namespace = JsPackage.GLOBAL)
public class ShapeUtils {
  public static native double area(JsArray<Vec2> contour);

  @JsOverlay
  public static final double area(Vec2[] contour) {
    return area(Js.<JsArray<Vec2>>uncheckedCast(contour));
  }

  public static native boolean isClockWise(JsArray<Vec2> pts);

  @JsOverlay
  public static final boolean isClockWise(Vec2[] pts) {
    return isClockWise(Js.<JsArray<Vec2>>uncheckedCast(pts));
  }

  public static native JsArray<JsArray<Double>> triangulateShape(
      JsArray<Vec2> contour, JsArray<JsArray<Vec2>> holes);

  @JsOverlay
  public static final JsArray<JsArray<Double>> triangulateShape(Vec2[] contour, Vec2[][] holes) {
    return triangulateShape(
        Js.<JsArray<Vec2>>uncheckedCast(contour), Js.<JsArray<JsArray<Vec2>>>uncheckedCast(holes));
  }
}
