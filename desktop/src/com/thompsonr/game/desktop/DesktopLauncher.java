package com.thompsonr.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.thompsonr.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height=800;
		config.width =1220;
		TexturePacker.process("../assets/Kitchen","../assets/TextureAtlas","KitchenAtlas");
		TexturePacker.process("../assets/MainRoom","../assets/TextureAtlas","MainRoomAtlas");
		TexturePacker.process("../assets/sprites","../assets/TextureAtlas","PowerUpAtlas");
		TexturePacker.process("../assets/Player","../assets/TextureAtlas","PlayerMovement");
		TexturePacker.process("../assets/ImgWheel","../assets/TextureAtlas","ThreeBladesAtlas");
		new LwjglApplication(new MyGdxGame(), config);
	}
}
