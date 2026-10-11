package com.rayzeng.farmdemo;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.view.View;
public class MainActivity extends Activity {
 WebView web;
 @Override public void onCreate(Bundle state){super.onCreate(state);
   getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
   web=new WebView(this); web.setWebViewClient(new WebViewClient());
   WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
   s.setAllowFileAccess(true); s.setDefaultTextEncodingName("UTF-8");
   setContentView(web); web.loadUrl("file:///android_asset/index.html");
 }
 @Override public void onBackPressed(){if(web!=null)web.evaluateJavascript("window.onAndroidBack && window.onAndroidBack()",null);else super.onBackPressed();}
}