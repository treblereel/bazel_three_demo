package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.Sprite", namespace = JsPackage.GLOBAL)
public class Sprite extends Object3D {
  public Vector2 center;
  public BufferGeometry geometry;
  public boolean isSprite;
  public Object material;
  public String type;

  public Sprite() {}

  public Sprite(Object material) {}
}
