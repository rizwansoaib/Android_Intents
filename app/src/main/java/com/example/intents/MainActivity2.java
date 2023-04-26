package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    Button browse;

    EditText editText;
    int duration = Toast.LENGTH_LONG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn=findViewById(R.id.button2);
        browse=findViewById(R.id.browse);
        editText=findViewById(R.id.urlText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent read1=new Intent();
                read1.setAction(Intent.ACTION_VIEW);
                read1.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(read1);
                Context context = getApplicationContext();
                CharSequence text = "Implicit Intent Contacts started";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=editText.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence text = "Implicit Intent Browser started";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }
}