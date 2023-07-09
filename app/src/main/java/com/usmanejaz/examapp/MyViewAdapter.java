package com.usmanejaz.examapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyViewAdapter extends ArrayAdapter<Question> {

    public MyViewAdapter(@NonNull Context context, List<Question> studentArrayList)
    {super(context, 0, studentArrayList);}

    @SuppressLint("ResourceAsColor")
    @Override public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Question student = getItem(position);
        convertView = LayoutInflater.from(getContext()).
                inflate(R.layout.mylistviewlayout, parent, false);
        TextView textViewQuestion =  convertView.findViewById(R.id.textViewQuestion);
        TextView textViewQuestionNo = convertView.findViewById(R.id.textViewQuestionNo);
        TextView textViewCorrectAnswer = convertView.findViewById(R.id.textViewCorrectAnswer);
        TextView textViewStatus = convertView.findViewById(R.id.textViewStatus);

        textViewQuestion.setText(student.question);
        textViewQuestionNo.setText("Question " + student.questionNo );
        textViewCorrectAnswer.setText("Correct ans:" + student.correctAnswer);
        textViewStatus.setText(student.status);
        return convertView;
    }


}