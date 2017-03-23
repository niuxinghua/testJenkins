// Generated code from Butter Knife. Do not modify!
package com.tq.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CitySelectActivity$$ViewBinder<T extends com.tq.activity.CitySelectActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492949, "field 'backBtn'");
    target.backBtn = finder.castView(view, 2131492949, "field 'backBtn'");
    view = finder.findRequiredView(source, 2131492973, "field 'clearBtn'");
    target.clearBtn = finder.castView(view, 2131492973, "field 'clearBtn'");
    view = finder.findRequiredView(source, 2131492950, "field 'cancel'");
    target.cancel = finder.castView(view, 2131492950, "field 'cancel'");
    view = finder.findRequiredView(source, 2131492945, "field 'overlay'");
    target.overlay = finder.castView(view, 2131492945, "field 'overlay'");
    view = finder.findRequiredView(source, 2131492972, "field 'searchBox'");
    target.searchBox = finder.castView(view, 2131492972, "field 'searchBox'");
    view = finder.findRequiredView(source, 2131492944, "field 'mListView'");
    target.mListView = finder.castView(view, 2131492944, "field 'mListView'");
    view = finder.findRequiredView(source, 2131492947, "field 'mResultListView'");
    target.mResultListView = finder.castView(view, 2131492947, "field 'mResultListView'");
    view = finder.findRequiredView(source, 2131492971, "field 'emptyView'");
    target.emptyView = finder.castView(view, 2131492971, "field 'emptyView'");
    view = finder.findRequiredView(source, 2131492946, "field 'mLetterBar'");
    target.mLetterBar = finder.castView(view, 2131492946, "field 'mLetterBar'");
  }

  @Override public void unbind(T target) {
    target.backBtn = null;
    target.clearBtn = null;
    target.cancel = null;
    target.overlay = null;
    target.searchBox = null;
    target.mListView = null;
    target.mResultListView = null;
    target.emptyView = null;
    target.mLetterBar = null;
  }
}
