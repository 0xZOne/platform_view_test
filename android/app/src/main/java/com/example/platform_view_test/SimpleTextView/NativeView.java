package com.example.platform_view_test;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.platform.PlatformView;
import java.util.Map;

class NativeView implements PlatformView {
   @NonNull private final TextView textView;

    NativeView(@NonNull Context context, int id, @Nullable Map<String, Object> creationParams) {
        textView = new TextView(context);
        textView.setTextSize(24);

        int color = Color.RED;
        textView.setBackgroundColor(color);
        textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

        StringBuilder sb = new StringBuilder();
        // for (Map.Entry<String, Object> entry : creationParams.entrySet()) {
        //     sb.append(entry.getKey() + ": " + entry.getValue().toString()).append("\n");
        // }
        sb.append("Texture ID = \n\n" + id);
        sb.append("Simple TextView");
        textView.setTextColor(Color.WHITE);
        textView.setText(sb.toString());
    }

    @NonNull
    @Override
    public View getView() {
        return textView;
    }

    @Override
    public void dispose() {}
}
