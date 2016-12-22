/*
 * Copyright (c) 2016. PhenixP2P Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0(the "License");
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

package com.phenixp2p.demo.api.response;

import com.google.gson.annotations.SerializedName;

public class Authentication {

  @SerializedName("authenticationToken")
  private String mAuthenticationToken;
  @SerializedName("status")
  private String mStatus;

  public String getAuthenticationToken() {
    return mAuthenticationToken;
  }

  public void setAuthenticationToken(String authenticationToken) {
    mAuthenticationToken = authenticationToken;
  }

  public String getStatus() {
    return mStatus;
  }

  public void setStatus(String status) {
    mStatus = status;
  }
}
