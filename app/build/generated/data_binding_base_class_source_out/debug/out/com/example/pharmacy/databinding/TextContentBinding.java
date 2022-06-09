// Generated by view binder compiler. Do not edit!
package com.example.pharmacy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pharmacy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TextContentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView comp;

  @NonNull
  public final TextView composition;

  @NonNull
  public final TextView cond;

  @NonNull
  public final TextView condition;

  @NonNull
  public final TextView contra;

  @NonNull
  public final TextView contraindication;

  @NonNull
  public final TextView desc;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView eff;

  @NonNull
  public final TextView effect;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView indic;

  @NonNull
  public final TextView indication;

  @NonNull
  public final TextView medName;

  @NonNull
  public final TextView meth;

  @NonNull
  public final TextView method;

  @NonNull
  public final TextView over;

  @NonNull
  public final TextView overdose;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView side;

  @NonNull
  public final TextView sideEffect;

  private TextContentBinding(@NonNull ConstraintLayout rootView, @NonNull TextView comp,
      @NonNull TextView composition, @NonNull TextView cond, @NonNull TextView condition,
      @NonNull TextView contra, @NonNull TextView contraindication, @NonNull TextView desc,
      @NonNull TextView description, @NonNull TextView eff, @NonNull TextView effect,
      @NonNull ImageView image, @NonNull TextView indic, @NonNull TextView indication,
      @NonNull TextView medName, @NonNull TextView meth, @NonNull TextView method,
      @NonNull TextView over, @NonNull TextView overdose, @NonNull ScrollView scrollView2,
      @NonNull TextView side, @NonNull TextView sideEffect) {
    this.rootView = rootView;
    this.comp = comp;
    this.composition = composition;
    this.cond = cond;
    this.condition = condition;
    this.contra = contra;
    this.contraindication = contraindication;
    this.desc = desc;
    this.description = description;
    this.eff = eff;
    this.effect = effect;
    this.image = image;
    this.indic = indic;
    this.indication = indication;
    this.medName = medName;
    this.meth = meth;
    this.method = method;
    this.over = over;
    this.overdose = overdose;
    this.scrollView2 = scrollView2;
    this.side = side;
    this.sideEffect = sideEffect;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TextContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TextContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.text_content, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TextContentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.comp;
      TextView comp = ViewBindings.findChildViewById(rootView, id);
      if (comp == null) {
        break missingId;
      }

      id = R.id.composition;
      TextView composition = ViewBindings.findChildViewById(rootView, id);
      if (composition == null) {
        break missingId;
      }

      id = R.id.cond;
      TextView cond = ViewBindings.findChildViewById(rootView, id);
      if (cond == null) {
        break missingId;
      }

      id = R.id.condition;
      TextView condition = ViewBindings.findChildViewById(rootView, id);
      if (condition == null) {
        break missingId;
      }

      id = R.id.contra;
      TextView contra = ViewBindings.findChildViewById(rootView, id);
      if (contra == null) {
        break missingId;
      }

      id = R.id.contraindication;
      TextView contraindication = ViewBindings.findChildViewById(rootView, id);
      if (contraindication == null) {
        break missingId;
      }

      id = R.id.desc;
      TextView desc = ViewBindings.findChildViewById(rootView, id);
      if (desc == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.eff;
      TextView eff = ViewBindings.findChildViewById(rootView, id);
      if (eff == null) {
        break missingId;
      }

      id = R.id.effect;
      TextView effect = ViewBindings.findChildViewById(rootView, id);
      if (effect == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.indic;
      TextView indic = ViewBindings.findChildViewById(rootView, id);
      if (indic == null) {
        break missingId;
      }

      id = R.id.indication;
      TextView indication = ViewBindings.findChildViewById(rootView, id);
      if (indication == null) {
        break missingId;
      }

      id = R.id.med_name;
      TextView medName = ViewBindings.findChildViewById(rootView, id);
      if (medName == null) {
        break missingId;
      }

      id = R.id.meth;
      TextView meth = ViewBindings.findChildViewById(rootView, id);
      if (meth == null) {
        break missingId;
      }

      id = R.id.method;
      TextView method = ViewBindings.findChildViewById(rootView, id);
      if (method == null) {
        break missingId;
      }

      id = R.id.over;
      TextView over = ViewBindings.findChildViewById(rootView, id);
      if (over == null) {
        break missingId;
      }

      id = R.id.overdose;
      TextView overdose = ViewBindings.findChildViewById(rootView, id);
      if (overdose == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.side;
      TextView side = ViewBindings.findChildViewById(rootView, id);
      if (side == null) {
        break missingId;
      }

      id = R.id.side_effect;
      TextView sideEffect = ViewBindings.findChildViewById(rootView, id);
      if (sideEffect == null) {
        break missingId;
      }

      return new TextContentBinding((ConstraintLayout) rootView, comp, composition, cond, condition,
          contra, contraindication, desc, description, eff, effect, image, indic, indication,
          medName, meth, method, over, overdose, scrollView2, side, sideEffect);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}