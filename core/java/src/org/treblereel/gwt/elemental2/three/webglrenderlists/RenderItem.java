package org.treblereel.gwt.elemental2.three.webglrenderlists;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.treblereel.gwt.elemental2.three.BufferGeometry;
import org.treblereel.gwt.elemental2.three.Group;
import org.treblereel.gwt.elemental2.three.Material;
import org.treblereel.gwt.elemental2.three.Object3D;
import org.treblereel.gwt.elemental2.three.WebGLProgram;

@JsType(isNative = true, name = "THREE.WebGLRenderLists.RenderItem", namespace = JsPackage.GLOBAL)
public interface RenderItem {
  @JsOverlay
  static RenderItem create() {
    return Js.uncheckedCast(JsPropertyMap.of());
  }

  @JsProperty
  BufferGeometry getGeometry();

  @JsProperty
  Group getGroup();

  @JsProperty
  double getGroupOrder();

  @JsProperty
  double getId();

  @JsProperty
  Material getMaterial();

  @JsProperty
  Object3D getObject();

  @JsProperty
  WebGLProgram getProgram();

  @JsProperty
  double getRenderOrder();

  @JsProperty
  double getZ();

  @JsProperty
  void setGeometry(BufferGeometry geometry);

  @JsProperty
  void setGroup(Group group);

  @JsProperty
  void setGroupOrder(double groupOrder);

  @JsProperty
  void setId(double id);

  @JsProperty
  void setMaterial(Material material);

  @JsProperty
  void setObject(Object3D object);

  @JsProperty
  void setProgram(WebGLProgram program);

  @JsProperty
  void setRenderOrder(double renderOrder);

  @JsProperty
  void setZ(double z);
}
