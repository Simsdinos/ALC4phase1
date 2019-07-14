package deno.sims.alc4phase1;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ABOUT extends AppCompatActivity {
    String url="https://andela.com/alc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView myWebview=findViewById(R.id.webview);
    myWebview.getSettings().setJavaScriptEnabled(true);
    myWebview.loadUrl("https://andela.com/alc/");
    myWebview.clearSslPreferences();
    myWebview.measure(100,100);
    myWebview.getSettings().setUseWideViewPort(true);
    myWebview.getSettings().setLoadWithOverviewMode(true);
    myWebview.setWebViewClient(new WebViewClient()
    {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    });


    }

}
