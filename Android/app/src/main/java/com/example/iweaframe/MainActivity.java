package com.example.iweaframe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.facebook.react.ReactFragment;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript. This is used to schedule
     * rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "MyReactNativeApp";
    }
}


/*
public class MainActivity extends AppCompatActivity implements DefaultHardwareBackBtnHandler {
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment reactNativeFragment = new ReactFragment.Builder()
                        .setComponentName("MyReactNativeApp")
                        .setLaunchOptions(getLaunchOptions("test message"))
                        .build();

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.reactNativeFragment, reactNativeFragment)
                        .commit();

            }
        });
    }

    private Bundle getLaunchOptions(String message) {
        Bundle initialProperties = new Bundle();
        initialProperties.putString("message", message);
        return initialProperties;
    }

    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
}

*/