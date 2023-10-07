package top.sogrey.localmessagemanager.demo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import top.sogrey.localmessagemanager.LocalMessageManager;
import top.sogrey.localmessagemanager.demo.MyCustomObject;
import top.sogrey.localmessagemanager.demo.R;

public class TestFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_fire).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocalMessageManager.getInstance().send(R.id.msg_sample_event);
            }
        });

        view.findViewById(R.id.btn_fire_custom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocalMessageManager.getInstance().send(R.id.msg_custom_payload_event, new MyCustomObject());
            }
        });
    }
}
