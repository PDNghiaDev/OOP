package com.gmail.pdnghiadev.oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView shape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shape = (TextView) findViewById(R.id.shape);
        StringBuffer b = new StringBuffer();

        Circle c = new Circle(1);
        b.append(c.draw());

        Rectangle r = new Rectangle(3, 4);
        b.append("\n");
        b.append(r.draw());

        Square s = new Square(4);
        b.append("\n");
        b.append(s.draw());

        Hexagon h = new Hexagon(3.5);
        b.append("\n");
        b.append(h.draw());

        shape.setText(b);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
