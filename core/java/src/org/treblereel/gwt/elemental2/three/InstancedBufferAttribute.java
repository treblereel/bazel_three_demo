package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.InstancedBufferAttribute", namespace = JsPackage.GLOBAL)
public class InstancedBufferAttribute extends BufferAttribute {
  public double meshPerAttribute;

  public InstancedBufferAttribute(
      Object array, double itemSize, boolean normalized, double meshPerAttribute) {
    // This super call is here only for the code to compile; it is never executed.
    super((Object) null, 0, false);
  }

  public InstancedBufferAttribute(Object array, double itemSize, boolean normalized) {
    // This super call is here only for the code to compile; it is never executed.
    super((Object) null, 0, false);
  }

  public InstancedBufferAttribute(Object array, double itemSize) {
    // This super call is here only for the code to compile; it is never executed.
    super((Object) null, 0, false);
  }
}
