package com.example.pmbi002.myapplication;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import android.widget.Toast;




import com.example.pmbi002.myapplication.R;

import com.wikitude.architect.ArchitectView;


public class MainActivity extends AppCompatActivity {

    private ArchitectView architectView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        this.architectView = (ArchitectView)this.findViewById( R.id.architectView ); // Just set it directly to the id of the ArchitectView as defined in the activity_main layout






		/* pass SDK key if you have one, this one is only valid for this package identifier and must not be used somewhere else */



        final ArchitectView.ArchitectConfig config = new ArchitectView.ArchitectConfig("tRfHV4gw5mvPhQR9ZTg0mInfgXj8bPxaQNgobEl14Qwklawk4Q02Aku9/9Vx9j8aJjCNzof+eoCk85b5zd9HynEK8YoyLB60DklHE27hxn4RdsXfLteXQ+yAPbTEerT1o9ChjepokIXzMq/6wRD0gFhf/W/qdKtzq8QEkNI5UGVTYWx0ZWRfX/VpJsrBt+eHZHZouTnG5t2K2ckTijCmsPjKcZaXesdAfrEXDQZvJmlOMTrjg+ztJdFVm4ZP5g8Gbb3zDSmwaH4ONmpJI0NgQsKlozr6vTfvk6vLKLODFCmQXjWXgC35muHwM/61xpTQF1TYhJauXIHJ4oS0UtXubCxmFcBnSVhiK2WdFj1giv7Zg1Qj2Mqy5HTjIoiUI9I9OrM/v2/fim1lsWGV+TTrwwsKRFDDN5F2kSV+PcXULWlsATpK1TY0ZUgLn8nt1jHdLUj4FTACHjLeasljVKJb5V02D/3dMe68E1Vcs0fhKY5OSIg1w8s5ecIMDqhNywOAs6n6lbzoprJ8aMyxpDXadtkx2YRYFsNWa7UX6kpl+zwCa0oFCpLpQHTwoC8T7AkxmUSKjy2XLp3J3SpSUGHlb9Oc4HM4irwq47RMR4BIZtLNjqUIwjP0iFLGcVquEVcF59hvUbASE1aGFy/y0keRRLDsigvqTJsR98DcIxkZiIE=" ); // You can just insert the licence key directly.


        try {


		/* first mandatory life-cycle notification */



            this.architectView.onCreate( config );


        } catch (RuntimeException rex) {

            this.architectView = null;

            Toast.makeText(getApplicationContext(), "can't create Architect View", Toast.LENGTH_SHORT).show();

            Log.e(this.getClass().getName(), "Exception in ArchitectView.onCreate()", rex);

        }

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        architectView.onPostCreate();

        try {
            this.architectView.load("");
        } catch (Exception e) {

        }

    }

    @Override
    protected void onResume() {
        super.onResume();

        architectView.onResume();
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();

        architectView.onDestroy();

    }

    @Override
    protected void onPause () {
        super.onPause();

        architectView.onPause();
    }

}


