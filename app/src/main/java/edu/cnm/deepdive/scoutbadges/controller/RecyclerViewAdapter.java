//package edu.cnm.deepdive.scoutbadges.controller;
//
//import static android.view.View.inflate;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.RecyclerView.ViewHolder;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//import de.hdodenhof.circleimageview.CircleImageView;
//import edu.cnm.deepdive.scoutbadges.R;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
//
//  private static final String TAG = "RecyclerViewAdapter";
//
//  private ArrayList<String> mImageNames = new ArrayList<>();
//  private ArrayList<String> mImages = new ArrayList<>();
//  private Context context;
//
//  public RecyclerViewAdapter(ArrayList<String> mImageNames,
//      ArrayList<String> mImages, Context context) {
//    this.mImageNames = mImageNames;
//    this.mImages = mImages;
//    this.context = context;
//  }
//
////  @NonNull
////  @Override
////  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
////    View view = LayoutInflater.from(this).inflate(R.layout.layout_listner, viewGroup, false);
////    ViewHolder holder = new ViewHolder(view);
////    return holder;
////
////  }
//
//  @Override
//  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
//
//  }
//
//  @Override
//  public int getItemCount() {
//    return 0;
//  }
//
//  public class ViewHolder extends RecyclerView.ViewHolder {
//
//  CircleImageView image ;
//  TextView imageName;
//  RelativeLayout parentLayout;
//
//    public ViewHolder(@NonNull View itemView) {
//      super(itemView);
//      image = itemView.findViewById(R.id.badge_image);
//      parentLayout = itemView.findViewById(R.id.parent_layout);
//
//
//
//    }
//  }
//
//}