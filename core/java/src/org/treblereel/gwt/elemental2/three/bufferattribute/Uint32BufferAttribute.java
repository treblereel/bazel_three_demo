package org.treblereel.gwt.elemental2.three.bufferattribute;

import elemental2.core.ArrayBuffer;
import elemental2.core.JsIterable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(
    isNative = true,
    name = "THREE.BufferAttribute.Uint32BufferAttribute",
    namespace = JsPackage.GLOBAL)
public class Uint32BufferAttribute {
  @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
  public interface ConstructorArrayUnionType {
    @JsOverlay
    static Uint32BufferAttribute.ConstructorArrayUnionType of(Object o) {
      return Js.cast(o);
    }

    @JsOverlay
    default ArrayBuffer asArrayBuffer() {
      return Js.cast(this);
    }

    @JsOverlay
    default double asDouble() {
      return Js.asDouble(this);
    }

    @JsOverlay
    default JsIterable<Double> asJsIterable() {
      return Js.cast(this);
    }

    @JsOverlay
    default Object asObject() {
      return Js.cast(this);
    }

    @JsOverlay
    default boolean isArrayBuffer() {
      return (Object) this instanceof ArrayBuffer;
    }

    @JsOverlay
    default boolean isDouble() {
      return (Object) this instanceof Double;
    }

    @JsOverlay
    default boolean isObject() {
      return (Object) this instanceof Object;
    }
  }

  public Uint32BufferAttribute(ArrayBuffer array, double itemSize, boolean normalized) {}

  public Uint32BufferAttribute(ArrayBuffer array, double itemSize) {}

  public Uint32BufferAttribute(
      Uint32BufferAttribute.ConstructorArrayUnionType array, double itemSize, boolean normalized) {}

  public Uint32BufferAttribute(
      Uint32BufferAttribute.ConstructorArrayUnionType array, double itemSize) {}

  public Uint32BufferAttribute(JsIterable<Double> array, double itemSize, boolean normalized) {}

  public Uint32BufferAttribute(JsIterable<Double> array, double itemSize) {}

  public Uint32BufferAttribute(Object array, double itemSize, boolean normalized) {}

  public Uint32BufferAttribute(Object array, double itemSize) {}

  public Uint32BufferAttribute(double array, double itemSize, boolean normalized) {}

  public Uint32BufferAttribute(double array, double itemSize) {}
}
