package com.srinivas.bottommenu.transformer;

import android.graphics.drawable.Drawable;

import com.srinivas.bottommenu.WheelView;

public interface WheelSelectionTransformer {
    void transform(Drawable drawable, WheelView.ItemState itemState);
}
