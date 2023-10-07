package top.sogrey.localmessagemanager.demo.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import top.sogrey.localmessagemanager.LocalMessage;
import top.sogrey.localmessagemanager.LocalMessageCallback;
import top.sogrey.localmessagemanager.LocalMessageManager;
import top.sogrey.localmessagemanager.demo.MyCustomObject;
import top.sogrey.localmessagemanager.demo.R;

public class MainActivity extends AppCompatActivity implements LocalMessageCallback {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(android.R.id.text1);

        LocalMessageManager.getInstance().addListener(this);
        // You can also listen to a specific message
        // LocalMessageManager.getInstance().addListener(R.id.msg_sample_event, mSimpleMessageListener);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LocalMessageManager.getInstance().removeListener(this);

        // You can also listen to a specific message
        // LocalMessageManager.getInstance().removeListener(R.id.msg_sample_event, mSimpleMessageListener);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void handleMessage(@NonNull final LocalMessage msg) {
        switch (msg.getId()) {
            case R.id.msg_sample_event : {
                mTextView.setText("Received simple event (" + System.currentTimeMillis() / 100 + ")");
            }
            break;
            case R.id.msg_custom_payload_event : {
                mTextView.setText("Received custom object (" + ((MyCustomObject)msg.getObject()).getSomeValue() + ")");
            }
        }
    }

    /*
    // Listener for specific message ID

    private static Handler.Callback mSimpleMessageListener = new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            return false;
        }
    };

    */

}
