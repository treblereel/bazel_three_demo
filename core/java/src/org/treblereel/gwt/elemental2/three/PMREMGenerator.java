package org.treblereel.gwt.elemental2.three;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.PMREMGenerator", namespace = JsPackage.GLOBAL)
public class PMREMGenerator {
  public PMREMGenerator(WebGLRenderer renderer) {}

  public native void compileCubemapShader();

  public native void compileEquirectangularShader();

  public native void dispose();

  public native WebGLRenderTarget fromCubemap(CubeTexture cubemap);

  public native WebGLRenderTarget fromEquirectangular(Texture equirectangular);

  public native WebGLRenderTarget fromScene(Scene scene, double sigma, double near, double far);

  public native WebGLRenderTarget fromScene(Scene scene, double sigma, double near);

  public native WebGLRenderTarget fromScene(Scene scene, double sigma);

  public native WebGLRenderTarget fromScene(Scene scene);
}
