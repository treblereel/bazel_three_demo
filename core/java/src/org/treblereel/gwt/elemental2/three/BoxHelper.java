package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "THREE.BoxHelper", namespace = JsPackage.GLOBAL)
public class BoxHelper extends LineSegments {
  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface ConstructorColorUnionType {
    @JsOverlay
    static BoxHelper.ConstructorColorUnionType of(Object o) {
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

  public String type;

  public BoxHelper(Object3D object, Color color) {}

  public BoxHelper(Object3D object, BoxHelper.ConstructorColorUnionType color) {}

  public BoxHelper(Object3D object, String color) {}

  public BoxHelper(Object3D object, double color) {}

  public BoxHelper(Object3D object) {}

  public native BoxHelper setFromObject(Object3D object);

  public native void update();

  public native void update(Object3D object);
}
