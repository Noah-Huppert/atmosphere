package com.noahhuppert.atmosphere.views;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.noahhuppert.atmosphere.AtmosphereGame;

public class StationViewScreen implements Screen {
    private final AtmosphereGame game;

    private OrthographicCamera orthographicCamera;

    public StationViewScreen(AtmosphereGame game) {
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.spriteBatch.begin();



        game.spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
