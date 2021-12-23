package org.treblereel.gwt.elemental2.three;

import elemental2.dom.ErrorEvent;
import elemental2.dom.EventTarget;
import elemental2.dom.ProgressEvent;
import elemental2.promise.Promise;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.CompressedTextureLoader", namespace = JsPackage.GLOBAL)
public class CompressedTextureLoader extends Loader {
  @JsFunction
  public interface LoadAsyncOnProgressFn {
    void onInvoke(ProgressEvent<EventTarget> p0);
  }

  @JsFunction
  public interface LoadOnErrorFn {
    void onInvoke(ErrorEvent p0);
  }

  @JsFunction
  public interface LoadOnLoadFn {
    void onInvoke(CompressedTexture p0);
  }

  @JsFunction
  public interface LoadOnProgressFn {
    void onInvoke(ProgressEvent<EventTarget> p0);
  }

  public CompressedTextureLoader() {}

  public CompressedTextureLoader(LoadingManager manager) {}

  public native CompressedTexture load(
      String url,
      CompressedTextureLoader.LoadOnLoadFn onLoad,
      CompressedTextureLoader.LoadOnProgressFn onProgress,
      CompressedTextureLoader.LoadOnErrorFn onError);

  public native CompressedTexture load(
      String url,
      CompressedTextureLoader.LoadOnLoadFn onLoad,
      CompressedTextureLoader.LoadOnProgressFn onProgress);

  public native CompressedTexture load(String url, CompressedTextureLoader.LoadOnLoadFn onLoad);

  public native Promise<CompressedTexture> loadAsync(
      String url, CompressedTextureLoader.LoadAsyncOnProgressFn onProgress);

  public native Promise<CompressedTexture> loadAsync(String url);
}
