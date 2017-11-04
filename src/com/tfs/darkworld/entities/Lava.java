package com.tfs.darkworld.entities;

import java.awt.Graphics2D;

import com.tfs.darkworld.res.CommonRasters;

public class Lava extends Box {
	public  static final int LAVA_WIDTH = 256;
	public static final int LAVA_HEIGHT = 256;
	
	public Lava() {
		super(LAVA_WIDTH, LAVA_HEIGHT);
	}

	@Override
	public void update() {
		mX += mDX;
		mY += mDY;
	}

	@Override
	public void render(Graphics2D g, int sw, int sh) {
		
		g.drawImage(CommonRasters.getLavaTile(),(int) mX,(int) mY,(int)mWidth,(int)mHeight, null);
	}

	@Override
	public void intersect(GameEntity ge) {
	}

}
