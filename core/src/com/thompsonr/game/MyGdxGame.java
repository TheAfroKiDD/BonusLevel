package com.thompsonr.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import Utility.BasicAnimation;
import Utility.SpriteAccessor;
import Utility.UniversalResource;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;


public class MyGdxGame extends ApplicationAdapter {
    private static final  Color BColour = new Color((29f/255f),98/255f,209/255f,1f);
	SpriteBatch batch;
	TextureAtlas RoomAtlas,PowerAtlas,PlayerAtlas;
    TextureRegion WallReg,FloorReg,VortexReg, DoorReg,PUP1,PUP2,PUP3,PUP4,player;
    private Vector2 position;
    private float animationTime;

	Sprite Vortex;
	private Array<Color> colors;
	private int currentColor;
	TweenManager tweenManager;

	public static final float PPM =16;
	ScreenViewport viewport;


	@Override
	public void create () {
        viewport = new ScreenViewport();
        viewport.update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        RoomAtlas = new TextureAtlas(Gdx.files.internal("TextureAtlas/MainRoomAtlas.atlas"));
        PowerAtlas = new TextureAtlas(Gdx.files.internal("TextureAtlas/PowerUpAtlas.atlas"));
        PlayerAtlas = new TextureAtlas(Gdx.files.internal("TextureAtlas/PlayerMovement.atlas"));
		batch = new SpriteBatch();
		position = new Vector2(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        WallReg = RoomAtlas.findRegion("MainWall");
        FloorReg = RoomAtlas.findRegion("MainFloor");
        VortexReg = RoomAtlas.findRegion("Vortex");
        DoorReg = RoomAtlas.findRegion("MainDoor");

        PUP1= PowerAtlas.findRegion("PowerUp1");
        PUP2=PowerAtlas.findRegion("PowerUp2");
        PUP3=PowerAtlas.findRegion("PowerUp3");
        PUP4=PowerAtlas.findRegion("PowerUp4");

        player = PlayerAtlas.findRegion("Player");


        Vortex= new Sprite(VortexReg);
        Vortex.setPosition(0,0);
    }
    @Override
	public void resize(int width, int height){

	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(BColour.r,BColour.g,BColour.b,BColour.a);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(viewport.getCamera().combined);

        animationTime+=Gdx.graphics.getDeltaTime();
		batch.begin();


        batch.draw(VortexReg,-590,240,0,0,VortexReg.getRegionWidth(),VortexReg.getRegionHeight(),6/PPM,6/PPM,0);
        batch.draw(VortexReg,-290,240,0,0,VortexReg.getRegionWidth(),VortexReg.getRegionHeight(),6/PPM,6/PPM,0);
        batch.draw(VortexReg,-130,170,0,0,VortexReg.getRegionWidth(),VortexReg.getRegionHeight(),8/PPM,8/PPM,0);
        batch.draw(VortexReg,120,240,0,0,VortexReg.getRegionWidth(),VortexReg.getRegionHeight(),6/PPM,6/PPM,0);
        batch.draw(VortexReg,450,240,0,0,VortexReg.getRegionWidth(),VortexReg.getRegionHeight(),6/PPM,6/PPM,0);


        batch.draw(WallReg,-611,181,0,0,WallReg.getRegionWidth(),WallReg.getRegionHeight(),8/PPM,7/PPM,0);
		batch.draw(WallReg,110,181,0,0,WallReg.getRegionWidth(),WallReg.getRegionHeight(),8/PPM,7/PPM,0);
		batch.draw(DoorReg,-115,181,0,0,DoorReg.getRegionWidth(),DoorReg.getRegionHeight(),14.6f/PPM,7/PPM,0);
		batch.draw(FloorReg,-611,-401,0,0,FloorReg.getRegionWidth(),FloorReg.getRegionHeight(),19.6f/PPM,9.31f/PPM,0);

        Vortex.draw(batch);


        batch.end();
	}
	@Override
	public void resume(){}
	@Override
	public void pause(){}
	@Override
	public void dispose () {
		batch.dispose();
        RoomAtlas.dispose();

	}
}
