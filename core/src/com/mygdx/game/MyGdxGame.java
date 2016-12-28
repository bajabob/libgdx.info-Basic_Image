package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends ApplicationAdapter {
	private Stage stage;

	@Override
	public void create () {
		stage = new Stage(new ScreenViewport());
		Texture texture = new Texture(Gdx.files.absolute("image.jpg"));
		TextureRegion textureRegion = new TextureRegion(texture);
		TextureRegionDrawable textureRegionDrawable = new TextureRegionDrawable(textureRegion);

		Image image1 = new Image(textureRegionDrawable);
		image1.setSize(170,170);
		image1.setPosition(Gdx.graphics.getWidth()/3-image1.getWidth()/2,Gdx.graphics.getHeight()/2-image1.getHeight()/2);

		stage.addActor(image1);

		Image image2 = new Image(textureRegionDrawable);
		image2.setSize(170,170);
		image2.setPosition(Gdx.graphics.getWidth()*2/3-image2.getWidth()/2,Gdx.graphics.getHeight()/2-image2.getHeight()/2);
		image2.setOrigin(image2.getWidth()/2,image2.getHeight()/2);
		image2.rotateBy(45);

		stage.addActor(image2);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();

	}
}
