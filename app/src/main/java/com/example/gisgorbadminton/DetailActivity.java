package com.example.gisgorbadminton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
        TextView datanama,dataalamat,datatelpn;
        Button btncall;
        ImageView datagambar;
        public static String id,nama,telpn,gambar,alamat;
        public static Double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama = findViewById(R.id.tv_nama);
        dataalamat = findViewById(R.id.tv_alamat);
        datatelpn = findViewById(R.id.tv_tel);
        btncall = findViewById(R.id.btn_call);
        datagambar = findViewById(R.id.img_data);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datatelpn.setText(telpn);
        Picasso.get().load(gambar).into(datagambar);

        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent call =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telpn));
        startActivity(call);
    }
}
