package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "THREE.HemisphereLightHelper", namespace = JsPackage.GLOBAL)
public class HemisphereLightHelper extends Object3D {
  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface ColorUnionType {
    @JsOverlay
    static HemisphereLightHelper.ColorUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default Color asColor() {
      return Js.cast(this);
    }

    @JsOverlay
    default double asDouble() {
      return Js.asDouble(this);
    }

    @JsOverlay
    default String asString() {
      return Js.asString(this);
    }

    @JsOverlay
    default boolean isColor() {
      return (Object) this instanceof Color;
    }

    @JsOverlay
    default boolean isDouble() {
      return (Object) this instanceof Double;
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }
  }

  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface ConstructorColorUnionType {
    @JsOverlay
    static HemisphereLightHelper.ConstructorColorUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default Color asColor() {
      return Js.cast(this);
    }

    @JsOverlay
    default double asDouble() {
      return Js.asDouble(this);
    }

    @JsOverlay
    default String asString() {
      return Js.asString(this);
    }

    @JsOverlay
    default boolean isColor() {
      return (Object) this instanceof Color;
    }

    @JsOverlay
    default boolean isDouble() {
      return (Object) this instanceof Double;
    }

    @JsOverlay
    default boolean isString() {
      return (Object) this instanceof String;
    }
  }

  public HemisphereLightHelper.ColorUnionType color;
  public HemisphereLight light;
  public MeshBasicMaterial material;
  public Matrix4 matrix;
  public boolean matrixAutoUpdate;

  public HemisphereLightHelper(HemisphereLight light, double size, Color color) {}

  public HemisphereLightHelper(
      HemisphereLight light, double size, HemisphereLightHelper.ConstructorColorUnionType color) {}

  public HemisphereLightHelper(HemisphereLight light, double size, String color) {}

  public HemisphereLightHelper(HemisphereLight light, double size, double color) {}

  public HemisphereLightHelper(HemisphereLight light, double size) {}

  public native void dispose();

  public native void update();
}
