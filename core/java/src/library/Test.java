package library;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;

public class Test {

    public void init() {
        HTMLButtonElement btn = (HTMLButtonElement) DomGlobal.document.createElement("button");
        btn.textContent = "CLICK ME";
        btn.addEventListener("click", evt -> DomGlobal.window.alert("HELLO WORLD!"));
        DomGlobal.document.body.appendChild(btn);
    }
}
