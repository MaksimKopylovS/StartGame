package max_sk.star.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import max_sk.star.game.StarGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 500;
		config.height = 700;
		config.resizable = false;
		new LwjglApplication(new StarGame(), config);
	}
}
