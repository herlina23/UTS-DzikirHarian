package com.herlina.utscoba2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class Media extends AppCompatActivity {

    VideoView videoView;
    ListView listView;

    ArrayList<String> listVideo;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        videoView = (VideoView) findViewById(R.id.videoView);
        listView =  (ListView) findViewById(R.id.listView);



        listVideo = new ArrayList<>();
        listVideo.add("Anak Suamiku Anakku tapi Bukan Anakku");
        listVideo.add("Vlog Sumanto");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, SinetronModel.drama);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                SinetronModel sinetronModel = SinetronModel.drama[(int )id];

                Uri videoUri = dapatkanMedia(sinetronModel.getVideoRawId());
                buatPlayer(videoUri);


            }

            private Uri dapatkanMedia(String namaMedia){
                return Uri.parse("android.resource://" + getPackageName() +
                        "/raw/" + namaMedia);
            }
            private void buatPlayer(Uri videoUri){
                videoView.setVideoURI(videoUri);
                videoView.setMediaController(new MediaController(Media.this));

                videoView.requestFocus();
                videoView.start();
            }


        });
    }
}
