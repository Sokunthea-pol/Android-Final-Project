package com.uc.thcouseapp.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uc.thcouseapp.Adapter.CoursesAdapter;
import com.uc.thcouseapp.Domain.CoursesDomain;
import com.uc.thcouseapp.R;

import java.util.ArrayList;

public class CoursesListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourceList;
    private RecyclerView recyclerViewCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);

        initRecyclerView();
        }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items= new ArrayList<>();
        items.add(new CoursesDomain("Advanced certification Program in AI", 199, "ic_1", "UI/UX Design"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 99, "ic_2", "UI/UX Design"));
        items.add(new CoursesDomain("Fundamental of java Programming", 49, "ic_3", "UI/UX Design"));
        items.add(new CoursesDomain("Introduction to UI design history", 39, "ic_4", "UI/UX Design"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 299, "ic_5", "UI/UX Design"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 99, "ic_2", "UI/UX Design"));
        items.add(new CoursesDomain("Fundamental of java Programming", 49, "ic_3", "UI/UX Design"));
        items.add(new CoursesDomain("Introduction to UI design history", 39, "ic_4", "UI/UX Design"));
        items.add(new CoursesDomain("Advanced certification Program in AI", 199, "ic_1", "UI/UX Design"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 99, "ic_2", "UI/UX Design"));
        items.add(new CoursesDomain("Fundamental of java Programming", 49, "ic_3", "UI/UX Design"));
        items.add(new CoursesDomain("Introduction to UI design history", 39, "ic_4", "UI/UX Design"));

        recyclerViewCourse=findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        adapterCourceList=new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourceList);


    }

}
