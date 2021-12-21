package library;


import org.treblereel.j2cl.processors.annotations.GWT3EntryPoint;

public class Greeting {

    @GWT3EntryPoint
    public void onModuleLoad() {
        new Test().init();
    }

}
