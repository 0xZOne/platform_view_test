package com.example.platform_view_test;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MainActivity extends FlutterActivity {
    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        flutterEngine
            .getPlatformViewsController()
            .getRegistry()
            .registerViewFactory("<simple-text-view>", new NativeViewFactory());
        flutterEngine
            .getPlatformViewsController()
            .getRegistry()
            .registerViewFactory("<gl-surface-view>", new GlSurfaceFactory());
    }
}