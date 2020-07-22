package com.example.abousus_printola;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public CardView c1,c2,c3;
    public WebView wv;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


public void Connect(View view)
{
    switch (view.getId())
    {
        case R.id.card1:
            Intent i1 = new Intent(this,ConnectPage.class);
            i1.putExtra("url","https://www.printola.in/terms-conditions/");
            startActivity(i1);
            break;
        case R.id.card2:
            Intent i2 = new Intent(this,ConnectPage.class);
            i2.putExtra("url","https://www.printola.in/privacy-policy/");
            startActivity(i2);
            break;
        case R.id.card3:
            Intent i3 = new Intent(this,ConnectPage.class);
            i3.putExtra("url","https://www.printola.in/cancellation-refund/");
            startActivity(i3);
            break;

    }
}

}
