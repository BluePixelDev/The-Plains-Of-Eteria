package org.eteriaEngine.rendering.mesh;

public class Primitives {
    private static Mesh quad = new Quad(1, 1);

    public static Mesh getQuad() {
        return new Mesh(quad.getMeshID());
    }
}