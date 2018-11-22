package pro.forecastanalytics.root.customlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter <CustomAdapter.MyViewHolder>{
    Context context;
    ArrayList<Account> data;

    public CustomAdapter(Context context, ArrayList<Account> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.item_layout,viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        final Account current = data.get(i);
        myViewHolder.txtAccName.setText(current.getName());
        myViewHolder.txtAccNum.setText(current.getAccnumber());
        myViewHolder.txtAccType.setText(current.getType());
        myViewHolder.txtAccBal.setText(current.getBalance() + "");

        myViewHolder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.remove(current);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtAccName;
        TextView txtAccNum;
        TextView txtAccType;
        TextView txtAccBal;
        ImageView imgDelete;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtAccName =itemView.findViewById(R.id.txtAccName);
            txtAccNum =itemView.findViewById(R.id.txtAccNum);
            txtAccType =itemView.findViewById(R.id.txtAccType);
            txtAccBal =itemView.findViewById(R.id.txtAccBal);
            imgDelete =itemView.findViewById(R.id.imgDelete);

        }
    }
}
