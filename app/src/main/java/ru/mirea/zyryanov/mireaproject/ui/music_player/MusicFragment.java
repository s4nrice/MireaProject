package ru.mirea.zyryanov.mireaproject.ui.music_player;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.mirea.zyryanov.mireaproject.R;
public class MusicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_music, container, false);
        view.findViewById(R.id.playButton).setOnClickListener(this::onClickPlayMusic);
        view.findViewById(R.id.stopButton).setOnClickListener(this::onClickStopMusic);

        return view;
    }

    public void onClickPlayMusic(View view) {
        getActivity().startService(new Intent(getActivity(), PlayerService.class));
    }

    public void onClickStopMusic(View view) {
        getActivity().stopService(new Intent(getActivity(), PlayerService.class));
    }
}