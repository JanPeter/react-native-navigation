package com.reactnativenavigation.params;

import android.support.annotation.ColorInt;

public class StyleParams {
    public static class Color {
        @ColorInt
        private Integer color = null;

        public Color() {
            color = null;
        }

        public Color(Integer color) {
            this.color = color;
        }

        public boolean hasColor() {
            return color != null;
        }

        public int getColor() {
            if (!hasColor()) {
                throw new RuntimeException("Color undefined");
            }
            return color;
        }

        public static Color parse(String str) {
            if (str == null) {
                return new Color();
            }
            return new Color(android.graphics.Color.parseColor(str));
        }
    }

    public Color statusBarColor;

    public Color topBarColor;
    public boolean topBarHidden;
    public boolean topTabsHidden;

    public boolean titleBarHidden;
    public Color titleBarTitleColor;
    public Color titleBarButtonColor;
    public boolean backButtonHidden;

    public boolean bottomTabsHidden;
    public boolean bottomTabsHiddenOnScroll;
    public Color bottomTabsColor;
    public Color selectedBottomTabsButtonColor;
    public Color bottomTabsButtonColor;

    public Color navigationBarColor;

    public boolean drawScreenBelowTopBar;
}