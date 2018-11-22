package pro.forecastanalytics.root.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView listAccounts;
    ArrayList<Account> data;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAccounts=findViewById(R.id.listAccounts);
        data=new ArrayList<>();

        Account acc1=new Account("ACC001","John Mark", 700, "Current");
        Account acc2=new Account("ACC002","Peter Mark", 800, "Savings");
        Account acc3=new Account("ACC003","Josh Marky", 900, "Student");
        Account acc4=new Account("ACC004","Mr Tosh", 500, "Studnet");
        Account acc5=new Account("ACC004","Kilk Partrick", 600, "Current");
        Account acc6=new Account("ACC005","Richard Nonton", 1000, "Current");

        data.add(acc1);
        data.add(acc2);
        data.add(acc3);
        data.add(acc4);
        data.add(acc5);
        data.add(acc6);

        adapter =new CustomAdapter(this, data);

        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this);
        listAccounts.setLayoutManager(layoutManager);
        listAccounts.setAdapter(adapter);

    }

}
