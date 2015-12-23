package com.noahhuppert.atmosphere;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.noahhuppert.atmosphere.views.StationViewScreen;

public class AtmosphereGame extends Game {
	public SpriteBatch spriteBatch;

	@Override
	public void create () {
        spriteBatch = new SpriteBatch();
        setScreen(new StationViewScreen(this));
        /*
		batch = new SpriteBatch();

		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		camera.setToOrtho(false);
		*/
	}

	@Override
	public void render () {
        super.render();
        /*
        camera.update();
        batch.setProjectionMatrix(camera.combined);

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

		batch.end();
		*/
	}

    @Override
    public void dispose() {
        spriteBatch.dispose();
    }
}
