package com.matimdev.base;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.BoundCamera;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.app.Activity;

import com.matimdev.manager.ResourcesManager;
import com.matimdev.manager.SceneManager.SceneType;

/**
 * @author Mateusz Mysliwiec
 * @author www.matim-dev.com
 * @version 1.0
 */
public abstract class BaseScene extends Scene
{
	//---------------------------------------------
	// VARIABLES
	//---------------------------------------------
	
	protected Engine engine;
	protected Activity activity;
	protected ResourcesManager resourcesManager;
	protected VertexBufferObjectManager vbom;
	protected BoundCamera camera;
	
	//---------------------------------------------
	// CONSTRUCTOR
	//---------------------------------------------
	
	public BaseScene()
	{
		this.resourcesManager = ResourcesManager.getInstance();
		this.engine = resourcesManager.engine;
		this.activity = resourcesManager.activity;
		this.vbom = resourcesManager.vbom;
		this.camera = resourcesManager.camera;
		createScene();
	}
	
	public Activity getBaseActivity() {
		return activity;
	}
	
	//---------------------------------------------
	// ABSTRACTION
	//---------------------------------------------
	
	public abstract void createScene();
	
	public abstract void onBackKeyPressed();
	
	public abstract SceneType getSceneType();
	
	public abstract void disposeScene();
}