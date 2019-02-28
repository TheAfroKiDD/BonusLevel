package Utility;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;



public class TweenData {
    private Vector2 xy;
    private Color color;
    private float scale;
    private float rotation;

    public TweenData(){
        xy=new Vector2();
        color= new Color();
    }
    public float getScale(){return scale;}
    public Vector2 getXY(){return  xy;}
    public float getRotation(){return rotation;}
    public Color getColor(){return color;}

    public void setXY(Vector2 v){xy.x=v.x;xy.y=v.y;}
    public void setColor(Color c){color=c;}
    public void setScale(float s){scale=s;}
    public void setRotation(float r){rotation=r;}
}
