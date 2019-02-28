package Utility;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenManager;


public class UniversalResource {
    public TweenManager tweenManager;

    private static UniversalResource instance;

    private static UniversalResource getInstance(){
        if(instance==null){instance = new UniversalResource();}

    return instance;
}

private UniversalResource(){configure();}

private void configure(){
    Tween.setCombinedAttributesLimit(4);
    tweenManager = new TweenManager();
    Tween.registerAccessor(Utility.TweenData.class,new Utility.SpriteAccessor());}

}