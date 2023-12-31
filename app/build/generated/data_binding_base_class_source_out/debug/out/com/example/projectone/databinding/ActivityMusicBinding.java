// Generated by view binder compiler. Do not edit!
package com.example.projectone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMusicBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnStartStop;

  @NonNull
  public final Button btnStartTimer;

  private ActivityMusicBinding(@NonNull LinearLayout rootView, @NonNull Button btnStartStop,
      @NonNull Button btnStartTimer) {
    this.rootView = rootView;
    this.btnStartStop = btnStartStop;
    this.btnStartTimer = btnStartTimer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMusicBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMusicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_music, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMusicBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnStartStop;
      Button btnStartStop = ViewBindings.findChildViewById(rootView, id);
      if (btnStartStop == null) {
        break missingId;
      }

      id = R.id.btnStartTimer;
      Button btnStartTimer = ViewBindings.findChildViewById(rootView, id);
      if (btnStartTimer == null) {
        break missingId;
      }

      return new ActivityMusicBinding((LinearLayout) rootView, btnStartStop, btnStartTimer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
