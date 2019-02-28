package Utility;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import java.util.Comparator;

public class BasicAnimation extends ApplicationAdapter {

    public static class RegionComparator implements Comparator<TextureAtlas.AtlasRegion>{


        @Override
        public int compare(TextureAtlas.AtlasRegion Region1, TextureAtlas.AtlasRegion Region2) {
            return Region1.name.compareTo(Region2.name);
        }
    }
}
