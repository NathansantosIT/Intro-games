package br.edu.ufabc.meuprimeirojogo.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader;
import com.badlogic.gdx.graphics.g3d.model.Node;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.UBJsonReader;

public class GameAction {
	
	protected Array<GameObject> objects;
	
	public GameAction() {
		objects = new Array<GameObject>();
		// vou carregar os modelos aqui (inicialmente)
		ModelLoader<ModelParameters> loader;
		loader = new G3dModelLoader(new UBJsonReader());
		
		Model mCenario = loader.loadModel(Gdx.files.internal("cenario/cenario.g3db"));
		Model mPost = loader.loadModel(Gdx.files.internal("cenario/poste.g3db"));
		Model mBanco = loader.loadModel(Gdx.files.internal("cenario/banco.g3db"));
		Model mLixeira = loader.loadModel(Gdx.files.internal("cenario/lixeira.g3db"));
		Model mLixo = loader.loadModel(Gdx.files.internal("cenario/lixo.g3db"));
		Model mMuro_g_1 = loader.loadModel(Gdx.files.internal("cenario/muro_g_1.g3db"));
		Model mMuro_g_2 = loader.loadModel(Gdx.files.internal("cenario/muro_g_2.g3db"));
		Model mMuro_mc_1 = loader.loadModel(Gdx.files.internal("cenario/muro_mc_1.g3db"));
		Model mMuro_mc_2 = loader.loadModel(Gdx.files.internal("cenario/muro_mc_2.g3db"));
		Model mMuro_mm_1 = loader.loadModel(Gdx.files.internal("cenario/muro_mm_1.g3db"));
		Model mMuro_mm_2 = loader.loadModel(Gdx.files.internal("cenario/muro_mm_2.g3db"));
		Model mMuro_p_1 = loader.loadModel(Gdx.files.internal("cenario/muro_p_1.g3db"));
		Model mMuro_p_2 = loader.loadModel(Gdx.files.internal("cenario/muro_p_2.g3db"));
		Model mPortao = loader.loadModel(Gdx.files.internal("cenario/portao.g3db"));
		Model mPredio1 = loader.loadModel(Gdx.files.internal("cenario/predio1.g3db"));
		Model mPredio2 = loader.loadModel(Gdx.files.internal("cenario/predio2.g3db"));
		Model mPredio3  = loader.loadModel(Gdx.files.internal("cenario/predio3.g3db"));
		Model mPredio4  = loader.loadModel(Gdx.files.internal("cenario/predio4.g3db"));
		Model mPredio5  = loader.loadModel(Gdx.files.internal("cenario/predio5.g3db"));
		
		Model mHero = loader.loadModel(Gdx.files.internal("Hiccup/Hiccup_anim1_scale.g3db"));
		
		objects.add(new GameObject(mCenario));
		
		GameObject cenario = objects.first();
		Vector3 position = new Vector3();
		
		
		for(Node n: cenario.nodes) {
			n.globalTransform.getTranslation(position);
			System.out.println(n.id + " - " + position);
			if(n.id.contains("poste")) {
				GameObject poste = new GameObject(mPost);
				poste.transform.setToTranslation(position);
				objects.add(poste);
			} else if(n.id.contains("banco")) {
				GameObject banco = new GameObject(mBanco);
				banco.transform.setToTranslation(position);
				objects.add(banco);
			} else if(n.id.contains("lixeira")) {
				GameObject lixeira = new GameObject(mLixeira);
				lixeira.transform.setToTranslation(position);
				objects.add(lixeira);
			} else if(n.id.contains("lixo")) {
				GameObject lixo = new GameObject(mLixo);
				lixo.transform.setToTranslation(position);
				objects.add(lixo);
			} else if(n.id.contains("muro_g_1")) {
				GameObject muro_g_1 = new GameObject(mMuro_g_1);
				muro_g_1.transform.setToTranslation(position);
				objects.add(muro_g_1);
			} else if(n.id.contains("muro_g_2")) {
				GameObject muro_g_2 = new GameObject(mMuro_g_2);
				muro_g_2.transform.setToTranslation(position);
				objects.add(muro_g_2);
			} else if(n.id.contains("muro_mc_1")) {
				GameObject muro_mc_1 = new GameObject(mMuro_mc_1);
				muro_mc_1.transform.setToTranslation(position);
				objects.add(muro_mc_1);
			} else if(n.id.contains("muro_mc_2")) {
				GameObject muro_mc_2 = new GameObject(mMuro_mc_2);
				muro_mc_2.transform.setToTranslation(position);
				objects.add(muro_mc_2);
			} else if(n.id.contains("muro_mm_1")) {
				GameObject muro_mm_1 = new GameObject(mMuro_mm_1);
				muro_mm_1.transform.setToTranslation(position);
				objects.add(muro_mm_1);
			} else if(n.id.contains("muro_mm_2")) {
				GameObject muro_mm_2 = new GameObject(mMuro_mm_2);
				muro_mm_2.transform.setToTranslation(position);
				objects.add(muro_mm_2);
			} else if(n.id.contains("muro_p_1")) {
				GameObject muro_p_1 = new GameObject(mMuro_p_1);
				muro_p_1.transform.setToTranslation(position);
				objects.add(muro_p_1);
			} else if(n.id.contains("muro_p_2")) {
				GameObject muro_p_2 = new GameObject(mMuro_p_2);
				muro_p_2.transform.setToTranslation(position);
				objects.add(muro_p_2);
			} else if(n.id.contains("portao")) {
				GameObject portao = new GameObject(mPortao);
				portao.transform.setToTranslation(position);
				objects.add(portao);
			} else if(n.id.contains("predio_1")) {
				GameObject predio1 = new GameObject(mPredio1);
				predio1.transform.setToTranslation(position);
				objects.add(predio1);
			} else if(n.id.contains("predio_2")) {
				GameObject predio2 = new GameObject(mPredio2);
				predio2.transform.setToTranslation(position);
				objects.add(predio2);
			} else if(n.id.contains("predio_3")) {
				GameObject predio3 = new GameObject(mPredio3);
				predio3.transform.setToTranslation(position);
				objects.add(predio3);
			} else if(n.id.contains("predio_4")) {
				GameObject predio4 = new GameObject(mPredio4);
				predio4.transform.setToTranslation(position);
				objects.add(predio4);
			} else if(n.id.contains("predio_5")) {
				GameObject predio5 = new GameObject(mPredio5);
				predio5.transform.setToTranslation(position);
				objects.add(predio5);
			}	
		}
		
		Hero hero = new Hero(mHero);
		hero.transform.setToTranslation(-22.0f,0.18917744f,-19.0f);
		//hero.transform.scale(0.05f,0.05f,0.05f);
		hero.transform.scale(0.8f,0.8f,0.8f);
		hero.transform.rotate(Vector3.Y,90);
		objects.add(hero);
		
		for(GameObject o: objects) {
			for(Material mat: o.materials) {
				mat.remove(ColorAttribute.Emissive);
			}
		}
	}

	public void update(float delta) {
		for(GameObject o: objects) {
			o.update(delta);
		}
	}
}
