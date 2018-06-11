import android.app.ActionBar;
import android.content.ClipData;
import android.os.Bundle;
import android.view.Manu;
import android.view.ManuItem;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.android.practiceset2.R;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int weekday = 5;
        int weekend = 9;
        int optionaHours = 7*8;
        int actualHours = weekday;
        actualHours = actualHours + weekend * 2;
        int solution = optionaHours - actualHours;
        display(solution);







    }
    @Override
    public boolean onCreateOptionMenu (menu menu){
        //inflate the menu; this adds items to the action bar if it is present
        getMenuIflater().Inflate(R.menu.menu_main);
        //Handles action bar  item click here. the action bar will
        //automatically handle click on the home/up botton, so long
        //as you specify a parent activity in AndroidManifest.xml
        int id = ClipData.Item.getItemId();

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //noinspection SimplyfiableIfStatement
        if (id == R.id.action_settings){
            return true;
        }
        return super onOptionsItemSelected(item);


    }
    public void display (int i){
        TextView t = (TextView)findViewById(R.id.display_text_view);
        t.setText(""+i);
    }

}