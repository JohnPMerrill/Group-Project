package edu.uml.cs.jmerrill.fridge_friend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class ItemInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_info);

        Intent thisIntent = getIntent();
        final UpcItem upcItem = (UpcItem) getIntent().getSerializableExtra("upcItem");

        TextView tvItemName = (TextView) findViewById(R.id.tv_item_name);
        tvItemName.setText(upcItem.getName());

        TextView tvDateAdded = (TextView) findViewById(R.id.tv_date_added);
        tvDateAdded.setText(upcItem.getDateAdded().toString());

        TextView tvItemType = (TextView) findViewById(R.id.tv_item_type);
        tvItemType.setText(upcItem.getItemType().toString());

        TextView tvExpirationDate = (TextView) findViewById(R.id.tv_expiration_date);
        tvExpirationDate.setText(upcItem.getExpDate().toString());

        Button btnRemoveItem = (Button) findViewById(R.id.btn_remove_item);
        btnRemoveItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
