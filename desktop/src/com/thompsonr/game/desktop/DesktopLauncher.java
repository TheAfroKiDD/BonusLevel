package com.thompsonr.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.thompsonr.game.MyGdxGame;
import com.thompsonr.game.TexturePackerClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height=240;
		config.width =320;
		TexturePacker.process("../assets/Kitchen","../assets/TextureAtlas","KitchenAtlas");
		TexturePacker.process("../assets/MainRoom","../assets/TextureAtlas","MainRoomAtlas");
		TexturePacker.process("../assets/sprites","../assets/TextureAtlas","PowerUpAtlas");
		new LwjglApplication(new MyGdxGame(), config);
	}
}
