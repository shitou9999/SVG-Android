package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_smoking_rooms extends SVGRenderer {

    public ic_smoking_rooms(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(2.0f, 16.0f);
        mPath.rLineTo(15.0f, 0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.lineTo(2.0f, 19.0f);
        mPath.close();
        mPath.moveTo(2.0f, 16.0f);
        mPath.rMoveTo(18.5f, 0.0f);
        mPath.lineTo(22.0f, 16.0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(-1.5f, 0f);
        mPath.close();
        mPath.moveTo(20.5f, 16.0f);
        mPath.moveTo(18.0f, 16.0f);
        mPath.rLineTo(1.5f, 0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.lineTo(18.0f, 19.0f);
        mPath.close();
        mPath.moveTo(18.0f, 16.0f);
        mPath.rMoveTo(0.85f, -8.27f);
        mPath.rCubicTo(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        mPath.cubicTo(19.85f, 3.5f, 18.35f, 2.0f, 16.5f, 2.0f);
        mPath.rLineTo(0f, 1.5f);
        mPath.rCubicTo(1.02f, 0.0f, 1.85f, 0.83f, 1.85f, 1.85f);
        mPath.cubicTo(18.35f, 6.37f, 17.52f, 7.2f, 16.5f, 7.2f);
        mPath.rLineTo(0f, 1.5f);
        mPath.rCubicTo(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        mPath.lineTo(20.5f, 15.0f);
        mPath.lineTo(22.0f, 15.0f);
        mPath.rLineTo(0f, -2.24f);
        mPath.rCubicTo(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        mPath.close();
        mPath.moveTo(18.85f, 7.7299995f);
        mPath.rMoveTo(-2.82f, 2.47f);
        mPath.lineTo(14.5f, 10.2f);
        mPath.rCubicTo(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        mPath.rCubicTo(0.0f, -1.0199995f, 0.83f, -1.75f, 1.85f, -1.75f);
        mPath.rLineTo(0f, -1.5f);
        mPath.rCubicTo(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        mPath.rCubicTo(0.0f, 1.8499994f, 1.5f, 3.35f, 3.35f, 3.35f);
        mPath.rLineTo(1.53f, 0f);
        mPath.rCubicTo(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        mPath.lineTo(18.0f, 15.0f);
        mPath.rLineTo(1.5f, 0f);
        mPath.rLineTo(0f, -1.64f);
        mPath.rCubicTo(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        mPath.close();
        mPath.moveTo(16.03f, 10.2f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}