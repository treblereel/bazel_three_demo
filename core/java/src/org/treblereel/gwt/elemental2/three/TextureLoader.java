package org.treblereel.gwt.elemental2.three;

import elemental2.dom.ErrorEvent;
import elemental2.dom.EventTarget;
import elemental2.dom.ProgressEvent;
import elemental2.promise.Promise;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "THREE.TextureLoader", namespace = JsPackage.GLOBAL)
public class TextureLoader extends Loader {
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
    void onInvoke(Texture p0);
  }

  @JsFunction
  public interface LoadOnProgressFn {
    void onInvoke(ProgressEvent<EventTarget> p0);
  }

  public TextureLoader() {}

  public TextureLoader(LoadingManager manager) {}

  public native Texture load(
      String url,
      TextureLoader.LoadOnLoadFn onLoad,
      TextureLoader.LoadOnProgressFn onProgress,
      TextureLoader.LoadOnErrorFn onError);

  public native Texture load(
      String url, TextureLoader.LoadOnLoadFn onLoad, TextureLoader.LoadOnProgressFn onProgress);

  public native Texture load(String url, TextureLoader.LoadOnLoadFn onLoad);

  public native Texture load(String url);

  public native Promise<Texture> loadAsync(
      String url, TextureLoader.LoadAsyncOnProgressFn onProgress);

  public native Promise<Texture> loadAsync(String url);
}
