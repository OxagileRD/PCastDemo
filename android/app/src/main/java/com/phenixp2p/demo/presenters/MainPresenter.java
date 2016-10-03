/**
 * Copyright 2016 PhenixP2P Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phenixp2p.demo.presenters;

import com.phenixp2p.demo.presenters.inter.IMainPresenter;
import com.phenixp2p.demo.ui.view.IMainView;
import com.phenixp2p.pcast.Renderer;

public class MainPresenter implements IMainPresenter {
  private Renderer renderer;
  private IMainView view;

  public MainPresenter(IMainView view) {
    this.view = view;
  }

  @Override
  public void stopRendering() {
    if (renderer != null) {
      renderer.stop();
    }
  }

  @Override
  public void startRendering(Renderer renderer) {
    view.viewStream(renderer);
    this.renderer = renderer;
  }
}