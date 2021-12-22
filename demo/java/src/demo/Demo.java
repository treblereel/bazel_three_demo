package demo;

import elemental2.dom.DomGlobal;
import org.treblereel.gwt.elemental2.three.BoxGeometry;
import org.treblereel.gwt.elemental2.three.Mesh;
import org.treblereel.gwt.elemental2.three.MeshBasicMaterial;
import org.treblereel.gwt.elemental2.three.MeshBasicMaterialParameters;
import org.treblereel.gwt.elemental2.three.PerspectiveCamera;
import org.treblereel.gwt.elemental2.three.Scene;
import org.treblereel.gwt.elemental2.three.Texture;
import org.treblereel.gwt.elemental2.three.TextureLoader;
import org.treblereel.gwt.elemental2.three.WebGLRenderer;
import org.treblereel.gwt.elemental2.three.WebGLRendererParameters;

public class Demo {

    private PerspectiveCamera camera;
    private Scene scene;
    private Mesh mesh;
    private WebGLRenderer renderer;

    Demo() {
        camera = new PerspectiveCamera( 70, DomGlobal.window.innerWidth / DomGlobal.window.innerHeight, 1, 1000 );
        camera.position.z = 400;
        scene = new Scene();
        Texture texture = new TextureLoader().load("https://threejs.org/examples/textures/crate.gif" );
        MeshBasicMaterialParameters meshBasicMaterialParameters = MeshBasicMaterialParameters.create();
        meshBasicMaterialParameters.setMap(texture);

        BoxGeometry geometry = new BoxGeometry(200, 200, 200 );
        MeshBasicMaterial material = new MeshBasicMaterial(meshBasicMaterialParameters);

        mesh = new Mesh( geometry, material );

        scene.add( mesh );

        WebGLRendererParameters webGLRendererParameters = WebGLRendererParameters.create();
        webGLRendererParameters.setAntialias(true);

        renderer = new WebGLRenderer(webGLRendererParameters);
        renderer.setPixelRatio( DomGlobal.window.devicePixelRatio );
        renderer.setSize( DomGlobal.window.innerWidth, DomGlobal.window.innerHeight );
        DomGlobal.document.body.appendChild( renderer.domElement );

        DomGlobal.window.addEventListener("resize", evt -> onWindowResize(), false);

        animate();
    }

    private void  onWindowResize() {

        camera.aspect = DomGlobal.window.innerWidth / DomGlobal.window.innerHeight;
        camera.updateProjectionMatrix();

        renderer.setSize( DomGlobal.window.innerWidth, DomGlobal.window.innerHeight );

    }

    private void animate() {
        DomGlobal.requestAnimationFrame(timestamp -> animate());

        mesh.rotation.x += 0.005;
        mesh.rotation.y += 0.01;

        renderer.render( scene, camera );
    }

}
