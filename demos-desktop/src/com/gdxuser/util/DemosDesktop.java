/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.gdxuser.util;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.tests.IsoCamTest;
import com.badlogic.gdx.tests.TestCollection;

public class DemosDesktop {
	public static void main(String[] argv) {
		// TODO add menu system to allow user to pick which demo to launch
		// low tech switching method to choose which demo to view! comments!
		// new LwjglApplication(new SimpleTest(), "Game", 480, 320, false);
		// new LwjglApplication(new DecalWall(), "Game", 800, 480, false);
		// new LwjglApplication(new ModelViewer(), "Game", 800, 480, false);
		// new LwjglApplication(new Box2DTest(), "Game", 800, 480, false);
//		new LwjglApplication(new PhysicsTest(), "Game", 800, 480, false);
		// new LwjglApplication(new IsoCamTest(), "Game", 800, 480, false);
		new LwjglApplication(new TestCollection(), "Game", 800, 480, false);
	}
}