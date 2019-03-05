package br.edu.ufabc.meuprimeirojogo.core;

import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.utils.AnimationController;
import com.badlogic.gdx.graphics.g3d.utils.AnimationController.AnimationDesc;

public class Hero extends GameObject{

	private AnimationController animationController;
	private boolean animationDone;
	
	public Hero(Model model) {
		super(model);
		this.visible = true;
		
		animationController = new AnimationController(this);
		animationDone = false;
		
		animationController.setAnimation(animations.get(0).id, -1,
				 new AnimationController.AnimationListener(){
				 @Override
				 public void onLoop(AnimationDesc animation){
				animationDone = true;
				 }
				 @Override
				 public void onEnd(AnimationDesc animation){
				animationDone = true;
				 }
				 });
	}
	
	public boolean isAnimationDone(){
		return animationDone;
	}
	
	public void resetAnimation(){
		animationDone = false;
	}
	
	public void update(float delta){
		animationController.update(delta);
	}

}
