package com.example.mpproject;import android.os.Bundle;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import androidx.fragment.app.Fragment;/******************************************* * Created By Jamoldin Abdumutalov on 20/05/2023 ******************************************/public class CommunityScreen extends Fragment {    @Override    public void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);    }    @Override    public View onCreateView(LayoutInflater inflater, ViewGroup container,                             Bundle savedInstanceState) {        // Inflate the layout for this fragment        return inflater.inflate(R.layout.screen_community, container, false);    }}