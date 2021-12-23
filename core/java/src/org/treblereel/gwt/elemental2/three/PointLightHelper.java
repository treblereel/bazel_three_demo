package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "THREE.PointLightHelper", namespace = JsPackage.GLOBAL)
public class PointLightHelper extends Object3D {
  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface ColorUnionType {
    @JsOverlay
    static PointLightHelper.ColorUnionType of(Object o) {
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
    static PointLightHelper.ConstructorColorUnionType of(Object o) {
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

  public PointLightHelper.ColorUnionType color;
  public PointLight light;
  public Matrix4 matrix;
  public boolean matrixAutoUpdate;
  public String type;

  public PointLightHelper(PointLight light, double sphereSize, Color color) {}

  public PointLightHelper(
      PointLight light, double sphereSize, PointLightHelper.ConstructorColorUnionType color) {}

  public PointLightHelper(PointLight light, double sphereSize, String color) {}

  public PointLightHelper(PointLight light, double sphereSize, double color) {}

  public PointLightHelper(PointLight light, double sphereSize) {}

  public PointLightHelper(PointLight light) {}

  public native void dispose();

  public native void update();
}
