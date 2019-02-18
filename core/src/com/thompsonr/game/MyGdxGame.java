package com.thompsonr.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ScreenViewport;



public class MyGdxGame extends ApplicationAdapter {
    public final static Color BColour = new Color((252f/255f),183/255f,7/255f,1f);
	SpriteBatch batch;
	Texture img, PUP1,PUP2,PUP3,PUP4,Broken;

	public static final float PPM =16;

	ScreenViewport viewport;

	@Override
	public void create () {
        viewport = new ScreenViewport();
        viewport.setUnitsPerPixel(1 / PPM);
        viewport.update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch = new SpriteBatch();

        img = new Texture("gfx/badlogic.jpg");
        PUP1 = new Texture("sprites/PowerUp1.png");
        PUP2 = new Texture("sprites/PowerUp2.png");
        PUP3 = new Texture("sprites/PowerUp3.png");
        PUP4 = new Texture("sprites/PowerUp4.png");
        Broken = new Texture("sprites/Broken.png");




    }
    @Override
	public void resize(int width, int height){

	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(BColour.r,BColour.g,BColour.b,BColour.a);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(viewport.getCamera().combined);

        int width = img.getWidth();
        int height = img.getHeight();
        float OriginX=width*.5f;
        float OriginY=height*height*.5f;

        batch.begin();
        batch.draw(PUP1,0.1f,0,PUP1.getWidth()/PPM,PUP1.getHeight()/PPM);
        batch.draw(PUP2,0.2f,0,PUP2.getWidth()/PPM,PUP2.getHeight()/PPM);
        batch.draw(PUP3,0.3f,0,PUP3.getWidth()/PPM,PUP3.getHeight()/PPM);
        batch.draw(PUP4,0.4f,0,PUP4.getWidth()/PPM,PUP4.getHeight()/PPM);
        batch.end();
	}
	@Override
	public void resume(){}
	@Override
	public void pause(){}
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
