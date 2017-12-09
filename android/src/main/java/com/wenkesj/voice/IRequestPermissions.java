package com.wenkesj.voice;

import com.facebook.react.modules.core.PermissionListener;

public interface IRequestPermissions {
  void requestPermissions(String[] permissions, int requestCode, PermissionListener listener);
}
