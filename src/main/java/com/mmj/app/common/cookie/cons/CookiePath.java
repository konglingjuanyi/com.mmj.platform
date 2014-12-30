/*
 * Copyright 2011-2016 MSUN.com All right reserved. This software is the confidential and proprietary information of
 * MSUN.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with MSUN.com.
 */
package com.mmj.app.common.cookie.cons;

/**
 * @author zxc Jul 3, 2014 4:43:08 PM
 */
public enum CookiePath {

    ROOT("/"), MANAGE("/manage");

    private String path;

    private CookiePath(String path) {
        this.setPath(path);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static CookiePath getEnum(String path) {
        for (CookiePath cookiePath : values()) {
            if (cookiePath.getPath().equals(path)) return cookiePath;
        }
        return null;
    }
}
