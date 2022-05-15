package com.example.todoapp.Activity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import com.example.todoapp.Model.Task;
import com.example.todoapp.Model.TaskViewModel;
import com.example.todoapp.R;
import com.example.todoapp.Data.Repository;
import com.example.todoapp.Utils.DateUtils;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;
import java.util.Date;

public class AddTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_add_task);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_layout, new AddTaskFragment());
        ft.commit();
    }

}
