package com.example.nut.samplerecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nut.samplerecyclerview.R;
import com.example.nut.samplerecyclerview.model.ItemObject;

import java.util.List;

/**
 * Created by nut on 9/6/2559.
 */
public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder > {

    private final int NORMAL_VIEW_TYPE = 1;
    private final int ADVANCE_VIEW_TYPE = 2;

    private List<ItemObject> listData;
    private LayoutInflater inflater;
    private ItemObject itemObject;

    public ItemAdapter(List<ItemObject> listData, Context context) {
        this.listData = listData;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder  onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == NORMAL_VIEW_TYPE) {
            View view = inflater.inflate(R.layout.list_item, parent, false);
            return new ItemHolder(view);
        } else {
//            retirm
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder  holder, int position) {
        if(holder instanceof ItemHolder) {
            ItemHolder itemHolder = (ItemHolder) holder;
            itemObject = this.listData.get(position);
            itemHolder.title.setText(itemObject.getDetail());
            itemHolder.icon.setImageResource(itemObject.getIcon());
        }else{

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (listData.size() % 2 == 0) {
            return NORMAL_VIEW_TYPE;
        } else {
            return ADVANCE_VIEW_TYPE;
        }
    }

    @Override
    public int getItemCount() {
        return this.listData.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder {
        private RecyclerView container;
        private ImageView icon;
        private TextView title;

        public ItemHolder(View itemView) {
            super(itemView);
            icon = (ImageView) itemView.findViewById(R.id.image_icon);
            title = (TextView) itemView.findViewById(R.id.list_item_text_view);
            container = (RecyclerView) itemView.findViewById(R.id.recycler_view_container);
        }
    }
}
