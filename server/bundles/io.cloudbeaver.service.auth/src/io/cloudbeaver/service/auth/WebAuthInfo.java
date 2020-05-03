/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
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
package io.cloudbeaver.service.auth;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;

/**
 * WebAuthInfo
 */
public class WebAuthInfo {

    private String userId;
    private String authProvider;
    private Object authToken;
    private OffsetDateTime loginTime;
    private String message;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAuthProvider() {
        return authProvider;
    }

    public void setAuthProvider(String authProvider) {
        this.authProvider = authProvider;
    }

    public Object getAuthToken() {
        return authToken;
    }

    public void setAuthToken(Object authToken) {
        this.authToken = authToken;
    }

    public OffsetDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(OffsetDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
