package com.sensoftsarl.customtoast;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.sensoftsarl.showcustomtoast.ShowToastUtil;

public class MainActivity extends Activity {

        Context context;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            context=getApplicationContext();
        }


        // Red toast
    public void btnError(View view) {
        ShowToastUtil.error(context,"Exemple de message d'erreur");
    }
    // Yellow toast
    public void btnWarming(View view) {

        ShowToastUtil.warming(context,"Exemple de warming");
    }
    // Blue toast
    public void btnInfo(View view) {

        ShowToastUtil.info(context,"Exemple de message info");
    }


}