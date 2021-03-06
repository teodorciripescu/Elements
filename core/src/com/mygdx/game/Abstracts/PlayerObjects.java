package com.mygdx.game.Abstracts;
/**
 * Created by Filip
 */
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class PlayerObjects
{
    public abstract int hits(Rectangle r);
    public abstract void action(int type , float x , float y);
    public abstract void update(float delta);
    public abstract void setPosition(float x , float y);
    public abstract void moveLeft(float delta);
    public abstract void moveRight(float delta);
    public abstract void Draw(SpriteBatch batch);
    public abstract void Jump();
    public abstract Rectangle getHitBox();
    public abstract void CreateHealthBar(Camera camera,int x , int y);
    public abstract void TakeDamange(int x);
    public abstract boolean Die();
}
