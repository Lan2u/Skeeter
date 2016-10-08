package com.skeeter.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Paul Lancaster on 08/10/16
 */
public abstract class GameSprite extends Sprite {

    @Override
    public void draw(Batch batch){
        System.out.println("ERROR SOMETHING DIDN'T OVERWRITE DRAW");
    }

    public void update(float deltaT){

    }
}