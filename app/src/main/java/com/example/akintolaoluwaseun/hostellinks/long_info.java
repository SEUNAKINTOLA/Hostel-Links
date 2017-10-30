package com.example.akintolaoluwaseun.hostellinks;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by AKINTOLA OLUWASEUN on 7/8/2015.
 */
public class long_info extends AppCompatActivity {
        private TextView mTextView;
        private RelativeLayout mRelativeLayout;
    private WebView mWebView = null;
    private String mInputUrl = null;

       private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.long_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mContext = this;
        mInputUrl = "goo.gl/forms/TUjjFayATn";
        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new HelloWebViewClient());
        String url = mInputUrl;
        mWebView.loadUrl(url);


        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(getIntent().getExtras().getString("thetext"));

        // Intent intent = getIntent();
        //if (intent != null && intent.hasExtra("thetext2")) {
        //  String forecastStr = intent.getStringExtra("thetext2");
        //  ((TextView) findViewById(R.id.textView3))
        //         .setText(forecastStr);  }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
  }



