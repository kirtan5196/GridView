package androidgridview.inducesmile.com.gridview;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.GridView;
public class MainActivity extends Activity {
    GridView gv;
    Context context;
    ArrayList prgmName;
    public static String [] prgmNameList={"C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript","demo"};
    public static int [] prgmImages={R.drawable.demo,R.drawable.demo,R.drawable.demo,R.drawable.demo,R.drawable.demo,R.drawable.demo,R.drawable.demo,R.drawable.demo,R.drawable.demo,R.drawable.demo};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

}