package com.srinivas.bottommenu.transformer;

import android.graphics.Rect;

import com.srinivas.bottommenu.WheelView;
import com.srinivas.bottommenu.WheelView;

public interface WheelItemTransformer {
    /**
     * You have control over the Items draw bounds. By supplying your own WheelItemTransformer
     * you must call set bounds on the itemBounds.
     */
    void transform(WheelView.ItemState itemState, Rect itemBounds);

 }
