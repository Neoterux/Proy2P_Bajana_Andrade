package com.neoterux.proyecto2p.model.shape;

import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;

public class Mark {

    private static final String path = "m407.579 87.677c-31.073-53.624-86.265-86.385-147.64-87.637-2.62-.054-5.257-.054-7.878 0-61.374 1.252-116.566 34.013-147.64 87.637-31.762 54.812-32.631 120.652-2.325 176.123l126.963 232.387c.057.103.114.206.173.308 5.586 9.709 15.593 15.505 26.77 15.505 11.176 0 21.183-5.797 26.768-15.505.059-.102.116-.205.173-.308l126.963-232.387c30.304-55.471 29.435-121.311-2.327-176.123zm-151.579 144.323c-39.701 0-72-32.299-72-72s32.299-72 72-72 72 32.299 72 72-32.298 72-72 72z";

    private SVGPath svgPath;

    public Mark(String fill_color) {
        this.svgPath = new SVGPath();
        svgPath.setContent(path);
        svgPath.setFill(Color.web(fill_color));
        var ow = svgPath.prefWidth(-1);
        var oh = svgPath.prefHeight(ow);
        svgPath.setScaleX(10d / ow);
        svgPath.setScaleY(25d / oh);
    }

    public SVGPath getPath() {
        return this.svgPath;
    }
}
