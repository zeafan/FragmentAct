package com.example.mohamedg.fragmentact;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Customer currentCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        tabLayout = findViewById(R.id.tabLayer);
        viewPager = findViewById(R.id.viewpage);
        FragmentPagerAdpter fragmentPagerAdpter = new FragmentPagerAdpter(getSupportFragmentManager());
        fragmentPagerAdpter.addFragment(new Fragment1(), "General");
        fragmentPagerAdpter.addFragment(new Fragment2(),"Address");
        fragmentPagerAdpter.addFragment(new Fragment3(), "General");
        fragmentPagerAdpter.addFragment(new Fragment4(),"Address");
        fragmentPagerAdpter.addFragment(new Fragment5(), "General");

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(fragmentPagerAdpter);
        currentCustomer=new Customer();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_settings,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_close:
                startActivity(new Intent(this,Main2Activity.class));
//                Toast.makeText(this, currentCustomer.LatinName, Toast.LENGTH_SHORT).show();
//                Toast.makeText(this, currentCustomer.Notes, Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_save:
                Toast.makeText(this, currentCustomer.Name, Toast.LENGTH_SHORT).show();
                Toast.makeText(this, currentCustomer.BarCode, Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this, "PostResume_activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "onResume_activity", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onResumeFragments() {
        Toast.makeText(this, "onResumeFragments_activity", Toast.LENGTH_SHORT).show();
        super.onResumeFragments();
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "start_activity", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "Pause_activity", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop_activity", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy_activity", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
