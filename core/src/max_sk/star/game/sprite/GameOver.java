package max_sk.star.game.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import max_sk.star.game.base.Sprite;
import max_sk.star.game.math.Rect;

public class GameOver extends Sprite {

    private static final float HEIGHT = 0.07f;
    private static final float BOTTOM_MARGIN = 0.009f;

    public GameOver(TextureAtlas atlas){
        super(atlas.findRegion("message_game_over"));
    }

    @Override
    public void resize(Rect worldBounds){
        setHeightProportion(HEIGHT);
        setBottom(BOTTOM_MARGIN);
    }
}
