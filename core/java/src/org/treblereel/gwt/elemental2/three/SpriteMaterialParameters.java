package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "THREE.SpriteMaterialParameters", namespace = JsPackage.GLOBAL)
public interface SpriteMaterialParameters extends MaterialParameters {
  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface GetColorUnionType {
    @JsOverlay
    static SpriteMaterialParameters.GetColorUnionType of(Object o) {
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

  @JsOverlay
  static SpriteMaterialParameters create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsProperty
  Texture getAlphaMap();

  @JsProperty
  SpriteMaterialParameters.GetColorUnionType getColor();

  @JsProperty
  Texture getMap();

  @JsProperty
  double getRotation();

  @JsProperty
  boolean isSizeAttenuation();

  @JsProperty
  void setAlphaMap(Texture alphaMap);

  @JsOverlay
  default void setColor(Color color) {
    setColor(Js.<SpriteMaterialParameters.GetColorUnionType>uncheckedCast(color));
  }

  @JsProperty
  void setColor(SpriteMaterialParameters.GetColorUnionType color);

  @JsOverlay
  default void setColor(String color) {
    setColor(Js.<SpriteMaterialParameters.GetColorUnionType>uncheckedCast(color));
  }

  @JsOverlay
  default void setColor(double color) {
    setColor(Js.<SpriteMaterialParameters.GetColorUnionType>uncheckedCast(color));
  }

  @JsProperty
  void setMap(Texture map);

  @JsProperty
  void setRotation(double rotation);

  @JsProperty
  void setSizeAttenuation(boolean sizeAttenuation);
}
